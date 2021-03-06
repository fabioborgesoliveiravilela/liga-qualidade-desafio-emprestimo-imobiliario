package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.GenericInstanceDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators.ProponentValidator;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators.ProposalValidator;

public class AddresserFactory {

	private final ProposalValidator proposalValidator = new ProposalValidator();

	private final ProponentValidator proponentValidator = new ProponentValidator();

	public String addressAccordingEventSchema(List<GenericInstanceDTO> objects) {
		Map<String, List<GenericInstanceDTO>> genericInstancesGroupedBySchema = groupingByEventSchema(objects);
		List<String> proposalIdsValidated = new ArrayList<>();
		for (String eventType : genericInstancesGroupedBySchema.keySet()) {
			switch (eventType) {
			case "proposal":
				List<GenericInstanceDTO> proposals = genericInstancesGroupedBySchema.get(eventType);
				proposals.stream().forEach(prop -> {
					proposalIdsValidated.add(proposalValidator.validate((ProposalDTO) prop));
				});
				break;
			case "warranty":
				break;
			case "proponent":
				List<GenericInstanceDTO> proponents = genericInstancesGroupedBySchema.get(eventType);
				proposalIdsValidated.addAll(proponentValidator.validate(proponents));
				break;
			default:
				throw new IllegalArgumentException("Unexpected type: " + eventType);
			}

		}

		return proposalIdsValidated.isEmpty() ? "" : validatedProposalIdsSeparatedByComma(proposalIdsValidated);
	}

	private boolean isNotEmpty(String id) {
		return id != null && id.length() > 0;
	}

	private String validatedProposalIdsSeparatedByComma(List<String> proposalIdsValidated) {
		StringJoiner validProposal = new StringJoiner(",");
		proposalIdsValidated.stream().forEach(id -> {
			if (isNotEmpty(id)) {
				validProposal.add(id);
			}
		});
		return validProposal.toString();
	}

	private static Map<String, List<GenericInstanceDTO>> groupingByEventSchema(List<GenericInstanceDTO> objects) {
		return objects.stream().collect(Collectors.groupingBy(inst -> inst.getEventSchema()));
	}
}
