package problem2;
import java.util.Scanner;

import problem1.test;

public class Test {
    public static void main(String[] args){
        test t=new test();
        Converter_Class c1=new Converter_Class();

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Year: ");
        c1.Year=input.nextInt();
        System.out.print("Enter the Age: ");        
        c1.Age=input.nextInt();
        System.out.print("Enter the Current_Year: ");
        c1.Current_Year=input.nextInt();
        System.out.print("Enter the Dolar: ");
        c1.Dolar=input.nextInt();
        System.out.print("Enter the Fahrenheit: ");
        Converter_Class c2=new Converter_Class(input.nextInt());

        
        System.out.println("Farenheit to celcius: "+ c1.covert_celcious(c1.Fahrenheit));
        
    }
}
   
class Converter_Class{

    Converter_Class(){

    }
    Converter_Class(int x){
        Fahrenheit=x;

    }

    int Year,Age,Current_Year,Dolar,Fahrenheit;

    public int covert_celcious(int fahrenheit){
        int celcious=((fahrenheit-32)*5)/9;
        return celcious;
    }
    public void Cheack_Leap_year(){

    }
    public void Calculate_BirthYEar(){
        
    }
    public double Dolar_to_Taka(int z){
        double taka =z*110;
        return taka;
        
    }



}
