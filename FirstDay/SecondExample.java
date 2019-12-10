

package FirstDay;

import java.util.Scanner;

public class SecondExample {
        public static void main(String[] args){
        
     /*  double c;
        c=(double)21/5;
        
        System.out.println(c);
        
        System.out.println(1.0 - 0.9);  */      
        
        //Soru:
        //0-1000 arasında kullanıcıdan bir sayı al. Aldığın sayıların basamak değerlerini topla

        int k=1;
        do {
        int i=k++%2;
        if( i==1 )
        System.out.print(k);
        else
        System.out.println(k);
        }while(k<10);
            Scanner input=new Scanner(System.in);
            
            System.out.println("Enter a number between 0 and 1000: ");
            int num=input.nextInt();
            
            int f=num%10;
            int s=num/10;
            int t=s%10;
            int d=s/10;
            
            System.out.println("The f is  " + f);
            System.out.println("The s is  " + s);
            System.out.println("The t is  " + t);
            System.out.println("The d is  " + d);
            System.out.println("The sum of the digits is "+(f+t+d));


 
/*    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your score: ");
        int score = input.nextInt();
        
        
        if(score>=90)
            System.out.println("Your letter note is AA ");
            else if(score>=80)
                System.out.println("Your letter note is BA");
            else if(score>=70)
                System.out.println("Your letter note is BB");
            
            else
                System.out.println("your letter score is FF");
        
        
    }*/
            
}

    
}
