package runnablelambdas;

public class MainClass {
	
	public static void main(String[] args) {
		
		//This is anonymous inner class to create and spawn a new thread
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("My Thread");
			}});
		
		th.run();
		
		//This kind of thread can be possible to create using lambda
		//As run method dosen't takes any parameter so the parenthesis is empty
		Thread myThread = new Thread(()->System.out.println("My Lambda Thread"));
		myThread.run();
	}

}
