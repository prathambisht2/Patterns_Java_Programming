
package Pack_2;
import java.util.*;
/*
 
* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/
public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	//	int tst = n;
		
		
		int row = 1;

		while (row <= n) {

			int cst=0;
			while(cst<n) {
				if(row==1 || row==n || cst==0 || cst==n-1) {
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
