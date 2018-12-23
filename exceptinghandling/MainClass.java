package exceptinghandling;

import java.util.function.BiConsumer;

public class MainClass {
	public static void main(String[] args) {
		int[] ins = {1,2,3,4};
		int key =0;
		process(ins,key,(k,v)->{
			try {
				System.out.println(k/v);
			}catch(Exception ex) {
				System.out.println(ex);
			}
		});
	}
	
	//Conventional way to handle exception
/*	public static void process(int[] ins,int key, BiConsumer<Integer,Integer> consumer) {
		for(int i: ins) {
			try {
				consumer.accept(i, key);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}*/
	
	public static void process(int[] ins,int key, BiConsumer<Integer,Integer> consumer) {
		for(int i: ins) {
			consumer.accept(i, key);
		}
	}
}
