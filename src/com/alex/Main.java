package com.alex;

public class Main {

    public static void main(String[] args) {
	String ansver =getDurationStirng(70, 28);
        System.out.println(ansver);

        ansver =getDurationStirng(5000);
        System.out.println(ansver);


    }

    public static String getDurationStirng(int minutes, int seconds)
    {
        if (minutes>=0 && seconds >=0 && seconds <=59)
        {
         int hours = minutes/60;
         minutes = minutes % 60;
         return (hours + "h " + minutes + "m " + seconds + "s");
        }


        return "Invalid value";
    }
    public static String getDurationStirng(int seconds)
    {
       if (seconds >= 0)
       {
        int minutes = seconds/60;
        seconds = seconds % 60;
        return getDurationStirng(minutes,seconds);

       }


        return "Invalid value";

    }
}
