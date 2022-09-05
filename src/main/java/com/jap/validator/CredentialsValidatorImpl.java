package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password){

        CredentialsValidator credentialsValidator = (name1,password1) ->{
            if (name1.equalsIgnoreCase("admin") && password1.equals("1234")){
                return "valid user";
            }
          return "invalid user";
        };

      return credentialsValidator.validateUser(name,password);
    }



}
