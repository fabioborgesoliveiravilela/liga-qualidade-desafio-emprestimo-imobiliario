package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

public class WarrantyDeleteDTO extends WarrantyGenericDTO {

	public WarrantyDeleteDTO() {
		super();
	}

	public WarrantyDeleteDTO(String eventId, String eventSchema, String eventAction, String eventTime,
			String proposalId, String warrantyId) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId, warrantyId);
	}

	@Override
	public String toString() {
		return "WarrantyDeleteDTO [getId()=" + getId() + ", getEventId()=" + getEventId() + ", getEventSchema()="
				+ getEventSchema() + ", getEventAction()=" + getEventAction() + ", getEventTime()=" + getEventTime()
				+ ", getProposalId()=" + getProposalId() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
