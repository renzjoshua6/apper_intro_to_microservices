package com.company;

public class YoungBookError extends Exception{
    public YoungBookError(){
        System.out.println("Book is less than 3 years old");
    }
}
