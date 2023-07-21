package Program;

import DenemeLib3.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DenemeLib3.User usr = new DenemeLib3.User("ali");
		System.out.println(usr.getName());
		
		DenemeLib2.User usr1 = new DenemeLib2.User();
		usr1.setName("can");
		System.out.println(usr1.getName());
	}

}
