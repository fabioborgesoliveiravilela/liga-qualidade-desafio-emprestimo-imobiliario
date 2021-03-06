package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.GenericInstanceDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProponentDTO;

public class ProponentValidator {

	public List<String> validate(List<GenericInstanceDTO> list) {
		if (list == null || list.isEmpty()) {
			return new ArrayList<>();
		}
		List<ProponentDTO> proponents = new ArrayList<>();
		list.forEach(ins -> proponents.add((ProponentDTO) ins));
		return this.validateList(proponents);
	}

	private List<String> validateList(List<ProponentDTO> proponents) {

		Map<String, List<ProponentDTO>> groupedProponents = groupingProponentsByProposalId(proponents);
		List<String> validatedProponents = new ArrayList<>();
		for (String proposalId : groupedProponents.keySet()) {
			var proponentsById = groupedProponents.get(proposalId);

			Optional<ProponentDTO> optionalProponent = findMainProponent(proponentsById);
			if (hasMoreThan1ProponentAndMainProponentAndAgeGreaterThan18(proponentsById, optionalProponent)) {
				validatedProponents.add(proposalId);
			}
		}

		return validatedProponents;
	}

	private boolean hasMoreThan1ProponentAndMainProponentAndAgeGreaterThan18(List<ProponentDTO> proponentsById,
			Optional<ProponentDTO> optionalProponent) {
		return proponentsById.size() > 1 && optionalProponent.isPresent() && optionalProponent.get().getAge() >= 18;
	}

	private Optional<ProponentDTO> findMainProponent(List<ProponentDTO> proponentsById) {
		return proponentsById.stream().filter(p -> p.isMain()).findFirst();
	}

	private Map<String, List<ProponentDTO>> groupingProponentsByProposalId(List<ProponentDTO> proponents) {
		return proponents.stream().collect(Collectors.groupingBy(p -> p.getProposalId()));
	}
}
