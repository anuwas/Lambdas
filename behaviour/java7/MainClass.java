package behaviour.java7;


public class MainClass {
	
	public void greet(GreetInterface greetInterface) {
		greetInterface.perform();
	}
	
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		GreetInterface greetInterfaceImpl = new GreetInterfaceImpl();
		mc.greet(greetInterfaceImpl);
	}

}
