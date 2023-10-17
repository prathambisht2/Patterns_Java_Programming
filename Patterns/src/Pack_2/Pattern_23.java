package Pack_2;

import java.util.Scanner;
/*
 
5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1 

*/

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int dig=n;
		
		while(row<=n) {
			int j=0;
			int num=5;
			while(j<n) {
				if(j==dig-1) {
					System.out.print("* ");
					dig--;
					num--;
				}
				
				else {
					System.out.print(num + " ");
					num--;
				}
				
				j++;
			}
			System.out.println();
			row++;
		}

	}

}
