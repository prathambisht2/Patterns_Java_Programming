package Pack_2;

import java.util.Scanner;
/*

        * 
      * ! * 
    * ! * ! * 
  * ! * ! * ! * 
* ! * ! * ! * ! * 

*/
public class Pattern_8 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tsp=n-1;
		int tst=1;
		
		while(row<=n) {
			int csp=0;
			while(csp<tsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=0;
			
			while(cst<tst) {
				if(cst%2==0) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("! ");
				}
				cst++;
			}
			System.out.println();
			tsp--;
			tst=tst+2;
			row++;
			
		}
	}

}
