package algorithm;

import java.util.*;

public class less_than_x {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int a,b,temp;
		int e=0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int[] nArray = new int[a];
		int[] mArray = new int[a];
        System.out.println("");
		for(int c=0;c<a;c++) {
			nArray[c] = sc.nextInt();
		}
		
        System.out.println(nArray.length);    
		for(int d=0;d<nArray.length;d++) {
			if(b>nArray[d]) {
				mArray[e] = nArray[d];
				e++;
			}							
		}
		for(int f=0;f<e;f++) {
		System.out.print(mArray[f]+" ");
		}
	}	
}
