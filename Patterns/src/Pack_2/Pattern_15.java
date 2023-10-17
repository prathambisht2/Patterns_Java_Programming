package Pack_2;

import java.util.Scanner;
/*
        1 
      1 1 1 
    1 1 1 1 1 
  1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 

*/
public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;

		while (row <= n) {
			int csp = 0;
			while (csp < tsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;

			while (cst < tst) {

				System.out.print(1 + " ");

				cst++;
			}
			System.out.println();
			tsp--;
			tst = tst + 2;
			row++;

		}

	}

}
