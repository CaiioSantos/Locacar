package com.company.Exception;

public class ClienteException extends Exception {

    public class ClientePfException extends Exception {
        public ClientePfException(String textExeption){
            super(textExeption);
        }
    }

}
