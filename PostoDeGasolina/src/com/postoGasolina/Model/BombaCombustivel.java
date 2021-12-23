package com.postoGasolina.Model;

public class BombaCombustivel {
	
	private int numeroBomba;
	private double litrosAbastecidos;
	private double preco;
	private String tipoCombustivel;
	private int velocidadelitrosPorMinuto;
	public boolean disponible = true;
	
	public BombaCombustivel() {
		// TODO Auto-generated constructor stub
	}
	
	public BombaCombustivel(int numeroBomba, String tipoCombustivel, double preco, int velocidadeLitrosPorMinuto, double litrosAbastecidos) {
		this.litrosAbastecidos = litrosAbastecidos;
		this.preco = preco;
		this.tipoCombustivel = tipoCombustivel;
		this.velocidadelitrosPorMinuto = velocidadeLitrosPorMinuto;
		this.numeroBomba = numeroBomba;
	}
	
	public int getNumeroBomba() {
		return numeroBomba;
	}

	public void setNumeroBomba(int numeroBomba) {
		this.numeroBomba = numeroBomba;
	}
	public double getLitrosAbastecidos() {
		return litrosAbastecidos;
	}
	public void setLitrosAbastecidos(double litrosAbastecidos) {
		this.litrosAbastecidos = litrosAbastecidos;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public int getVelocidadelitrosPorMinuto() {
		return velocidadelitrosPorMinuto;
	}
	public void setVelocidadelitrosPorMinuto(int velocidadelitrosPorMinuto) {
		this.velocidadelitrosPorMinuto = velocidadelitrosPorMinuto;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Bomba de numero"+getNumeroBomba();
	}
	public void abastecer(Carro carro) {
		System.out.println("bomba de número : "+getNumeroBomba()+" e COMEÇOU a abastecer o carro de id: "+ carro.getId() +" modelo: "+carro.getModelo() + " com "+getTipoCombustivel());
		setDisponible(false);
		this.litrosAbastecidos = litrosAbastecidos + carro.getCapacidadeTanque();
		try{
		      Thread.sleep(this.velocidadelitrosPorMinuto * 100);
		      setDisponible(true);
		      System.out.println("bomba de número : "+getNumeroBomba()+" TERMINOU de abastecer o carro de id: "+ carro.getId()+" e modelo: "+carro.getModelo());
		}catch(Exception e){
		      System.out.println("Deu erro!");
		}
	}
	
}
