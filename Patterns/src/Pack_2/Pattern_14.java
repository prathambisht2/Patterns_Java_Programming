package Pack_2;

import java.util.*;
/*
      * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 

*/

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp1 = n - 4;
		// int tst=1;
		int tsp2 = -1;

		while (row <= n) {

			if (row == 1 || row == n) {
				int csp1 = 0;
				while (csp1 < tsp1) {
					System.out.print("  ");
					csp1++;
				}
				System.out.print("* ");

			}

			else {
				int csp1 = 0;
				while (csp1 < tsp1) {
					System.out.print("  ");
					csp1++;
				}

				System.out.print("* ");

				int csp2 = 0;
				while (csp2 < tsp2) {
					System.out.print("  ");
					csp2++;
				}

				System.out.print("* ");
			}

			System.out.println();

			if (row <= n / 2) {
				tsp1--;

				tsp2 = tsp2 + 2;
			}

			else {
				tsp1++;

				tsp2 = tsp2 - 2;
			}
			row++;
		}

	}

}
