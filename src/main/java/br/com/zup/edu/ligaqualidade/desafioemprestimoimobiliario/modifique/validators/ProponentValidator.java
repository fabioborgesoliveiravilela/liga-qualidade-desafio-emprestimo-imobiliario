package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProponentDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;

import java.math.BigDecimal;
import java.util.List;

public class ProponentValidator {

    public void validate(ProposalDTO proposal) {

        List<ProponentDTO> proponents = proposal.getProponents();

        if (proponents.size() < 2) {
            throw new IllegalArgumentException("Deve haver no mínimo 2 proponentes por proposta");
        }

        if (proponents.stream().filter(it -> it.isMain()).count() > 1) {
            throw new IllegalArgumentException("Deve haver exatamente 1 proponente principal por proposta");
        }

        if (proponents.stream().filter(it -> it.getAge() < 18).count() > 1) {
            throw new IllegalArgumentException("Todos os proponentes devem ser maiores de 18 anos");
        }

        proponents.stream().filter(it -> it.isMain()).forEach(it ->
                {
                    BigDecimal monthlyIncome = it.getMonthlyIncome();
                    Integer age = it.getAge();

                    if (age >= 18 && age <= 24 && monthlyIncome.multiply(BigDecimal.valueOf(4)).compareTo(proposal.getInstallmentValue()) >= 1) {

                        throw new IllegalArgumentException("A renda do proponente principal deve ser pelo menos 4 vezes o valor da parcela do empréstimo");
                    } else if (age >= 25 && age <= 50 && monthlyIncome.multiply(BigDecimal.valueOf(3)).compareTo(proposal.getInstallmentValue()) >= 1) {

                        throw new IllegalArgumentException("A renda do proponente principal deve ser pelo menos 3 vezes o valor da parcela do empréstimo");
                    } else if (monthlyIncome.multiply(BigDecimal.valueOf(2)).compareTo(proposal.getInstallmentValue()) >= 1) {

                        throw new IllegalArgumentException("A renda do proponente principal deve ser pelo menos 2 vezes o valor da parcela do empréstimo");
                    }
                }
        );
    }
}
