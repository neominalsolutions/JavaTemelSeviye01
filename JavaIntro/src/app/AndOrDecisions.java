package app;

import java.util.Scanner;

public class AndOrDecisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// v1, v2 , final notlarını kullanıcıdan istiyelim
		// bu girilen notlara göre v1 + v2 genel ortalamanın %40 olsun final ise %60 temsil etsin
		// eğer ki 50 altında FF harf notu
		// 50 >  <=60 CC
		// 60 >  <= 70 BC
		// 70 >  <=80 BB
		// 80>   <=90 BA
		// 90 >   <=100 AA
		
		// Notlar girilirken 100 den büyük olmamalıdır kullanıcıyı uyaralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize 1 giriniz");
		int vize1 = scanner.nextInt();
		
		System.out.println("Vize 2 giriniz");
		int vize2 = scanner.nextInt();
		
		System.out.println("Final notunu giriniz");
		int finalNotu = scanner.nextInt();
		
		if((vize1 < 0 || vize1 > 100) || (vize2 < 0 || vize2 > 100) || (finalNotu < 0 || finalNotu > 100)) {
			// veya durumunda koşulardan birinin sağlamaması bo kudu çalıştırır.
			System.out.println("Not aralığı 0 ile 100 arasında olmalıdır");
		} else { // scope
			double ortalama = ((vize1 + vize2) * 0.2f) + (finalNotu * 0.6f);
			
			if(ortalama <= 50) {
				System.out.println("FF");
			} else if(ortalama > 50 && ortalama <= 60) {
				// ve && durumlarında her iki koşulunda uygulanması gerekiyor 
				System.out.println("CC");
			} else if (ortalama > 60 && ortalama <= 70) {
				System.out.println("BC");
			} else if (ortalama > 70 && ortalama <= 80) {
				System.out.println("BB");
			} else if (ortalama > 80 && ortalama <= 90) {
				System.out.println("BA");
			} else {
				System.out.println("AA");
			}
			
			 System.out.println("ortalama :"  + ortalama);
		}
	}
}
