package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators;

import java.math.BigDecimal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.YearConverterUtil;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;

public class ProposalValidator {

	public String validate(ProposalDTO proposal) {

		if (hasLoanValueRangeValid(proposal) && hasYearRangeValid(proposal)) {
			return proposal.getProposalId();
		}

		return "";
	}

	private boolean hasYearRangeValid(ProposalDTO proposal) {
		return proposal.getNumberMonthlyInst() >= YearConverterUtil.convertYearToMonth(2)
				&& proposal.getNumberMonthlyInst() <= YearConverterUtil.convertYearToMonth(15);
	}

	private boolean hasLoanValueRangeValid(ProposalDTO proposal) {
		return proposal.getLoanValue().compareTo(BigDecimal.valueOf(30000)) > 0
				&& proposal.getLoanValue().compareTo(BigDecimal.valueOf(3000000)) > 0;
	}
}
