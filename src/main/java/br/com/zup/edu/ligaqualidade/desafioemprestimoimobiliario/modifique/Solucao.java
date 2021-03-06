package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.reader.ProposalInputReader;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.validators.ProposalValidator;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.writer.ProposalOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class Solucao {

    private static final ProposalInputReader proposalInputReader = new ProposalInputReader();

    private static final ProposalOutputWriter proposalOutputWriter = new ProposalOutputWriter();

    private static final ProposalValidator PROPOSAL_VALIDATOR = new ProposalValidator();

    public static String processMessages(List<String> rows) {

        List<ProposalDTO> proposals = proposalInputReader.read(rows);

        List<CharSequence> proposalsValidate = new ArrayList<>();

        for (ProposalDTO proposal : proposals) {
            try {
                proposalsValidate.add(PROPOSAL_VALIDATOR.validate(proposal).getProposalId());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return String.join(",", proposalsValidate);
    }
}
