package Pack_2;
import java.util.*;
/*
 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

*/

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		
		
		while(i<n) {
			int j=0;
			while(j<n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}

	}
	

}
