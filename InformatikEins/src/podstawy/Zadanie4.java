package podstawy;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		int y;
		System.out.println("Podaj podstaw� tr�jk�ta");
		x=sc.nextInt();
		Scanner scn=new Scanner(System.in);
		System.out.println("Podaj wysoko�� tr�jk�ta");
		y=scn.nextInt();
		int P=x*y/2;
		System.out.println("Pole tego tr�jk�ta wynosi "+P);

	}

}
