package fr.fms.test;
/**
 * 
 * @author AnselmeG
 * Exercice 2.1 : AdvEx2Thread
 */

public class ThreadExemple implements Runnable {
	private int number;
	private int lineNumber;
	
	public ThreadExemple(int number, int lineNumber) {
		this.number = number;
		this.lineNumber = lineNumber;
	}
	
	
	@Override
	public void run() {
		String padding = "";
		for(int i = 0; i < lineNumber; i++) {
			padding += " ";
		}
		while(true) {
			String output = padding;
			for(int i= 0; i < number;i++) {
				output += number + "-";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(output);
		}

	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadExemple(5, 1));
		Thread t2 = new Thread(new ThreadExemple(4, 2));
		Thread t3 = new Thread(new ThreadExemple(3, 3));
		Thread t4 = new Thread(new ThreadExemple(2, 4));
		Thread t5 = new Thread(new ThreadExemple(1, 5));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
