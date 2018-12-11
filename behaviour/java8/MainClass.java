package behaviour.java8;

public class MainClass {
	
		
	public static void main(String[] args) {
		
		// this lambda refers to mylambda , as mylabda interace has single void method so this method
		//refers to the interface
		myLambda variable = ()->System.out.println("Hello Lambda");
		
		myAddition addresult = (int a, int b)->a+b;
	}

}

interface myLambda{
	void foo();
}

interface myAddition{
	public int addresult(int a, int b);
}
