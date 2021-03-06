package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

public class WarrantyGenericDTO extends GenericInstanceDTO {

	private String id;

	public WarrantyGenericDTO() {
		super();
	}

	public WarrantyGenericDTO(String eventId, String eventSchema, String eventAction, String eventTime,
			String proposalId, String warrantyId) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId);
		this.id = warrantyId;
	}

	public String getId() {
		return id;
	}

	public void setId(String warrantyId) {
		this.id = warrantyId;
	}

	@Override
	public String toString() {
		return "WarrantyGenericDTO [id=" + id + ", getEventId()=" + getEventId() + ", getEventSchema()="
				+ getEventSchema() + ", getEventAction()=" + getEventAction() + ", getEventTime()=" + getEventTime()
				+ ", getProposalId()=" + getProposalId() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}