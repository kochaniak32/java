package podstawy;

import java.util.Scanner;

public class skanerr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x;

		System.out.println("Wpisz rok urodzenia");


		x=sc.nextInt();
		System.out.println(("masz ")+(2023 -x)+(" lat"));

	}

}
