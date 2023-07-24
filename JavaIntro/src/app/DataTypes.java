package app;

import java.text.MessageFormat;
import java.util.Scanner;

public class DataTypes {

	// Breakpoint ile kodu debug modda çalıştırmak için bir durdurma noktası tanımlıyoruz.
	public static void main(String[] args) {
		
		// kısayol kullanımlar CTRL + / seçili yeri yorum satırı yap
				// Kod blogu bozulursa CTRL + SHIFT + F
				// CTRL + Space 

			
					// TODO Auto-generated method stub
					// Değişken Tanımlama yapıları ve Tiple
					// Data Types and Variables
					System.out.println("Java");
					// out output
					// in input
					
//					User usr = new User();
//					models.User usr2 = new models.User();
					
					
					// JAVA dilinde 4 farklı veri tipi kategorisi var
					// metinsel ifadeler için
					// tamsayı ifadeleri için
					// kesirli sayı ifadeleri için
					// mantıksal işlemleri tanımlamak için 
					
					// veriTipi degiskenİsmi = "";  
					String mesaj = "Metin1"; 
					// tamsayı tipleri
					int sayi1 = 1;  // -2,147,483,648 to 2,147,483,647 4 Byte
					long sayi2 = 2; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 8 byte
					byte sayi3 = 3; // -128 to 127 1 Byte
					short sayi4 = 4; // -32,768 to 32,767 2 Byte
					
					int sonuc = sayi1 + sayi4;
					long sonuc1 = sayi1 + sayi2; // int + long çıktı long olmalı
					
					int sonuc2 = sayi1 + (int)sayi2; // sayi2 ilgili kod blogunda long tipinden int tipine çevirilmiş olur.
					
					// kesirli sayi tipleri
					float f = 0.5f; // 6 to 7 decimal digits 4 Byte
					double d = 10.243545; // storing 15 decimal digits 8 byte
					
					// mantıksal ifadeler için kullanılan veri tipi
					boolean bekarMi = false; // true yada false
					// uygulama içerisinde uygulamanın evet yada hayır durumlarına göre karar vermesini sağlar.
					
					char c = 'c'; // tek tırnak kullanılır. sadece tek bir karakteri ifade eder.
					
					// Primative veri tipi diyoruz. Java dilinde önceden tanımlanmış olan veri tiplerimiz
					// İstisna String javada tanımlanmış non-primative bir veri tipidir. Reference type olarak çalışır. 
					
					// Değişken tanımlarken dikkat etmemiz gereken kurallar
					// türkçe karakter kullanmıyoruz
					// _ ve $ ile başlayan değişken tanımlamaları önerilmiyor.
					// yasaklı kelimeleri değişken ismi olarak veremiyoruz.
					// eğer değşiiken ismi uzun ve 2 kelimeden oluşuyor camelCase
					// değişken isimleri küçük harfler ile başlıyorlar.
					// final keyword değişken değer tanınırken atanıyor. daha sonra değişkene değer ataması yapamıyoruz.
					
					//int 10sayi = 10;
					int sayi10 = 10;
					int $sayi = 11; // php developer
					int _sayi = 11; // underscore _ ifadeler ile tanımla. private değişken tipleri
					// int int = 12; // java ortamında kullanılan ifadeler değişeken ismi olmaz.
					int tahminiSayi = 45;  // final ifadelerimizi sabit değerlerimiz Buyukharfler ile tanımlamak JAVA bir kod standartı
					
					final int  sayi56 = 5; // const sabit değer tanımlaması
					// sayi56 = 78;
					final int SAYI56 = 5;
	}

}
