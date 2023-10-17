package Pack_2;

import java.util.Scanner;
/*

*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 

*/
public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tst1=1;
		int tsp=2*n-3;
		int tst2=1;
		
		while(row<=n) {
			
			int cst1=0;
			while(cst1<tst1) {
				System.out.print("* ");
				cst1++;
			}
		
			int csp=0;
			while(csp<tsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst2=0;
			if(row==n) {
				 cst2=1;
			}
			
			while(cst2<tst2) {
				System.out.print("* ");
				cst2++;
			}
			
			System.out.println();
			
			
			tsp=tsp-2;
			tst1++;
			tst2++;
			row++;
		}
	}

}
