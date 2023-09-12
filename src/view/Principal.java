package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int max = 50;
		
		System.out.println("Distância da corrida: "+max+" m");
		for (int i =1; i<=5;i++) {
			Thread sapo = new ThreadSapo(i, max);
			sapo.start();
		}

	}

}
