import java.util.Scanner;

import java.util.*;

public class TempatureConversion2 {

	static Scanner keyboard;

	public static void main(String[]args){
	
        double ferh = 40;
        getTemp();
        double celcius = ferh -32 * 5/9.0;
        outputTemp("celcius", celcius);
        double kalvin = celcius + 273; 
        outputTemp ("kalvin", kalvin);
        System.out.println("The Converteed Tempature is "+ scale+ "is " + newTemp);
        System.out.println("the charchter at 1 is " + scale.charAt(1));
	}

	public static void outputTemp (String scale, double newTemp)
	{
	}

	public static double calcCelcius(double ferenheit)
       }return celcius;

	{

	public static double getTemp ( )
       }

	double temp;keyboard=new Scanner(System.in);System.out.println("what tempature in ferenheit? ");temp=keyboard.nextDouble();return temp;
}}
