package com.testwirecard.paymentapi.model;

public enum StatusEnum {
	NOVO(1), RECEBIDO(2), CANCELADO(3), FINALIZADO(4);

	public int valorStatus;

	StatusEnum(int valor) {
		valorStatus = valor;
	}
}
