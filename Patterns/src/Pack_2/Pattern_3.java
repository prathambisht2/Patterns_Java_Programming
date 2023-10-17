package Pack_2;
import java.util.*;
/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int tst=n;
		while(row<=n) {
			int cstt=0;
			
			while(cstt<tst) {
				System.out.print("* ");
				cstt++;
			}
			tst--;
			System.out.println();
			row++;
		}

	}

}
