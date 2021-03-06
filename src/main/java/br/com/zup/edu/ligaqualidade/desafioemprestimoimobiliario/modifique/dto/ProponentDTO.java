package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto;

import java.math.BigDecimal;

public class ProponentDTO extends GenericInstanceDTO {

	private String id;

	private String name;

	private int age;

	private BigDecimal monthlyIncome;

	private boolean isMain;

	public ProponentDTO(String eventId, String eventSchema, String eventAction, //
			String eventTime, String proposalId, //
			String id, String name, int age, BigDecimal monthlyIncome, boolean isMain) {
		super(eventId, eventSchema, eventAction, eventTime, proposalId);
		this.id = id;
		this.name = name;
		this.age = age;
		this.monthlyIncome = monthlyIncome;
		this.isMain = isMain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	@Override
	public String toString() {
		return "ProponentDTO [id=" + id + ", name=" + name + ", age=" + age + ", monthlyIncome=" + monthlyIncome
				+ ", isMain=" + isMain + ", getEventId()=" + getEventId() + ", getEventSchema()=" + getEventSchema()
				+ ", getEventAction()=" + getEventAction() + ", getEventTime()=" + getEventTime() + ", getProposalId()="
				+ getProposalId() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
