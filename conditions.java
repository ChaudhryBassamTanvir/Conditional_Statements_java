package conditionalStatements;

import java.util.Scanner;
//Age method
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Please Enter the age");
       
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

    }
    
}


