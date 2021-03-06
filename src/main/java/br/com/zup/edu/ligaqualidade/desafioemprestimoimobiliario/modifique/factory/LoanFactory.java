package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.factory;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.GenericInstanceDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProponentDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.WarrantyDTO;

public class LoanFactory implements AbstractFactory<GenericInstanceDTO> {

	private static final Pattern pattern = Pattern.compile(",");

	public LoanFactory() {
		super();
	}

	@Override
	public GenericInstanceDTO create(String row) {
		String[] line = pattern.split(row);
		if ("proposal".equalsIgnoreCase(line[1])) {
			return new ProposalDTO(line[0], line[1], line[2], line[3], line[4], new BigDecimal(line[5]),
					Integer.parseInt(line[6]));
		} else if ("warranty".equalsIgnoreCase(line[1])) {
			return new WarrantyDTO(line[0], line[1], line[2], line[3], line[4], line[5], new BigDecimal(line[6]),
					line[7]);
		} else if ("proponent".equalsIgnoreCase(line[1])) {
			return new ProponentDTO(line[0], line[1], line[2], line[3], line[4], // 
					line[4], line[4], Integer.parseInt(line[5]), new BigDecimal(line[5]),
					Boolean.parseBoolean(line[6]));
		}
		return null;
	}

}
