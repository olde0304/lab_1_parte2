package carro;

import Maquinaria.IMaquinaria;
import moto.Ducati;
import moto.Moto;
import moto.Ninja;

public class Run {

	public static void main(String[] args) {
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinaria(); 
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinaria();
		new Carretera(createMotoFactory(myMotoType.Ducati)).runMaquinaria();
		new Carretera(createMotoFactory(myMotoType.Ninja)).runMaquinaria();
		
		//agregar ducati
	}
	
	
	private enum CarType {
		SEDAN,
		PICKUP
	}
	
	private enum myMotoType {
		Ninja,
		Ducati
	}
	
	
	private static Carro createCarFactory(CarType type) {
	  if (type.equals(CarType.SEDAN)) {
		  return new Sedan();
	  }
	  return new Pickup(); 
	}
	
	private static Moto createMotoFactory(myMotoType type) {
		if (type.equals(myMotoType.Ducati)) {
			  return new Ducati();
		  }
	   return new Ninja(); 
	}
	
}
