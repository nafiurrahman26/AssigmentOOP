package Problem5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MovieClass m=new MovieClass();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Avater Director Name: ");
        m.Avatar_DirectorName=sc.nextLine();
        System.out.print("Enter the Avater Hovvit_DirectorName: ");
        m.Hovvit_DirectorName=sc.nextLine();
        System.out.print("Enter the Avater Loard_of_Ring_Director_Name: ");
        m.Loard_of_Ring_Director_Name=sc.nextLine();

        
    }
    
}

class MovieClass{
    public String Avatar_DirectorName;
    public String Hovvit_DirectorName;
    public String Loard_of_Ring_Director_Name;
    public int Avatar_Rating,Hovvit_Rating,Loard_of_Ring_Director_Rating;
    public int Release_Avatar,Release_Hovvit,Release_Loard_of_Ring_Director;


    public void Movi_Information(int Rating){

    }
    public void Movi_Relise_Year(int Rating){

    }

}
