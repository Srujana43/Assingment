package javaPrograms;

public class Faibonacci {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int sum;
		for(int i=0; i<=10;i++)
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
			
			
		}

	}

}
