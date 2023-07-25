package app;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GetAgesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// klavyeden girilen bir doğum tarihine göre kişinin yaşını ve şuana kadar ne kadar gün yaşadığı bulan pogramın algoritmasını yazalım
		
		
		
		
		
		// parse ile metinsel bir ifade olarak yazılan değer ilgili veri tipine çevrilir.
		
		// Java Parsing işlemleri
		/*
		 int sayi1 = Integer.parseInt("10"); // 10
		 double sayi2 = Double.parseDouble("10.5"); // 10.5
		 boolean dY = Boolean.parseBoolean("true"); // true
		 LocalDate dt1 = LocalDate.parse("10/10/2023", dt);
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum tarihinizi giriniz (dd/MM/yyyy)");
		String dogumTarihiString = scanner.next(); // metinsel ifade olduğundan dolayı doğum tarihini String olarak alıyoruz.
		 
		 DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		 LocalDate dogumTarihi = LocalDate.parse(dogumTarihiString, dt);
		 LocalDate bugun = LocalDate.now();
		 int yas = bugun.getYear() - dogumTarihi.getYear();
		 // iki tarih arasındaki farkı almak için Duration sınıfını kullanıypruz.
		 // gün üzerinde bir kontrol yapmamız gerektiğinden dolayı ilgili tarihin başladığı ilk günü baz aldık.
		 Duration diff = Duration.between(dogumTarihi.atStartOfDay(), bugun.atStartOfDay());
		 long toplamYasanmisGunSayisi = diff.toDays(); // toplam gun farki
		 
		 System.out.println("toplamYasanmisGunSayisi : " + toplamYasanmisGunSayisi);
		 System.out.println("Yaşınız :" + yas);
		 
	}

}
