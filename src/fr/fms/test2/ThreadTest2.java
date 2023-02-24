package fr.fms.test2;
/**
 * 
 * @author Anselme Guillaume
 * Exercice 2.1 : AdvEx2Thread
 */

public class ThreadTest2 extends Thread {
	private int number;

	public ThreadTest2(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {

		String output = "";
		for(int i = 0; i < 5; i++) {
			output+= Integer.toString(number);
			for(int j = 0; j < number; j++ ) {
				output += "-";
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		ThreadTest2[] thread = new ThreadTest2[5];
		for(int i = 0; i < thread.length; i++) {
			thread[i] = new ThreadTest2(i + 1);
			thread[i].start();
		}
	}
}