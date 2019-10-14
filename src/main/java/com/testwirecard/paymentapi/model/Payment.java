package com.testwirecard.paymentapi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_PAYMENT")
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private DecimalFormat amount;
	@NotNull
	private String type;

	private Card card;

	@Enumerated
	private StatusEnum Status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DecimalFormat getAmount() {
		return amount;
	}

	public void setAmount(DecimalFormat amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public StatusEnum getStatus() {
		return Status;
	}

	public void setStatus(StatusEnum status) {
		Status = status;
	}

}
