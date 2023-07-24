package app;

import java.util.Scanner;

public class SwitchCaseSample {

	public static void main(String[] args) {

		// 3 ten falza koşul durumu varsa switchase yapısını kullanmamız lazım
		int number = 20;

		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Değer 0 ile 3 arasında");
			break; // break komutu ile switch case ifadesi dışına çıkmış oluyoruz.
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Değer 4-9");
			break;
		default:
			System.out.println("Değer aralık dışında");
			break;
		}
		
	
		// 3 veya daha fazla sabit bir koşul söz konusu ise if else if yapısı yerine tercih edilebilen daha performanslı çalışna bir karar mekanizması.
		
		// kullanıcıdan 1 ile 12 arasında bir ay değeri seçimesini istiyelim ve seçilen değere göre ilgili ayın metinsel değerini ekrana yazdıran programı yazalım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-12 arasında bir rakam giriniz");
		int ayIndeksi = scanner.nextInt();
		String ay = "";
		String mevsim = "";
		
		switch(ayIndeksi) {
		case 12:
		case 1:
		case 2:
			mevsim = "Kış";
			break;
		case 3:
		case 4:
		case 5:
			mevsim = "ilkbahar";
			break;
		case 6:
		case 7:
		case 8:
			mevsim = "yaz";
			break;
		case 9:
		case 10:
		case 11:
			mevsim = "sonbahar";
			break;
		 default:
			 System.out.println("Böyle mevsim mevut değil");
		}
		
		
		switch(ayIndeksi) {
		case 1:
			ay = "Ocak";
			break;
		case 2:
			ay = "Şubat";
			break;
		case 3: 
			ay = "Mart";
			break;
		case 4:
			ay = "Nisan";
			break;
		case 5:
			ay = "Mayıs";
			break;
		case 6:
			ay = "Haziran";
			break;
		case 7:
			ay = "Temmuz";
			break;
		case 8:
			ay = "Ağustos";
			break;
		case 9:
			ay = "Eylül";
			break;
		case 10:
			ay = "Ekim";
			break;
		case 11:
			ay = "Kasım";
			break;
		case 12:
			ay = "Aralık";
			break;
		default:
			System.out.println("Böyle bir ay indeksi yok");
			break;
		}
		
		if(ayIndeksi > 0 && ayIndeksi <= 12) {
		
		System.out.println(String.format(" aylardan %s: ayında  mevsimlerden ise %s mevsimindeyiz", ay,mevsim));
		}
		
		
		

	}
}
