package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

public abstract class GenericInstanceDTO {

    private String eventId;
    private String eventSchema;
    private String eventAction;
    private String eventTime;
    private String proposalId;

    public GenericInstanceDTO(String eventId, String eventSchema, String eventAction, String eventTime, String proposalId) {
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

    public String getEventSchema() {
        return eventSchema;
    }

    public String getEventAction() {
        return eventAction;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getProposalId() {
        return proposalId;
    }

    @Override
    public String toString() {
        return "GenericInstanceDTO [eventId=" + eventId + ", eventSchema=" + eventSchema + ", eventAction="
                + eventAction + ", eventTime=" + eventTime + ", proposalId=" + proposalId + "]";
    }
}
