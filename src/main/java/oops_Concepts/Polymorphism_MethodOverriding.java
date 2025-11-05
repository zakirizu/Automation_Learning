package oops_Concepts;

import java.security.SecureRandom;

public class Polymorphism_MethodOverriding {

	
	
	  private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    private static final SecureRandom random = new SecureRandom();

	    public static String generateRandomText(int length) {
	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(CHARACTERS.length());
	            sb.append(CHARACTERS.charAt(index));
	        }
	        return sb.toString();
	    }


}
