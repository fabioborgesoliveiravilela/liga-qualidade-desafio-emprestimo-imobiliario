package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.YearConverterUtil;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;

import java.math.BigDecimal;

public class ProposalValidator {

    private final ProponentValidator proponentValidator = new ProponentValidator();
    private final WarrantyValidator warrantyValidator = new WarrantyValidator();

    public ProposalDTO validate(ProposalDTO proposal) {

        if (proposal.getLoanValue().compareTo(BigDecimal.valueOf(30000L)) == -1 ||
                proposal.getLoanValue().compareTo(BigDecimal.valueOf(3000000L)) == 1) {
            throw new IllegalArgumentException("O valor do empréstimo deve estar entre R$ 30.000,00 e R$ 3.000.000,00");
        }

        if (proposal.getNumberMonthlyInst() < YearConverterUtil.convertYearToMonth(2)
                && proposal.getNumberMonthlyInst() > YearConverterUtil.convertYearToMonth(15)) {
            throw new IllegalArgumentException("O empréstimo deve ser pago em no mínimo 2 anos e no máximo 15 anos");
        }

        proponentValidator.validate(proposal);

        warrantyValidator.validate(proposal);

        return proposal;
    }
}
