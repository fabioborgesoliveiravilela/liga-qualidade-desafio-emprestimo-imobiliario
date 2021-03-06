package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

import java.math.BigDecimal;

public class WarrantyDTO extends GenericInstanceDTO {

    private final String id;

    private final BigDecimal value;

    private final String province;

    public WarrantyDTO(String eventId, String eventSchema, String eventAction,
                       String eventTime, String proposalId,
                       String warrantyId, BigDecimal warrantyValue, String warrantyProvince) {
        super(eventId, eventSchema, eventAction, eventTime, proposalId);
        this.id = warrantyId;
        this.value = warrantyValue;
        this.province = warrantyProvince;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "WarrantyDTO [value=" + value + ", province=" + province + ", getId()=" + getId() + ", getEventId()="
                + getEventId() + ", getEventSchema()=" + getEventSchema() + ", getEventAction()=" + getEventAction()
                + ", getEventTime()=" + getEventTime() + ", getProposalId()=" + getProposalId() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}
