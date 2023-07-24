package app;

import java.util.Scanner;

public class MaxNumberSample {

	public static void main(String[] args) {
		// Klavyeden girilen 3 adet sayıdan en büyüğünü bulan programın algoritması
		
		int maksDeger = Integer.MIN_VALUE; 
		int minDeger = Integer.MAX_VALUE;
		// elimdeki maksDeger tamsayı tipindeki en kucuk değer olarak kabul ediyorum
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Sayıyı giriniz");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		int sayi2 = scanner.nextInt();
		
		System.out.println("3. sayıyı giriniz");
		int sayi3 = scanner.nextInt();
		
		
		if(maksDeger < sayi1) {
			maksDeger = sayi1; // yer değiştirme algoritması
		} 
		
		if(maksDeger < sayi2) {
			maksDeger = sayi2;
		}
		
		if(maksDeger < sayi3) {
			maksDeger = sayi3;
		}
		
		if(minDeger > sayi1) {
			minDeger = sayi1;
		}
		
		if(minDeger > sayi2) {
			minDeger = sayi2;
		}
		
		if(minDeger > sayi3) {
			minDeger = sayi3;
		}

		System.out.println("Maks değer sayi1 : " + maksDeger);
		System.out.println("Min değer sayi1 : " + minDeger);

	}

}
