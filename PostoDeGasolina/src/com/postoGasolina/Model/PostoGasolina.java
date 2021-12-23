package com.postoGasolina.Model;

import java.util.ArrayList;

public class PostoGasolina {
	
	private String nome;
	private ArrayList<BombaCombustivel> bombas = new ArrayList<BombaCombustivel>();
	public static ArrayList<Carro> filaDeCarros = new ArrayList<Carro>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<BombaCombustivel> getBombas() {
		return bombas;
	}
	public void addBomba(BombaCombustivel bomba) {
		this.bombas.add(bomba);
	}
	public void removeTodasBombas() {
		this.bombas.removeAll(bombas);
	}
	public int numeroDeBombas() {
		return this.bombas.size();
	}
	
	
}
