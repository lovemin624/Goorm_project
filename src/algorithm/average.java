package algorithm;

import java.util.*;

public class average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a,b;
		double total=0.00, max = 0.00;
		a = sc.nextInt();
		double[] nArray = new double[a];
		for(int c=0;c<a;c++) {
			nArray[c] = sc.nextInt();
			if(nArray[c]>max) {
				max = nArray[c];
			}
		}
		for(int d=0;d<a;d++) {
			total += (nArray[d]/max)*100;
		}
		System.out.println(total);	
		System.out.println(total/a);
	}
}
