package algorithm;

import java.util.*;

public class bubble_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int a,b,c,temp;
		int[] nArray = new int[3];
		int[] mArray = new int[3];
        nArray[0] = sc.nextInt();
		nArray[1] = sc.nextInt();
		nArray[2] = sc.nextInt();
        System.out.println(nArray.length);    
		for(int d=0;d<nArray.length-1;d++) {
			for(int e=0;e<nArray.length-(1+d);e++) {
				if(nArray[e]>nArray[e+1]) {
					temp = nArray[e+1];
					nArray[e+1] = nArray[e];
					nArray[e] = temp;
				}				
			}
			System.out.println(nArray[0]+" "+nArray[1]+" "+nArray[2]);
		}
		System.out.println("----- 버블정렬 ------");
		System.out.println(nArray[0]+" "+nArray[1]+" "+nArray[2]);
	}
}
	
