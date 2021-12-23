package com.postoGasolina.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.postoGasolina.Model.Carro;
import com.postoGasolina.service.FabricaDeCarros;

public class LeitorCsv {

	  public static ArrayList<Carro> run() {

		String teste = System.getProperty("user.dir").concat("\\filaVeiculos.csv");
		teste = teste.replace('/', '\\');
		teste = teste.replace("\\", "\\");
		System.out.println(teste);

	    BufferedReader leitorCsv = null;
	    String linha = "";
	    String csvDivisor = ";";
	    
	    ArrayList<Carro> carros = new ArrayList<Carro>();
	    try {
	    	//System.out.println(enderecoArquivoCsv.substring(2));
	        leitorCsv = new BufferedReader(new FileReader(teste));
	        while ((linha = leitorCsv.readLine()) != null) {
	        	
	            String[] data = linha.split(csvDivisor);
	            
	            if(data[0].equals("Modelo")) {
	            	continue;
	            }
	            
	            switch (data[0].toUpperCase()) {
	            case "FIAT-UNO":{
	            	Carro carro = FabricaDeCarros.fabricaFiatUno(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            case "FORD-KA":{
	            	Carro carro = FabricaDeCarros.fabricaFordKa(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            case "AUDI-A1":{
	            	Carro carro = FabricaDeCarros.fabricaAudiA1(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            case "CITROEN-C3":{
	            	Carro carro = FabricaDeCarros.fabricaCitroenC3(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            case "RENAULT-CLIO":{
	            	Carro carro = FabricaDeCarros.fabricaRenaultClio(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            case "AUDI-A4":{
	            	Carro carro = FabricaDeCarros.fabricaAudiA4(data[1], Long.parseLong(data[2]));
	            	carros.add(carro);
	            	break;
	            }
	            default:
	            	System.out.println("Modelo não encontrado "+data[0]);
	            }
	        }

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (leitorCsv != null) {
	            try {
	                leitorCsv.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return carros;
	  }

}
