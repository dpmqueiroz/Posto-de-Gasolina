package com.postoGasolina.Model;

public class Carro {
	
	private long id;
	private String modelo;
	private double consumoEtanol;
	private double consumoGasolina;
	private int capacidadeTanque;
	private String placa;
	private boolean aceitaEtanol;
	private boolean aceitaGasolina;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getConsumoEtanol() {
		return consumoEtanol;
	}
	public void setConsumoEtanol(double consumoEtanol) {
		this.consumoEtanol = consumoEtanol;
	}
	public double getConsumoGasolina() {
		return consumoGasolina;
	}
	public void setConsumoGasolina(double consumoGasolina) {
		this.consumoGasolina = consumoGasolina;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public boolean AceitaEtanol() {
		return aceitaEtanol;
	}
	public void setAceitaEtanol(boolean aceitaEtanol) {
		this.aceitaEtanol = aceitaEtanol;
	}
	public boolean AceitaGasolina() {
		return aceitaGasolina;
	}
	public void setAceitaGasolina(boolean aceitaGasolina) {
		this.aceitaGasolina = aceitaGasolina;
	}
	@Override
	public String toString() {
		return ("{ O ID desse carro é "+ getId()+" O modelo desse carro é : " + getModelo() + ("\n A placa é :" + (getPlaca()== null? "não informada \n": getPlaca()+"\n")) +
				" consome : " + getConsumoEtanol() + " de etanol por litro \n consome " + getConsumoGasolina() + 
				" de gasolina por litro \n capacidade máxima de "+ getCapacidadeTanque() +" litros \n"+ " Aceita Gasolina : "+
				AceitaGasolina()+"\n"+" Aceita Etanol : "+ AceitaEtanol()+"\n"+" }\n\n");
	}
	
}
