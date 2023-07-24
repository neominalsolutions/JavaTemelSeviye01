package app;

import java.text.MessageFormat;
import java.util.Scanner;

public class ArtimeticsSample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
				
				System.out.println("1. sayı giriniz");
				int sayi1 = scanner.nextInt();
				
				System.out.println("2. sayı giriniz");
				int sayi2  = scanner.nextInt();
				
				int toplam = sayi1 + sayi2;
				int carpim = sayi1 * sayi2;
				int bolum = sayi1 / sayi2; 
				int mod = sayi1 % sayi2; // mod alma kalan bulma
				int cikarma = sayi1 - sayi2;
				sayi1++; // sayi1 değerini 1 artırma
				sayi1 += 2; // sayi1 değerini 2 şerli artırma
				
				// sayi1 = sayi1 + 1; // sayi1++;
				// sayi1 = sayi1 + 2; // sayi1+=2;
				// sayi1*=3; // 3*3 = 9;
				
				System.out.println("toplam :" + toplam); // ekranda string veri gösterme formatımız
				// \n enter görevi görür
				System.out.println(String.format("toplam : %s \n carpim: %s \n bolum: %s \n mod: %s \n cikarma: %s \n sayi1: %s", toplam,carpim,bolum,mod,cikarma, sayi1));
				
//				System.out.println("toplam :" + toplam + "carpim : " + carpim + " mod : " + mod);
				
				
				System.out.println(MessageFormat.format("toplam : {0} carpim: {1} bolum: {2}",toplam,carpim,bolum));
				
				
				System.out.println("Deneme");
		
	}
	
}
