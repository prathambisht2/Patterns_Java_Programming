package Pack_2;
import java.util.*;
public class Pattern_9 {
/*
	
	*
	**
	***
	****
	*****
	****
	***
	**
	*

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tst=1;
		
		while(row<=2*n-1) {
			int cst=0;
			while(cst<tst) {
				System.out.print("*");
				cst++;
			}
			
			
			
			if(row<n) {
				tst++;
			}
			
			else {
				tst--;
			}
			
			System.out.println();
			row++;
			
		}

	}

}
