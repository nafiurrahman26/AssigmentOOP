package problem3;

import java.util.Scanner;

public class DiuLibary {
    public  int LibaryID;
    public int BookName;
    private String Bookauthor;
    String BookType;
    public double PublishedDate;
    public static void main(String[] args){
        DiuLibary d1=new DiuLibary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the libary id int type: ");
        LibaryID=sc.nextInt();




    }
    //constractor
    DiuLibary(){

    }
    DiuLibary(int a){
        
    }
    
    public String LibaryName(String LibaryName){
        return LibaryName;
    }
    //Mistake in uml:
    public double eBookDetails(double author,double Type){
        double S=author+Type;
        return S;
    }
    public String eBookDetails(String x,String y){
        String S=x+y;
        return S;
    }
    public int BrowedBook(int ID,String Name){
        int x=ID;
        return x;
    }


}
