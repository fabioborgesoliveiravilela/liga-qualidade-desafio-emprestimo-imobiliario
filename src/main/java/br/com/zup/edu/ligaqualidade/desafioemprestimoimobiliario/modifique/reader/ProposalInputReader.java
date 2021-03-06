package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.reader;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProponentDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.ProposalDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.WarrantyDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ProposalInputReader {

    private static final Pattern pattern = Pattern.compile(",");

    public ProposalInputReader() {
        super();
    }

    public List<ProposalDTO> read(List<String> rows) {

        List<ProposalDTO> proposals = new ArrayList<>();

        ProposalDTO proposal = null;
        for (String row : rows) {

            String[] columns = row.split(",");
            switch (columns[1]) {
                case "proposal":
                    proposal = createProposal(columns);
                    proposals.add(proposal);
                    break;
                case "proponent":
                    proposal.add(createProponent(columns));
                    break;
                case "warranty":
                    proposal.add(createWarranty(columns));
                    break;
                default:
                    throw new IllegalArgumentException(columns[1]);
            }
        }

        return proposals;
    }

    private ProposalDTO createProposal(String[] columns) {
        return new ProposalDTO(columns[0], columns[1], columns[2], columns[3], columns[4], new BigDecimal(columns[5]),
                Integer.parseInt(columns[6]));
    }

    private ProponentDTO createProponent(String[] columns) {
        return new ProponentDTO(columns[0], columns[1], columns[2], columns[3], columns[4], //
                columns[5], columns[6], Integer.parseInt(columns[7]), new BigDecimal(columns[8]),
                Boolean.parseBoolean(columns[9]));
    }

    private WarrantyDTO createWarranty(String[] columns) {
        return new WarrantyDTO(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5], new BigDecimal(columns[6]),
                columns[7]);
    }
}
