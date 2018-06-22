package Tasks;

import java.util.Scanner;

public class Drob {
	
	public static Scanner sc=new Scanner(System.in);
	public static int k = 0;
	public static int m = 0;
	public static int n = 0;
	public static int a=1;
	public static int b=30;
	
		public static void main (String [] args) {
		arraySize();
				
		int i = 0;
		for (i = 0; i < k; i++) {
         
    	System.out.println("array["+i+"]=["+enterM(m)+"/"+enterN(n)+"]");
			}
	}  
	
	
	public static int arraySize() {
		System.out.println("What is the array size?");
		return k = sc.nextInt();
		
	}
	       
	 
	 public static int enterM(int m) {
		 m=a+(int)(Math.random()*b);
		 return m;
	 }
	 
	 public static int enterN(int n) {
		 n=a+(int)(Math.random()*b);
		 return n;
		 
	 }
}
