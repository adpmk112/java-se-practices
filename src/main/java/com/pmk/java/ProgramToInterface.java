package com.pmk.java;
interface Programming
{
    void show();
}

class Java implements Programming
{
    @Override
    public void show()
    {
        System.out.println("Java Programming");
    }
}
class Csharp implements Programming
{
    @Override
    public void show()
    {
        System.out.println("Csharp Programming");
    }
}
public class ProgramToInterface {
        public static void main(String[] args) {
          /*  Csharp csharp = new Csharp();
            csharp.show();  // Should not write like this (concrete class) */
            Programming programming = new Java();
            programming.show(); 
        }   
}
