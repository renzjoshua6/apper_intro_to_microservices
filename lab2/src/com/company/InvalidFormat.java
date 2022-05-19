package com.company;

public class InvalidFormat extends Exception{
    public InvalidFormat(){
        System.out.println("ERROR: Fields should not be empty!");
    }
}
