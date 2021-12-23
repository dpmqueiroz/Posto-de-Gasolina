package com.postoGasolina.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.postoGasolina.Model.BombaCombustivel;
import com.postoGasolina.Model.Carro;
import com.postoGasolina.Model.FilaDeCarros;
import com.postoGasolina.Model.PostoGasolina;

public class ServicoAbastecimento implements Runnable{
	
	private Carro carro;
	private PostoGasolina postoGasolina;
	private BombaCombustivel bomba;
	
	public ServicoAbastecimento() {
		
	}

	public ServicoAbastecimento(Carro carro, PostoGasolina postoGasolina) {
		this.carro = carro;
		this.postoGasolina = postoGasolina;
	}
	
	public ServicoAbastecimento(PostoGasolina postoGasolina, BombaCombustivel bomba) {
		this.postoGasolina = postoGasolina;
		this.bomba = bomba;
	}
	
	public ServicoAbastecimento(BombaCombustivel bomba) {
		this.bomba = bomba;
	}
	
	public Carro getCarros() {
		return carro;
	}

	public void setCarros(Carro carro) {
		this.carro = carro;
	}

	public PostoGasolina getPostoGasolina() {
		return postoGasolina;
	}

	public void setPostoGasolina(PostoGasolina postoGasolina) {
		this.postoGasolina = postoGasolina;
	}
	
	public ArrayList<BombaCombustivel> bombasDisponiveisParaEtanol(ArrayList<BombaCombustivel> bombas) {
		ArrayList<BombaCombustivel> bombasDisponiveis = new ArrayList<BombaCombustivel>();
		for(int i = 0; i < bombas.size(); i++) {
			if(bombas.get(i).isDisponible() && bombas.get(i).getTipoCombustivel().equals("ETANOL")) {
				bombasDisponiveis.add(bombas.get(i));
			}
		}
		return bombasDisponiveis;
	}
	public ArrayList<BombaCombustivel> bombasDisponiveisParaGasolina(ArrayList<BombaCombustivel> bombas) {
		ArrayList<BombaCombustivel> bombasDisponiveis = new ArrayList<BombaCombustivel>();
		for(int i = 0; i < bombas.size(); i++) {
			if(bombas.get(i).isDisponible() && bombas.get(i).getTipoCombustivel().equals("GASOLINA")) {
				bombasDisponiveis.add(bombas.get(i));
			}
		}
		return bombasDisponiveis;
	}
	public List<BombaCombustivel> bombasDisponiveis(ArrayList<BombaCombustivel> bombas) {
		List<BombaCombustivel> bombasDisponiveis = bombas.stream()
				.filter(e -> e.isDisponible() == true)
				.collect(Collectors.toList());
		return bombasDisponiveis;
	}
		
	@Override
	public void run() {
		//ENQUANTO tiver carros na fila faça isso
		do{
					
			if(bomba.getTipoCombustivel().equals("GASOLINA")) {
				List<Carro> primeiroDaFila = FilaDeCarros.Fila.stream().filter(e -> e.AceitaGasolina() == true).limit(1).collect(Collectors.toList());
				if(!primeiroDaFila.isEmpty()) {	
					FilaDeCarros.Fila.remove(primeiroDaFila.get(0));					
					this.bomba.abastecer(primeiroDaFila.get(0));
				}
			}else if(bomba.getTipoCombustivel().equals("ETANOL")) {
				List<Carro> primeiroDaFila = FilaDeCarros.Fila.stream().filter(e -> e.AceitaEtanol() == true).limit(1).collect(Collectors.toList());
				if(!primeiroDaFila.isEmpty()) {					
					FilaDeCarros.Fila.remove(primeiroDaFila.get(0));
					this.bomba.abastecer(primeiroDaFila.get(0));
				}
			}
			
		}while(!(FilaDeCarros.Fila.size() == 0));
		
		//Aguardar 3 segundos antes de fechar a bomba
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			System.out.println("Deu erro!");
		}
		System.out.println("A bomba n°: " + bomba.getNumeroBomba() + " Abasteceu " + bomba.getLitrosAbastecidos() + 
				" litros, que gerou R$ "+(bomba.getLitrosAbastecidos() * bomba.getPreco()) +" reais.");
	}
	
}
