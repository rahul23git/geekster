package geekster;

import java.util.*;
public class digitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        
        int count=0;
        while(n>0)
        {
        	count++;
        	n/=10;
        	
        }
        	System.out.println(count);	

	}

}
