package Pack_2;

import java.util.Scanner;
/*
        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 

*/
public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;
		int num=1;

		while (row <= n) {
			int csp = 0;
			while (csp < tsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;

			while (cst < tst) {

				System.out.print(num + " ");

				cst++;
			}
			System.out.println();
			tsp--;
			tst = tst + 2;
			row++;
			num++;

		}



	}

}
