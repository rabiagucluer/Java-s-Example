
package SecondDay;

import java.util.Scanner;

public class SecondExamp {
        public static void main(String[] args){
        //Soru:Kullanıcının çıkarma işlemi tahmini yapacak program
        
        //iki tane tek basamaklı random tam sayı üretilecek
        
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        
        //Şimdi ise 1. sayı 2. den küçükse swap işlemi yapılacak
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
            
        }
        
               //Kullanıcıya sayıların farkı sorulur
        System.out.println("What is" +num1+ "-"+num2+"?");
        Scanner input= new Scanner(System.in);
        int answer=input.nextInt();
        
        //şimdi verilen sonuc tahmini ile asıl sonucu karşılaştırıyorz.
        if(num1-num2==answer)
            System.out.println("you are correct");
        else{
            System.out.println("Your answer is wrong");
            System.out.println(num1+" - "+num2+" should be "+(num1-num2));
        
         
   
        }
    }
    
}
