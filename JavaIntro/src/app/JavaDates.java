package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class JavaDates {

	public static void main(String[] args) {
		// Non-primative Types
		// String, Wrapper Class, Integer
		// Collections, Array (newlenen yapılar) refernce types
		// Date
		// sadece tarih bilgisi ile çalışıyoruz
		LocalDate bugun = LocalDate.now(); // bugunün tarihi
		// YIL AY GUN formatında bir değer döndür
		System.out.println(bugun);
		
		LocalDateTime bugunTarihSaat = LocalDateTime.now();
		System.out.println(bugunTarihSaat);
		// dd/MM/yyyy 
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// mm dakika cinsinden
		// HH saat cinsinden
		// dd gun cinsinden 07, 11
		// MM ay cinsinden
		// yyyy yıl cinsinde
		
		 String formatlanmisTarih = bugun.format(dt2);
		 String bugunTarihSaatFormatli = bugunTarihSaat.format(dt);
		 System.out.println("bugun :" + formatlanmisTarih);
		 System.out.println("bugun :" + bugunTarihSaatFormatli);
		 
		 int yilinHangiGunu = bugun.getDayOfYear();
		 System.out.println("yilinHangiGunu " + yilinHangiGunu);
		 
		 int ayinHangiGununde = bugun.getDayOfMonth();
		 System.out.println("ayinHangiGununde " + ayinHangiGununde);
		 
		 // enum dediğimiz bir tipi sabit bir liste 
		 DayOfWeek haftaninGunu = bugun.getDayOfWeek();
		 System.out.println(haftaninGunu.toString());
		 
		 Month ay = bugun.getMonth();
		 System.out.println(ay);
		 
		
	}
}
