package app;

import java.util.Scanner;

public class Decisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Karar ifadeleri
		// programın bir durum karşısında karar vermesini sağlayan ifadeler anlamına
		// gelir.
		// 2 farklı karar ifademiz mevcut
		// if else
		// switch case
		// ternaryif

		// koşul yazım şekilleri
		// deger1 > deger2 (Buyuk kucuk kıyaslaması)
		// deger1 == deger2 (iki değişkenin değer olarak eşitliğine bakar)
		// deger1 != deger2 (iki değişkenin değer olarak birbirinden farklı olmasına
		// bakar)
		// deger1 >= deger2 (deger1 büyük mü değer 2 den veya değer1 ile değer 2
		// birbirine değer olarak eşit mi)
		// yukarıdaki ifadeler her zaman true yada false, Evet yada hayır döndürür

		/* If Yazım Şekli
		 * if(true) { 
		 * çalışacak olan kod
		 * }
		 * else {
		 *  çalışacak olan kodlar
		 * }
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz");
		
		int girilenSayi = scanner.nextInt();
		// boolean pozitifMi = girilenSayi > 0; // true yada false

	
		if (girilenSayi > 0) {
			System.out.println("Sayımız pozitiftir");
		} else if(girilenSayi == 0) {
			System.out.println("Sayımız Sıfır");
		} else {
			System.out.println("Sayımız negatiftir");
		}
		
		
		

	}

}
