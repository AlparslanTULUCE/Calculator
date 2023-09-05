package hesapmakinesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        
        while(true){
            System.out.println("******* Operations *******");
            System.out.println(" 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Faktorial\n 0. EXIT");
            System.out.println("****************************");
            Scanner scanner=new Scanner(System.in);
            
            int firstNumber;
            int secondNumber;
            int fNumber;
            int faktorial=1;
            try{
                System.out.print("SELECT OPERATION:");
                int operation=scanner.nextInt();
                switch(operation){
                    case 0:
                        return;
                    case 1:
                        System.out.print("first number:");
                        firstNumber=scanner.nextInt();
                        System.out.print("second number:");
                        secondNumber=scanner.nextInt();
                        System.out.println("\n"+firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber)+"\n");
                        break;
                    case 2:
                        System.out.print("first number:");
                        firstNumber=scanner.nextInt();
                        System.out.print("second number:");
                        secondNumber=scanner.nextInt();
                        System.out.println("\n"+firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber)+"\n");
                        break;
                    case 3:
                        System.out.print("first number:");
                        firstNumber=scanner.nextInt();
                        System.out.print("second number:");
                        secondNumber=scanner.nextInt();
                        System.out.println("\n"+firstNumber+" x "+secondNumber+" = "+(firstNumber*secondNumber)+"\n");
                        break;
                    case 4:
                        System.out.print("first number:");
                        firstNumber=scanner.nextInt();
                        System.out.print("second number:");
                        secondNumber=scanner.nextInt();
                        while(secondNumber==0){
                            System.out.println("A number cannot be divided by 0");
                            System.out.print("second number:");
                            secondNumber=scanner.nextInt();
                        }
                        System.out.println("\n"+firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber)+"\n");
                        break;
                    case 5:
                        System.out.print("Number:");
                        fNumber=scanner.nextInt();
                        while(fNumber<0){
                            System.out.println("The factorial of a negative number cannot be taken.");
                            System.out.print("Number:");
                            fNumber=scanner.nextInt();
                        }
                        if(fNumber==0){
                            faktorial=1;
                        }else{
                            for(int i=1;i<=fNumber;i++){
                                faktorial*=i;
                            }
                        }System.out.println("factorial of "+fNumber+" = "+faktorial);
                        break;
                }
            }
            catch(InputMismatchException e){
                e.printStackTrace();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("You entered the wrong input, please enter an integer");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
    }

}
