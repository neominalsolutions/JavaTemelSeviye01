package app;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// While 
		// 0 ile 10 arasındaki rakamların ekran yazdırılması for
		// forda bir başlangıç bitiş değeri mevcut.
		// baslangic bitis ve kosul.
		
		// kosul uygulamadıgı sağlandığı sürece döngüye gir.
		
		/*
		while(kosul) {
			// tekrar eden kodlar.
		} 
		// kosulu sağlamadığı durumda döngüden çık.
		*/
		
		// klavyeden girilen sayı 3'ün katları olmadığı sürece kullanıyıca 3'un katı olan bir sayı girmeyi zorlayan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		while(sayi % 3 != 0) { // baslangic ve bitis değeri yok sadece kosul var
			System.out.println("3un katı bir sayı giriniz");
			sayi = scanner.nextInt();
		}
		
		// if döngüsel çalışmaz
		// while döngüsel çalışır.
		
		System.out.println("3'un katı sayımız While " + sayi);
		
		
		do {
			
			// tekrar edilecek kod blogu while döngüsünden farklı olarak do içerisine yazılır. öncelike kod 1 defaya mahsus çalışır daha sonra döngü kosulu sağladığı sürece tekrar tekrar çalışır. koşul sağlamayınca döngüden çıkılır.
			System.out.println("3'e bolunen bir sayı giriniz");
			sayi = scanner.nextInt();
			
		} while (sayi % 3 != 0);
		
		System.out.println("3'un katı sayımız do While " + sayi);
	}

}
