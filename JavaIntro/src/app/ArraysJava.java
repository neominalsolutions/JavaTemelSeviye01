package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysJava {

	public static void main(String[] args) {
		// diziler belirli bir tipteki serilerimiz
		
		int[] sayilar = new int[5]; // 5 dizi size oluyor
		sayilar[0] = 5;
		sayilar[1] = 10;
		sayilar[2] = 15;
		sayilar[3] = 13;
		sayilar[4] = 45;
		// sayilar[5] = 75; // out of bounds olur.
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("değer" + sayilar[i]);
			
			if(sayilar[i] == 15) {
				System.out.println("15 numaralı sayi dizide mevcuttur");	
			}
		}
		
		// diziler ile çalışırken for döngüsünü kullanmayı tercih ediyoruz.
		
		boolean varmi = sayilar[2] == 15;
		
//		Collections.sort(sayilar);
		
		Arrays.sort(sayilar); // küçükten büyüğe sıralam yapar.
		
		System.out.println(Arrays.toString(sayilar));
		System.out.println(sayilar);
	
		// Interger
		// String
		// Boolean
		// Koleksiyon ifadeler wrapper class yapıları ile çalışır
		// Wrapper classlar int,long,double gibi primative tipleri kapsayan, bu tiplere bazı methodlar vasıtası ile özellikler kazandırmış yapılar.
		
		List<Integer> numaralar = new ArrayList<Integer>();
//		ArrayList<Integer> numaralar2 = new ArrayList<Integer>();
		numaralar.add(5);
		numaralar.add(10); // 0.index
		numaralar.add(45); // 1.index
		
		Collections.sort(numaralar);
		Collections.reverse(numaralar); // tersten sırala
		
		numaralar.remove(0); // 0'ınci indeksteki değeri sil
		boolean sonuc = numaralar.contains(10); // 10 değeri bu kolleksiyonda var mı?
		numaralar.set(1, 14); // numaralar kolleksiyonundaki 1. indeksin değerini güncelle.
		
		
		// kolleksiyonlar ile dizi arasındaki fark size otomatik ayarlanır.
		
		numaralar.size(); // listenin kaç eleman içerdiği bilgisi veriyor.
		
		// for döngüsünü kullanmak yerine kolleksiyonlarda foreach diyip kolleksiyon içerisinde her bir item değerinde gezinti yapabiliyoruz.
		numaralar.forEach(item -> {
			System.out.println("item" + item);
		});
		
		// numaralar.clear(); // itemları temizle
		
		System.out.println(numaralar.toString());	
		Boolean.compare(false, true);
	
	}

}
