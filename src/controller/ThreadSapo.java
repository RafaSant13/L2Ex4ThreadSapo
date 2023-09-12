package controller;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSapo extends Thread {
	
	int sapo, max;
	
	private static AtomicInteger pos = new AtomicInteger(1);

	public ThreadSapo(int sapo, int max) {
		this.sapo = sapo;
		this.max = max;
		
	}
	
	public void run() {
		sapo();
	}

	private void sapo() {
		int saltomax = (int)((Math.random()*100)+1);
		int dist = 0;
		while (dist<max) {
			int salto = (int)((Math.random()*saltomax)+1);
			dist = dist + salto;
			if (dist<max) {
				System.out.println("Sapo #"+sapo+" ==> Salto: "+salto+" m,  Dist�ncia percorrida: "+dist+" m, Dist�ncia faltando: "+(max-dist)+" m");
			}
			else {
				System.out.println("Sapo #"+sapo+" ==> Salto: "+salto+" m,  Dist�ncia percorrida: "+dist+" m");
			}
		}
		int place = pos.getAndIncrement();
		try {
			sleep(500*place);
			System.out.println("Sapo #"+sapo+" terminou a corrida na "+place+"� posi��o");
		} catch (InterruptedException e) {
		}
			
	}

}
