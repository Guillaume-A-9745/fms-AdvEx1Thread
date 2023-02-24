/**
 * 
 * @author Anselme Guillaume
 * Exercice 2.2 : AdvEx2Thread
 */
import java.util.Collections;

public class TestRunnable implements Runnable {
	
	//methode 1
	/*	
 	String [] str = {"!","\"","#","$","%","&","'","(",")","*"};
 
	@Override
	public void run() {
		for(int i =0; i < 10; i++) {
			System.out.print(str[i]);
			System.out.print(String.join("", Collections.nCopies( i + 1, "*")));
			System.out.println(str[i]);
		}
	}
	*/	
	
	//methode 2
	@Override
	public void run() {
		for(int i =0; i < 10; i++) {
			char ch = (char)(33 +i);
			System.out.print(ch);
			System.out.print(String.join("", Collections.nCopies( i + 1, "*")));
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}
