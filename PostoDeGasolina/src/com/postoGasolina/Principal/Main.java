package com.postoGasolina.Principal;

import java.util.Collections;

import com.postoGasolina.Model.BombaCombustivel;
import com.postoGasolina.Model.FilaDeCarros;
import com.postoGasolina.Model.PostoGasolina;
import com.postoGasolina.service.ServicoAbastecimento;
import com.postoGasolina.utils.LeitorCsv;

public class Main {
	public static void main(String[] args) {
		
		FilaDeCarros.Fila = Collections.synchronizedList(LeitorCsv.run());
		
		PostoGasolina ipiranga = new PostoGasolina();
		ipiranga.setNome("Ipiranga");
		
		
		BombaCombustivel bomba1 = new BombaCombustivel(1,"ETANOL",2.90,10,0);
		BombaCombustivel bomba2 = new BombaCombustivel(2,"GASOLINA",2.27,12,0);
		
		ipiranga.addBomba(bomba1);
		ipiranga.addBomba(bomba2);
		
		System.out.println("Vou imprimir a fila de carros que recebi:\n");
		FilaDeCarros.Fila.stream().forEach(e -> System.out.println(e.getId()+"     ...    "+e.getModelo()));
		System.out.println("\nFim da Lista de Carros\n");
		
		for (BombaCombustivel bomba : ipiranga.getBombas()) {
			try{
				ServicoAbastecimento sv = new ServicoAbastecimento(ipiranga, bomba);
				
				Thread thread = new Thread(sv);
				thread.start();
			    Thread.sleep(500);
			}catch(Exception e){
			      System.out.println("Deu erro!");
			}	
		}
	}
}
