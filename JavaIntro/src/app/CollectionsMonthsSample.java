package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsMonthsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> aylar = new ArrayList();
		aylar.add("Ocak"); // 0
		aylar.add("Şubat");
		aylar.add("Mart");
		aylar.add("Nisan");
		aylar.add("Mayıs");
		aylar.add("Haziran");
		aylar.add("Temmuz");
		aylar.add("Ağustos");
		aylar.add("Eylül");
		aylar.add("Ekim");
		aylar.add("Kasım");
		aylar.add("Aralık"); // 11
		
		// daha dinamik bir hale getirmek için
		final int ayToplamIndeks = 11;
		
		Scanner scanner = new Scanner(System.in);
		
		aylar.clear(); // temizleyip
		
		// kullanıcı kendisi ekliyor
		for (int i = 0; i <= ayToplamIndeks; i++) {
			System.out.println("Sıradaki ayı giriniz");
			String ay = scanner.next();
			aylar.add(ay);
		}
		
	
		System.out.println("1 ile 12 arasında bir rakam değeri giriniz");
		int ayIndeks = scanner.nextInt();
		
		String  ay = aylar.get(ayIndeks - 1).toString();
		System.out.println("Seçilen ay : " + ay);

	}

}
