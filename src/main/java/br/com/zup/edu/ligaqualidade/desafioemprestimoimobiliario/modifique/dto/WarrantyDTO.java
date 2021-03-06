package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

import java.math.BigDecimal;

public class WarrantyDTO extends WarrantyGenericDTO {

	private BigDecimal value;

	private String province;

	public WarrantyDTO() {
		super();
	}

	public WarrantyDTO(String eventId, String eventSchema, String eventAction, //
			String eventTime, String proposalId,//
			String warrantyId, BigDecimal warrantyValue, String warrantyProvince) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId, warrantyId);
		this.value = warrantyValue;
		this.province = warrantyProvince;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal warrantyValue) {
		this.value = warrantyValue;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String warrantyProvince) {
		this.province = warrantyProvince;
	}

	@Override
	public String toString() {
		return "WarrantyDTO [value=" + value + ", province=" + province + ", getId()=" + getId() + ", getEventId()="
				+ getEventId() + ", getEventSchema()=" + getEventSchema() + ", getEventAction()=" + getEventAction()
				+ ", getEventTime()=" + getEventTime() + ", getProposalId()=" + getProposalId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
