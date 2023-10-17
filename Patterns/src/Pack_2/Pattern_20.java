package Pack_2;

import java.util.Scanner;
/*
				1	
			2	3	2	
		3	4	5	4	3	
	4	5	6	7	6	5	4	
5	6	7	8	9	8	7	6	5	

*/

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n - 1;
		int tst = 1;
		
		
		while (row <= n) {
			int num=row;
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
