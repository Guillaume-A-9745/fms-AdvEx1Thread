package fr.fms.test2;
/**
 * 
 * @author Anselme Guillaume
 * Exercice 2.3 : AdvEx2Thread
 */

import java.time.LocalTime;

public class ThreadTest4 implements Runnable{

	@Override
	public void run() {
		while(true) {
			LocalTime now = LocalTime.now();
			System.out.printf("%02d:%02d:%02d\r", now.getHour(), now.getMinute(), now.getSecond());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		ThreadTest4 horloge = new ThreadTest4();
		Thread thread = new Thread(horloge);
		thread.start();
	}
}
