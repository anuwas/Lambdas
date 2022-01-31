package runnableexample;

public class RunnableExample {
	
	public static void main(String[] args) {
		
		/*
		 * Prior to java 8
		 * */
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside runnable");	
			}
		};
		
		new Thread(runnable).start();
		
		/*
		 * Java 8 Lambda way
		 * */
		
		Runnable runnable2 = ()->System.out.println("Inside Lambda Runnable");
		new Thread(runnable2).start();
		
		// More short form
		
		new Thread(()->System.out.println("Inside Short Lambda")).start();
	}

}
