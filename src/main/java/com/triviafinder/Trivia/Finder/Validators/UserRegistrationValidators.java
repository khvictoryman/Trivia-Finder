/*
package com.triviafinder.Trivia.Finder.Validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationValidators {

    /// Need to verify the validity of the email
    // Java program to check if an email address
    // is valid using Regex.

    public class EmailTest
    {
        public static boolean isValid(String email)
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pat.matcher(email).matches();
        }

        */
/* driver function to check *//*

        public static void main(String[] args)
        {
            String email = "contribute@geeksforgeeks.org";
            if (isValid(email))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
    /// Need to verify the password
    class PasswordValidator
    {
        public PasswordValidator()
        {
            super();
        }

        public static void main(String[] args)
        {
            PasswordValidator passwordValidator = new PasswordValidator();

            String userName = "techdive";
            String passWord = "java2011";
            System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);

            passwordValidator.passwordValidation(userName,passWord);
            System.out.println();
            passWord = "Java2011*";
            System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
            passwordValidator.passwordValidation(userName,passWord);
        }

        */
/*
         * Password should be less than 15 and more than 8 characters in length.
         * Password should contain at least one upper case and one lower case alphabet.
         * Password should contain at least one number.
         * Password should contain at least one special character.
         *//*


        public void passwordValidation(String userName, String password)
        {
            boolean valid = true;
            if (password.length() > 15 || password.length() < 8)
            {
                System.out.println("Password should be less than 15 and more than 8 characters in length.");
                valid = false;
            }
            if (password.indexOf(userName) > -1)
            {
                System.out.println("Password Should not be same as user name");
                valid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                System.out.println("Password should contain atleast one upper case alphabet");
                valid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars ))
            {
                System.out.println("Password should contain atleast one lower case alphabet");
                valid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                System.out.println("Password should contain atleast one number.");
                valid = false;
            }
            String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            if (!password.matches(specialChars ))
            {
                System.out.println("Password should contain atleast one special character");
                valid = false;
            }
            if (valid)
            {
                System.out.println("Password is valid.");
            }
        }
    }

    /// Need to check if the username is taken

    /// Need to check to see if the email is already taken

    /// Need to check the validity of the zip code


}
*/
