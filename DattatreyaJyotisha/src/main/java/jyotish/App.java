package jyotish;

import jyotish.horoscope.HoroscopeFactory;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(ProcessHoroscope.processHoroscope(HoroscopeFactory.createHoroscopeC()));	
    }
    
    
}


