package app;

import java.util.Scanner;

public class WhileSample {

	// bilgisayar rastgele bir sayıyı ramde hafıza tutsun
	// bizim bu sayıyı tahmin etmek için 3 hakkımız olsun.
	// eğer ki biz bu sayıyı 3 hakkımızda tahmin edemezsek oyun bitsin
	// tahmin edersek tebrikler diye bir mesaj yazdıralım
	// 10 (0-50) 12 daha kucuk bir sayı tahmin et 3-1 2 hak
	// 9 daha buyuk bir sayi tahmin et 2-1 1 hak
	// 10 tebrikler dogru tahmin ettiniz
	// tahmin hakkınız bitmiştir. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 long gizliSayi =	Math.round((Math.random() * 50)); // 0-1 arasında kusuralık bir ara değeri sistem tarih saatine göre buluyor. 0.999 0.23445, 38,87787
//	 System.out.println("rastgele sayı \n" + gizliSayi);
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 int tahminHakki = 3;
	 
	 while(tahminHakki > 0) { // tahmin hakkım olduğu sürece ben tahminde bulunabilirim
		 System.out.println("0-50 ile arasında bir sayı tahmin ediniz");
		 int tahmin = scanner.nextInt(); // kullanıcının 0 ile 50 arasında girdiği tahmin
		 
		 if(tahmin == gizliSayi) {
			 System.out.println("Tebrikler sayıyı tahmin ettiniz");
			 // tahminHakki = 0;
			 break; // for do while ve while döngülerinde break ile donguden çıkılıyor.
			
		 } else if (tahmin < gizliSayi) {
			 tahminHakki--;
			 if(tahminHakki != 0)
				 System.out.println("Daha yüksek bir sayı tahmin ediniz. Tahmin hakkınız :" + tahminHakki );
		 } else if(tahmin > gizliSayi) {
			 tahminHakki--;
			 if(tahminHakki != 0)
				 System.out.println("Daha düşük bir sayı tahmin ediniz. Tahmin hakkınız :" + tahminHakki );
		 }

	 }
	 
	 System.out.println("Tahmin hakkınız bitti gizli sayi :" + gizliSayi);
	 
	 
	}

}
