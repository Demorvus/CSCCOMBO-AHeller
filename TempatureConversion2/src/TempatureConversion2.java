import java.util.*; 
public class TempatureConversion2 {
  static Scanner keyboard;
  public static void main(String[]args){
    double ferenheit = 40; 
    ferenheit = getTemp(); 
    double celcius = calcCelcius(ferenheit); 
    outputTemp("Celcius", celcius + ""); 
    double kalvin = celcius + 273;
    outputTemp ("Kalvin", kalvin + ""); 
    String scale = "Ferenheit"; 
    String newTemp = ferenheit + ""; 
    System.out.println("The Converted Temperature is "+ scale+ " is " + newTemp);
    System.out.println("the character at 1 is " + scale.charAt(1));
  }
  public static void outputTemp (String scale, String newTemp) {
    System.out.println("The temperature in " + scale + " is " + newTemp);
  }
  public static double calcCelcius(double ferenheit) {
    double celcius = (ferenheit - 32) * 5 / 9.0;
    return celcius;
  }
  public static double getTemp ( ) {
    double temp;
    keyboard=new Scanner(System.in);
    System.out.println("what temperature in ferenheit? ");
    temp=keyboard.nextDouble();
    return temp;
  }
}