package app;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		// tekrar kod satırlardından kurtulmak için kullandığımız kod yapıları.
		
		// 0 ile 10 arasındaki rakamları ekrana yazdıran program
		
		System.out.println("0");
		System.out.println("10");
		
		// for(başlangıc; kosul; arttırım;)
		
		for (int i = 0; i < 10; i++) {
			// tekrar eden kod blogunun yazıldığı yer
			System.out.println(i);
		}
		// kod sağladığı durumda kod blogu yukarı yönlü hareket edip defalarca kod blogunu çalıştırıyor.
		// kosul sağlamayınca kod aşağı yönlü çalışıyor
		
		// n adet sayıdan en büyüğünü bulan programın algoritmasını döngü ile yazalım
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç Adet sayı girmek istersiniz");
		int sayiAdeti = scanner.nextInt(); // sayi okuma
		int maksDeger = Integer.MIN_VALUE;
		
		// döngüler içerisinde if ile kontrol yapılabiliyor.
		for (int i = 0; i < sayiAdeti; i++) {
			
			System.out.println(String.format(" %s.sayıyı giriniz", i + 1));
			int sayi = scanner.nextInt();
			
			// her bir değer girildiğinde bir kıyaslama yapılsın.
			if(maksDeger < sayi) {
				maksDeger = sayi;
			}
		}
		
		System.out.println("maksDeger  : " + maksDeger);

	}

}
