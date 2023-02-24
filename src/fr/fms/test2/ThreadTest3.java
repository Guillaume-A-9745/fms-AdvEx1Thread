package fr.fms.test2;
/**
 * 
 * @author Anselme Guillaume
 * Exercice 2.2 : AdvEx2Thread
 */
public class ThreadTest3 implements Runnable{
	
	private int number;
	private int line;

	public ThreadTest3(int number, int line) {
		this.number = number;
		this.line = line;
	}
	
	@Override
	public void run() {
		String output = "";
		for(int i =0; i < line; i++) {
			char ch = (char)(number +i);
			output += ch;
			for(int j = 0; j <= i; j++)
				output += (char)(42);
			output += ch +"\n";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadTest3( 33, 10 ));
		thread.start();
	}
}
