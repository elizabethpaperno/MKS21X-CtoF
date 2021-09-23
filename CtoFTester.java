// The celsiusToFahrenheit() should take degrees in Celsius as a parameter and return degrees in fahrenheit. The method fahrenheitToCelsius() should take degrees in fahrenheit as a parameter, and return degrees in Celsius. These parameters should be passed in as doubles, because degrees can be floating point numbers. The return type should also be a double, sd this is required to maintain accuracy.

public class CtoFTester{
  public static double celsiusToFahrenheit(double cel){
    return (cel * 9/5 + 32);
  }
  public static double fahrenheitToCelsius(double far){
    return ((far - 32) * 5/9);
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(0)); //should return 32
    System.out.println(fahrenheitToCelsius(32)); //should return 0
  }
}
