import java.util.*;

class Conditions{

public static void main(String[] args) {
    
    //Only if else conditons
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Value1: ");
    int X = sc.nextInt();

    if(X>=18){

        System.out.println("He/She is an Adult person");

    } else{

        System.out.println("He/She is not an Adult person");
    }


    //find a value even or odd

    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter a Value2: ");
    int X1 = sc1.nextInt();
    if(X1 % 2 == 0){
        
        System.out.println("The number is Even");

    } else{

        System.out.println("The number is Odd");
    }


    //Find a result for use A>B A=B A<B
    Scanner Sc2 = new Scanner(System.in);
    System.out.print("Enter A Value3: ");
    int A1 = Sc2.nextInt();
    System.out.print("Enter B Value4: ");
    int B1 = Sc2.nextInt();

    if(A1>B1){
        System.out.println("A's Value is greater than B");

    } else if(A1==B1){
        System.out.println("Both value are Equal");

    } else if (A1<B1){
        System.out.println("A's Value is less than B");
    } else{
        System.out.println("Value is invlid");
    }


    //Swith and break conditions

    Scanner Sc3 = new Scanner(System.in);
    System.out.print("Enter A value for Button: ");
    int Button = Sc3.nextInt();
    switch (Button) {
        case 1:
            System.out.println("Fan switch ON");
            break;

        case 2: 
            System.out.println("Fan switch OFF");
            break;
    
        case 3: 
            System.out.println("Light switch ON");
            break;

        case 4: 
            System.out.println("Light switch OFF");
            break;

        default:
            System.out.println("Electricity Gone!");
            break;
    }

}


}