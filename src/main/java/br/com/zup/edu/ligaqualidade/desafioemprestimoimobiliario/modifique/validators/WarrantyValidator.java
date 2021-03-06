package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.WarrantyDTO;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class WarrantyValidator {

    public void validate(ProposalDTO proposal) {
        List<WarrantyDTO> warrantieis = proposal.getWarrantieis();

        if (warrantieis.size() < 1) {
            throw new IllegalArgumentException("Deve haver no mínimo 1 garantia de imóvel por proposta");
        }

        BigDecimal doubleLoanValue = proposal.getLoanValue().multiply(BigDecimal.valueOf(2));
        if (warrantieis.stream().map(it -> it.getValue()).reduce(BigDecimal.ZERO, BigDecimal::add).compareTo(doubleLoanValue) == -1) {
            throw new IllegalArgumentException("A soma do valor das garantias deve ser maior ou igual ao dobro do valor do empréstimo");
        }

        if(warrantieis.stream().filter(it -> Arrays.asList("PR","SC","RS").contains(it.getProvince())).count() > 0){
            throw new IllegalArgumentException("As garantias de imóvel dos estados PR, SC e RS não são aceitas");
        }
    }
}
