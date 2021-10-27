package geekster;

import java.util.*;

public class Maximum {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int b=sn.nextInt();
		int c=sn.nextInt();
		
		
		 int d=(a>b)?(a>c?a:c):(b>c?b:c); 
		System.out.println("Max of 3 number="+""+d);
		
    sn.close();
	}

}
