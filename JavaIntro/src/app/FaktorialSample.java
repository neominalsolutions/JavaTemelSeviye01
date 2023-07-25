package app;

import java.util.Scanner;

public class FaktorialSample {

	public static void main(String[] args) {
		// 5! 5.4.3.2
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faktoriyel sayısı giriniz");
		
		long faktoriyelSonuc = 1; //  sonuc değeri int sınırını aşabilir diye long seçimi yaptık.
		
		int faktoriyelSayi = scanner.nextInt(); // klavyeden girilen faktoriyel sayısı
		
		if(faktoriyelSayi < 0) {
			System.out.println("Negatif sayıların faktoriyeli hesaplanamaz");
		} else {
			for (int i = faktoriyelSayi; i > 1; i--) {
				faktoriyelSonuc *= i; // 5.4.3.2
//				faktoriyelSonuc = faktoriyelSonuc * i;
			}
			
			System.out.println("Faktoriyel Sayısı: " + faktoriyelSonuc);
		}
	}
}
