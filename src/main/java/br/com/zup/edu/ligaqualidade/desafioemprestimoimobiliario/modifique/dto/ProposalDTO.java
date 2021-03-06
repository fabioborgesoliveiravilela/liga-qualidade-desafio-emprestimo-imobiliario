package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProposalDTO extends GenericInstanceDTO {

    private final BigDecimal loanValue;
    private final int numberMonthlyInst;
    List<ProponentDTO> proponents;
    List<WarrantyDTO> warrantieis;

    public ProposalDTO(String eventId, String eventSchema, String eventAction, //
                       String eventTime, String proposalId, //
                       BigDecimal loanValue, int mntIns) {
        super(eventId, eventSchema, eventAction, eventTime, proposalId);
        this.loanValue = loanValue;
        this.numberMonthlyInst = mntIns;
        this.proponents = new ArrayList<>();
        this.warrantieis = new ArrayList<>();
    }

    public BigDecimal getLoanValue() {
        return loanValue;
    }

    public int getNumberMonthlyInst() {
        return numberMonthlyInst;
    }

    public List<ProponentDTO> getProponents() {
        return proponents;
    }

    public List<WarrantyDTO> getWarrantieis() {
        return warrantieis;
    }

    public void add(ProponentDTO proponent) {
        proponents.add(proponent);
    }

    public void add(WarrantyDTO warranty) {
        warrantieis.add(warranty);
    }

    public BigDecimal getInstallmentValue() {
        return loanValue.divide(BigDecimal.valueOf(loanValue.longValue()));
    }

    @Override
    public String toString() {
        return "ProposalDTO [loanValue=" + loanValue + ", mntIns=" + numberMonthlyInst + ", getEventId()=" + getEventId()
                + ", getEventSchema()=" + getEventSchema() + ", getEventAction()=" + getEventAction()
                + ", getEventTime()=" + getEventTime() + ", getProposalId()=" + getProposalId() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
