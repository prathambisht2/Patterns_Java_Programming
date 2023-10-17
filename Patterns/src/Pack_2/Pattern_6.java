package Pack_2;

import java.util.Scanner;
/*

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tsp=0;
		int tst=n;
		
		while(row<=n) {
			int csp=0;
			while(csp<tsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=0;
			
			while(cst<tst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			tsp++;
			tst--;
			row++;
			
		}

	}

}
