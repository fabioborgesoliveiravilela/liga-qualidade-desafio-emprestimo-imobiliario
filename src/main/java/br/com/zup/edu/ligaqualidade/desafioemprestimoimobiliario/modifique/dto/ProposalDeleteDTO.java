package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

public class ProposalDeleteDTO extends GenericInstanceDTO {

	public ProposalDeleteDTO() {
		super();
	}

	public ProposalDeleteDTO(String eventId, String eventSchema, String eventAction, String eventTime,
			String proposalId) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId);
	}

	@Override
	public String toString() {
		return "ProposalDeleteDTO [getEventId()=" + getEventId() + ", getEventSchema()=" + getEventSchema()
				+ ", getEventAction()=" + getEventAction() + ", getEventTime()=" + getEventTime() + ", getProposalId()="
				+ getProposalId() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
