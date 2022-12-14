package SrujanaJava;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		int[] num= {3,6,9,2,4,7,1,};
		Arrays.sort(num);
		int length=num.length;
		System.out.println("Arrays.length"+length);
		for(int i=num.length-1; i>=0; i--)
		{
			System.out.println(num[i]);
			
		}
		
		

	}

}
