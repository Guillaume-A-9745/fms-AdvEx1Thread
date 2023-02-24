/**
 * 
 * @author Anselme Guillaume
 * Exercice 2.3 : AdvEx2Thread
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ThreadTime {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
	    Thread thread = new Thread(new MonRunnable(1000, df)); 

	    thread.start();
	  }

	  private static class MonRunnable implements Runnable {
		private DateFormat df;
	    private long delai;

	    public MonRunnable(long delai, DateFormat df) {
	      this.delai = delai;
	      this.df = df; 
	    }

	    @Override
	    public void run() {
	    	while(true) {
		      try {
		        Thread.sleep(delai);
		        //DateFormat df = new SimpleDateFormat("HH:mm:ss");
		        System.out.print(df.format(new Date())+'\r');
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
	    	}
	    }

	}

}
