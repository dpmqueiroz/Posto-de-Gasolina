package com.postoGasolina.service;

import com.postoGasolina.Model.Carro;

public class FabricaDeCarros {
	public static Carro fabricaFiatUno(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Fiat-Uno");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(8.9);
		carro.setConsumoGasolina(12.7);
		carro.setCapacidadeTanque(48);
		carro.setAceitaEtanol(true);
		carro.setAceitaGasolina(true);
		return carro;
	}
	public static Carro fabricaFordKa(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Ford-Ka");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(8.1);
		carro.setConsumoGasolina(11.6);
		carro.setCapacidadeTanque(55);
		carro.setAceitaEtanol(true);
		carro.setAceitaGasolina(true);
		return carro;
	}
	public static Carro fabricaAudiA1(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Audi-A1");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(0);
		carro.setConsumoGasolina(10.8);
		carro.setCapacidadeTanque(45);
		carro.setAceitaEtanol(false);
		carro.setAceitaGasolina(true);
		return carro;
	}
	public static Carro fabricaCitroenC3(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Citroen-C3");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(7.5);
		carro.setConsumoGasolina(11.9);
		carro.setCapacidadeTanque(47);
		carro.setAceitaEtanol(true);
		carro.setAceitaGasolina(true);
		return carro;
	}
	public static Carro fabricaRenaultClio(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Renault-Clio");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(9.5);
		carro.setConsumoGasolina(14.3);
		carro.setCapacidadeTanque(50);
		carro.setAceitaEtanol(true);
		carro.setAceitaGasolina(true);
		return carro;
	}
	public static Carro fabricaAudiA4(String placa, long id) {
		Carro carro = new Carro();
		carro.setId(id);
		carro.setModelo("Audi-A4");
		carro.setPlaca(placa);
		carro.setConsumoEtanol(0);
		carro.setConsumoGasolina(8.8);
		carro.setCapacidadeTanque(65);
		carro.setAceitaEtanol(false);
		carro.setAceitaGasolina(true);
		return carro;
	}
}
