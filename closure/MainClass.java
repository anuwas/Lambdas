package closure;

public class MainClass {
	public static void main(String[] args) {
		int i=10;
		// in java7 this b variable must be final otherwise it could not be use in inner class
		int b=10;
		/*
		doProcess(i, new Process() {

			@Override
			public void doProcess(int i) {
				System.out.println(i+b);
				
			}
			
		});
		*/
		// Change to lambda expression
		// b is not passing but compiler can understand 
		doProcess(i,a->System.out.println(a+b));
	}
	
	public static void doProcess(int i, Process p) {
		p.doProcess(i);
	}

}
