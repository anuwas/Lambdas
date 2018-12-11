package typeinference;

public class MainClass {
	public static void main(String[] args) {
		
		//valid expression 
		StringLenLambda len = (String s)->s.length();
		System.out.println(len.stringLenFunction("Hello"));
		
		//valid expression
		StringLenLambda len2 = (s)->s.length();
		System.out.println(len2.stringLenFunction("Hello"));
		
		//valid expression
		//for single parameter parenthesis () is not required
		// this is the shortest form of lambda
		StringLenLambda len3 = s->s.length();
		System.out.println(len3.stringLenFunction("Hello"));
		
		//this lambda expression can be passed into function as well
		//please check the follow static function which takes the parameter as the lambda function
		printLambda(s->s.length());
	}
	
	public static void printLambda(StringLenLambda s) {
		System.out.println(s.stringLenFunction("hello world"));
	}
}


