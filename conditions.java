package conditionalStatements;

import java.util.Scanner;
//Age method
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the age");
        int age = sc.nextInt();
       
        if (age>18) 
        {
            System.out.println("adullts");
            
        }else{



            System.out.println("Not Adult");
        }
        // Even Odd Method
        System.out.println("Please enter the number You wanna check even or odd");
        int x = sc.nextInt();
if (x%2==0) {
    System.out.println("The number is Even");
    
}else{
    System.out.println("The Number is odd");
}
// cheking >,< or =
System.out.println("Question check number >,< or =");
int a = sc.nextInt();
int b=sc.nextInt();

if (a==b) {
    System.out.println("The numbers are equals");
    
} else if( a>b){

    System.out.println("a is greater");
    
}else{
    System.out.println("b is greater");
}



    }


    
}


