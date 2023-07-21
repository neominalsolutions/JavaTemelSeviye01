package com.main;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.crm.User;

//Control Boşluk kullanımı ile intellisense geliyor
//Ctrl+Shift+F. // Kodları düzenli hale getirme
//Ctrl + /  kodları açıklama satırı yapar ve geri alır
//Summaray için /** enter

// Ctrl+F find and replace

/*
* 
* deneme 1
* 
*/

// java String.format %s yapılır

// string interpolation için string format ve messageformat kullanılır.
// string builder sınıfıda kullanabilir

// windows > Preferences > Text Editors > Enable WordWrap

// ctrl- kod blogunu kapatır. region formatı
// ctrl+  kod blogunu açar

// java proje açarken module-info.java dosyası seçildiyse pakage default package olmamalıdır.
// yada module-info.java dosyasını açmayız.

// window > show view > project explorerdan gösterebiliriz. (Project Explorer ve Console Errors buradan gösterilir)
// hatalar ve uyarılar problems tabına düşer.

public class Main {


	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		User usr = new User();
//		com.erp.User usr2 = new com.erp.User();
		usr.setName("Ali");
		usr.setAge(18);
		
		
		
		System.out.println(usr.getName());
		System.out.println(String.format("user %s age %s", usr.getName(), usr.getAge()));
		System.out.println(MessageFormat.format("user {0} age {1}", usr.getName(), usr.getAge()));
		System.out.println(new StringBuilder().append("user :").append(usr.getName()).append(" age :").append(usr.getAge()));
	
		LocalDate today = LocalDate.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		int day = today.getDayOfYear();
		System.out.println(day);
		
		int hour = datetime.getHour();
		System.out.println(hour);
		
		System.out.println(today);
		System.out.println(datetime);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		String formattedDate = myFormatObj.format(datetime);
		
		System.out.println(formattedDate);
		
		final double PI_SAYISI = 3.14; // sabit tanımı
		
//		PI_SAYISI = 5;
		
		TestFinal f = new TestFinal();
		f.FinalMethod();
		
//		TestFinal.Id = 5;
		TestFinal.Id2 = 6;
		
		
		
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		      // genel şeyler için throw new Error kullanılır.
		      throw new Error("Access Denied");		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }

	}

}
