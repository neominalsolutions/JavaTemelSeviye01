package app;

import java.util.Scanner;

public class PrimeNumbersSample {

	public static void main(String[] args) {
		// asal sayılar 1 ve kendisi dışınada böleni olmayan sayılar.
		
		Scanner scanner = new Scanner(System.in);
		
		boolean asalMi = true; // kabul, uymadığı durumlarda asallığını bozucaz.
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		if(sayi <=1) 
			asalMi = false; // if altında tek satır kod olduğu durumlarda {} yapmamıza gerek kalmıyor 
		// 16  2 4 8 16 7  33 3 11
		else {
			for (int i = 2; i < sayi; i++) {
				if(sayi % i == 0) {
					asalMi = false;
					break;
					// break; // döngünün sonlandırılmasını sağlayan kod blogu böylelikle kodumuz bir sonraki adıma geçmediğinden dolayı algoritmamız performanslı çalışıyor.
				} 
			}
		}
		
		// 1. yöntem
		if(asalMi) {
			System.out.println("Sayımız asaldır");
		} else {
			System.out.println("Sayımız asal değildir");
		}
		
		String sonuc = asalMi ? "asaldır":"asal değildir";
		// ifleri bazen true yada false durumuna göre tek satırda yazmamız çok kulandığımız bir tekniktir. Biz bu tekniğe ternaryIf diyoruz. : else demek ? ise if demek.
		
		System.out.println(String.format("Sayımız %s", sonuc));

	}

}
