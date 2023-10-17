
package Pack_2;

import java.util.Scanner;
/*

				  0 
				9 0 9 
			  8 9 0 9 8 
			7 8 9 0 9 8 7 
		  6 7 8 9 0 9 8 7 6 
		5 6 7 8 9 0 9 8 7 6 5 
	  4 5 6 7 8 9 0 9 8 7 6 5 4 
	3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 

*/

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;

		int num = n;
		while (row <= n) {

			int csp = 0;
			while (csp < tsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 0;

			while (cst < tst) {

				if (num == 10) {
					System.out.print(0 + " ");
				}

				else {
					System.out.print(num + " ");
				}

				if (cst < tst / 2) {
					num++;
				}

				else {
					num--;
				}

				cst++;
			}
			System.out.println();

			tsp--;
			tst = tst + 2;
			row++;

		}

	}

}
