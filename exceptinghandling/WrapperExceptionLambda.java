package exceptinghandling;

import java.util.function.BiConsumer;

public class WrapperExceptionLambda {

	public static void main(String[] args) {
		int[] ins = {1,2,3,4};
		int key =0;
		process(ins,key,wrapper((k,v)->System.out.println(k/v)));
			
	}
	
	
	public static void process(int[] ins,int key, BiConsumer<Integer,Integer> consumer) {
		for(int i: ins) {
			consumer.accept(i, key);
		}
	}
	
	// this is the lambda created only for exception handling
	// and this is the wrapper lambda for the orginal lambda
	public static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer,Integer> consumer){
		return(v, k)->{
			try {
				consumer.accept(v, k);
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		};
	}
}
