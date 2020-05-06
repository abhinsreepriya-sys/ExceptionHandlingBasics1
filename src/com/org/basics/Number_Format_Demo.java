package com.org.basics;

class  Number_Format_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            // "abci" is not a number 
            int num = Integer.parseInt ("abci") ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
    } 
} 
