package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionsSample {

	public static void main(String[] args) {
		
		// klavyeden girilen sayılardan en buyuk ve en kucuk olan bulan pogramın algoritmasını kolleksiyonlar ile yapalım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç adet sayı giriceksiniz");
		
		int sayiAdeti = scanner.nextInt();
		List<Integer> sayilar = new ArrayList<Integer>();
		
		for (int i = 0; i < sayiAdeti; i++) {
			System.out.println((i+1) + " numaralı sayıyı giriniz");
			int sayi = scanner.nextInt();
			sayilar.add(sayi); // koleksiyona sayı eklettik.
		}
		
		// 5,7,13
		// 13,7,5
		Collections.sort(sayilar); // kucukten buyuge sıralama yaptı.
		int minDeger = sayilar.get(0).intValue(); // kolleksiyon içerisinde değeri okurken 0'inci indeksinde değerini getir.
		// 0 eşit 1 ise buyuk  -1 ise kucuk
		// 5 9 8
		// 5-9 => -4
		// 9-8 => 1 5,8,9
		// sayilar.size()-1 son indeksi verir.
		int maksDeger = sayilar.get(sayilar.size()-1).intValue();
		
		System.out.println(String.format("maksimum %s minimum %s", maksDeger, minDeger));
		
		 Collections.sort(sayilar,(a,b)-> { return b-a ;}); 
		 // küçükten büyüğe sıralama yapar (a-b) (b-a) büyükten küçüğe sıralama
		 System.out.println(sayilar.toString());

	}

}
