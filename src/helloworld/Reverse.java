/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author Aryan patel
 */
public class Reverse {
    public static void main(String[] args){
      //  char a;
        //String [] e ="";
      //  String [] Arr = new String[18];
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("Enetr The word");
      //  String Arr1=sc.nextLine();
       //char [] Arr2= new char[]{};
       
      //  for(int i=0;i<Arr.length;i++){
      //      a = Arr1.charAt(i);
      //      e=a+e;
      //  }
      //  System.out.print(e);
         
       
        String str= "Geeks", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
    
        
    



//reverse[i]=word.charAt(i);