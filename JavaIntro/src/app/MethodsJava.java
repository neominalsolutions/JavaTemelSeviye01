package app;

import java.util.Arrays;

public class MethodsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ali";
		// String Methods
		
	    char c  = name.charAt(0); // a
	    boolean b = name.contains("l"); // l varsa true yoksa false
	    
	    String deger = " ";
	    String deger2 = "";
	    
	    boolean boslukVarmi = deger.isBlank(); //  boşluk karakter mi
		boolean bosDegerMi = deger2.isEmpty(); // boş değer mi
		
		// defalarca kez ilgili yöntemlerin kullanılması ve program yazmamıza yardımcı olması
		
		int maks = Integer.max(4, 20); // 20
		int toplam = Integer.sum(5, 10); // 15
		
		// MethodIsmi(); 
		// String sonuc = MethodIsmi("ali","can");
		
		
	
		MesajYazdır();
		MesajYazdır();
		MesajYazdır(); // paramteresiz hali
		// Method Call Methodları çağırdığımız kısım
		MesajYazdır("mesajımız");
		
		long carpimSonuc = Carp(25,25);
		MesajYazdır("sonuc :" + carpimSonuc);
	}
	
	// Methodlar Buyuk Harf ile yazılır ve bir kod blogu içeren yapılardır.
	// Birşeyi yaz
	// UpperCase
	// Uygulamamızdaki Davranışlar
	// Matematikdeki fonsiyonlar.
	// Method declaration kısmı
	public static void MesajYazdır() {
		System.out.println("Mesaj");
	}
	
	// Paremetre geçişi yaptığımız örnek
	// String mesaj methodun parametresi oluyor. Ve method dışıran değer geçilmesini sağlıyor.
	public static void MesajYazdır(String mesaj) {
		System.out.println(mesaj);
	}
	
	// deger döndüren methodlarımız içerisinde de return ifadeleri oluyor
	// void tipi yerine hesaplama sonucunda hangi tipte değer döndüreceksek bunun tipini tanımlıyoruz.
	public static long Carp(int sayi1, int sayi2) { // hem parametrik hemde değer donduren bir method tanımı yaptık
		return sayi1 * sayi2;
	}
	

}
