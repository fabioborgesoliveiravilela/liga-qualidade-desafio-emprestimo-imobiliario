package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

import java.math.BigDecimal;

public class ProposalDTO extends GenericInstanceDTO {

	private BigDecimal loanValue;
	private int numberMonthlyInst;

	public ProposalDTO() {
		super();
	}

	public ProposalDTO(BigDecimal loanValue, int mntIns) {
		super();
		this.loanValue = loanValue;
		this.numberMonthlyInst = mntIns;
	}

	public ProposalDTO(String eventId, String eventSchema, String eventAction, //
			String eventTime, String proposalId, //
			BigDecimal loanValue, int mntIns) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId);
		this.loanValue = loanValue;
		this.numberMonthlyInst = mntIns;
	}

	public BigDecimal getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(BigDecimal proposalLoanValue) {
		this.loanValue = proposalLoanValue;
	}

	public int getNumberMonthlyInst() {
		return numberMonthlyInst;
	}

	public void setNumberMonthlyInst(int proposalMntIns) {
		this.numberMonthlyInst = proposalMntIns;
	}

	@Override
	public String toString() {
		return "ProposalDTO [loanValue=" + loanValue + ", mntIns=" + numberMonthlyInst + ", getEventId()=" + getEventId()
				+ ", getEventSchema()=" + getEventSchema() + ", getEventAction()=" + getEventAction()
				+ ", getEventTime()=" + getEventTime() + ", getProposalId()=" + getProposalId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
