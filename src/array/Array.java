package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = {1,2,3,4,5};
		int[] b = {7,8};
		a = b;
		System.out.println(a.length);
	}

}
