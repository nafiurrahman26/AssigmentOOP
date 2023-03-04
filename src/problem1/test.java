package problem1;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        PizzaSlice f=new PizzaSlice();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the double value Angle1: ");
        f.Angle1 = input.nextDouble();
        System.out.print("Enter the double value Angle2: ");
        f.setDo(input.nextDouble());
        System.out.print("Enter the int value Angle3: ");
        f.Angle3=input.nextInt();
        PizzaSlice f1=new PizzaSlice(2.3434d,3.3434d);
        double Angle2=f.getDo();
        System.out.println("The area is: "+f.Area(f.Angle1,Angle2));

        

    }
    
}
class PizzaSlice{
    public double Angle1;
    private double Angle2;
    int Angle3;
    public double Height;
    public double Bas;
    
    public void setDo(Double Angle2){
        this. Angle2=Angle2;
    }
    public double getDo(){
        return Angle2;
    }

    PizzaSlice(){

    }
    PizzaSlice(double a,double b){
        this.Height=a;
        this.Bas=b;

    }

    public void ShapeName(){
        
        }
    public double Area(double a,double b){
        

        return a*b;
    }
    public void CheackTriangle(){

    }
    public void CheckRightAngleTruagle(){

    }

}
