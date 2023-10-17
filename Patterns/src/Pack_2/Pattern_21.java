package Pack_2;

import java.util.Scanner;
/*
				1	
			2	0	2	
		3	0	0	0	3	
	4	0	0	0	0	0	4	
5	0	0	0	0	0	0	0	5	

*/

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;

		while (row <= n) {
			int num = row;
			int csp = 0;
			while (csp < tsp) {
				System.out.print("\t");
				csp++;
			}

			if (row == 1) {
				System.out.print(num + "\t");
			}

			else {
				int cst = 0;

				while (cst < tst) {

					if (cst == 0 || cst == tst - 1)

						System.out.print(num + "\t");

					else {
						System.out.print(0 + "\t");
					}

					cst++;
				}
			}

			System.out.println();

			tsp--;
			tst = tst + 2;
			row++;

		}

	}

}
