package methodreference;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				printMsg();
			}
			
		});
		*/
		//Thread t = new Thread(()->printMsg());
		
		// If a lambda has no argument and the calling method is no argument
		// then It can be called as method reference
		// The syntax is first class name and then method name
		Thread t = new Thread(MainClass::printMsg);
		t.start();
	}
	
	public static void printMsg() {
		System.out.println("This is a pintMsg method");
	}

}
