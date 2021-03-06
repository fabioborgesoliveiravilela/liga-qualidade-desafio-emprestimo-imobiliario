package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

public class GenericInstanceDTO {

	private String eventId;
	private String eventSchema;
	private String eventAction;
	private String eventTime;
	private String proposalId;

	public GenericInstanceDTO() {
		super();
	}

	public GenericInstanceDTO(String eventId, String eventSchema, String eventAction, String eventTime,
			String proposalId) {
		super();
		this.eventId = eventId;
		this.eventSchema = eventSchema;
		this.eventAction = eventAction;
		this.eventTime = eventTime;
		this.proposalId = proposalId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventSchema() {
		return eventSchema;
	}

	public void setEventSchema(String eventSchema) {
		this.eventSchema = eventSchema;
	}

	public String getEventAction() {
		return eventAction;
	}

	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getProposalId() {
		return proposalId;
	}

	public void setProposalId(String proposalId) {
		this.proposalId = proposalId;
	}

	@Override
	public String toString() {
		return "GenericInstanceDTO [eventId=" + eventId + ", eventSchema=" + eventSchema + ", eventAction="
				+ eventAction + ", eventTime=" + eventTime + ", proposalId=" + proposalId + "]";
	}
}
