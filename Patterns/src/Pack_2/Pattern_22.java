package Pack_2;

import java.util.Scanner;
/*
 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		
		
		while(i<n) {
			int j=0;
			int num=5;
			while(j<n) {
				System.out.print(num + " ");
				num--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
