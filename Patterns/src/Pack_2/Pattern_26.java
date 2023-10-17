package Pack_2;

import java.util.Scanner;
/*
 
*       * 
  *   *   
	*     
  *   *   
*       * 

*/

public class Pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
	
		int row = 1;
		

		while (row <= n) {

			int cst=1;
			while(cst<=n) {
				if(row==cst || row+cst==n+1) {
					System.out.print("* ");
					
				}
				
				else {
					System.out.print("  ");
					
				}
				cst++;
			}
			
			System.out.println();
			row++;

		}


	}

}
