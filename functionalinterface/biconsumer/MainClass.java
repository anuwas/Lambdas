package functionalinterface.biconsumer;

import java.util.function.BiConsumer;

public class MainClass {
	public static void main(String[] args) {
		int[] ins = {1,2,3,4};
		int key =1;
		//process(ins);
		
		//instead of calling process function lambda can be use here
		process(ins,key,(k,v)->System.out.println(k+v));
	}
	
	public static void process(int[] ins,int key, BiConsumer<Integer,Integer> consumer) {
		for(int i: ins) {
			consumer.accept(i, key);
		}
	}
}
