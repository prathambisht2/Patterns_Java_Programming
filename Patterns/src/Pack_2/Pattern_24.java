package Pack_2;

import java.util.Scanner;
/*

1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

*/
public class Pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tst=1;
		int num=1;
		
		while(row<=2*n-1) {

			int cst=1;
			while(cst<=tst) {
				
				if(cst%2==0) {
					System.out.print("* ");
				}
				
				else {
					System.out.print(num + " ");
				}
				
				cst++;
			}
			
			if(row<n) {
				tst=tst+2;;
				num++;
			}
			
			else {
				tst=tst-2;;
				num--;
			}
			
			System.out.println();
			row++;
			
		}


	}

}
