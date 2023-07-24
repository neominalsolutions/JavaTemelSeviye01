package app;

import java.util.Scanner;

public class EvenOddSample {

	public static void main(String[] args) {
		// Klavyeden girilen bir sayının tek yada çift olduğunu bulan programın algoritmasını yazalım.
		
		//syso CTRL + SPACE
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();
		// ternaryif
		// sayi = sayi < 0 ? sayi*-1:sayi;
		
		if(sayi % 2 == 0) {
			System.out.println("Sayımız çifttir");
			
		} else {
			System.out.println("Sayımız tek");
		}
		
	}

}
