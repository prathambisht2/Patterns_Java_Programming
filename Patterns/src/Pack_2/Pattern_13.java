
package Pack_2;
import java.util.*;
/*

* * *     * * * 
* *         * * 
*             * 
                
*             * 
* *         * * 
* * *     * * * 

*/

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tst1=n/2;
		int tsp=n-5;
		int tst2=n/2;
		
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
			while(cst2<tst2) {
				System.out.print("* ");
				cst2++;
			}
			
			System.out.println();
			
			if(row<=n/2) {
				tst1--;
				tst2--;
				tsp=tsp+2;
			}
			
			else {
				tst1++;
				tst2++;
				tsp=tsp-2;	
			}
			row++;
			
		}

	}

}
