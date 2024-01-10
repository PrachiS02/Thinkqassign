package com.stringassignmnet1;

public class Alphabetdigitcount {

	public static void main(String[] args) {
		
		String s = "Hello@%&World!#123";

        int upperCount = 0;

        int lowerCount = 0;

        int numCount = 0;

        int specialCharCount = 0;
        
        for(int i = 0; i <s.length(); i++) {

            char ch =s.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                upperCount++;
            }

            else if(ch >= 'a' && ch <= 'z')
            {
                lowerCount++;
            }
            else if(ch >= '0' && ch <= '9')
            {
                numCount++;
            }
            else
            {
                specialCharCount++;
            }

        }

        System.out.println("Oroginal String: "+s);
        System.out.println("Lowercase Count: " + lowerCount);

        System.out.println("Uppercase Count: " + upperCount );

        System.out.println("Numbers Count: " + numCount );

        System.out.println("Special Characters Count: " + specialCharCount);

    }

	}


