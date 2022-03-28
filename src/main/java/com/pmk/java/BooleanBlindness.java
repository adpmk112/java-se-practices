package com.pmk.java;
class BooleanBlind
{     
     boolean standing;
     public void ticket(boolean standing)
    {
        if(standing)
        {
            System.out.println("Standing ticket.");
        }
        else
        {
            System.out.println("Sitting ticket");
        }
    }
}

class BooleanBlindDemo{
    public static void main(String[] args) {
        BooleanBlind demo = new BooleanBlind();
        demo.ticket(true); //depand on boolean is bad code
    }
}
