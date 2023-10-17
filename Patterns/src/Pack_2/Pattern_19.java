package Pack_2;

import java.util.Scanner;
/*
				1	
			1	2	1	
		1	2	3	2	1	
	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1

*/
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;

		while (row <= n) {
			int num=1;
			int csp = 0;
			while (csp < tsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 0;

			while (cst < tst) {
				
				System.out.print(num + "\t");
				
				if(cst<tst/2) {
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
