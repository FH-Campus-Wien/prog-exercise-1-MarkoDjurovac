package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println( "Hello World!" );
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println( "0123456789012345678901" );
        System.out.println( "         __" );
        System.out.println( " _(\\    |@@|" );
        System.out.println( "(__/\\__ \\--/ __" );
        System.out.println( "   \\___|----|  |   __" );
        System.out.println( "       \\ }{ /\\ )_ / _\\" );
        System.out.println( "       /\\__/\\ \\__O (__" );
        System.out.println( "      (--/\\--)    \\__/" );
        System.out.println( "      _)(  )(_" );
        System.out.println( "     `---''---`" );
    }

    //todo Task 3
    public void sumOfLiterals(){
        char literal_char = 'Z';
        int literal_int_oct = 012;
        long literal_long = 80L;
        double literal_double_e_num = 44e-1f;
        float literal_float = 5.5f;
        double literal_double_e_num2 = 8.88e1;
        int literal_int_hex = 0xface;
        double literal_double = 99.9;

        int sum = (int)literal_char + literal_int_oct + (int)literal_long + (int)literal_double_e_num +
                (int)literal_float + (int)literal_double_e_num2 + literal_int_hex + (int)literal_double;

        System.out.println( sum );
    }

    //todo Task 4
    public void addTwoNumbers(){
        int num1;
        int num2;

        Scanner scanner = new Scanner( System.in );
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println( ( num1 + num2 ) );
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1;
        int n2;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "n1: " );
        n1 = scanner.nextInt();
        System.out.print( "n2: " );
        n2 = scanner.nextInt();

        if( n1 > n2 )
        {
            System.out.println( "n1 > n2" );
        }
        else if( n2 > n1 )
        {
            System.out.println( "n2 > n1" );
        }
        else
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int revenue;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Enter annual Revenue: " );
        revenue = scanner.nextInt();

        if( revenue < 0 || revenue >= 100000 )
        {
            System.out.println( "Invalid Revenue" );
        }
        else if( revenue >= 0 && revenue < 20000 )
        {
            System.out.println( "Poor Sales Revenue" );
        }
        else if( revenue >= 20000 && revenue < 50000 )
        {
            System.out.println( "Average Sales Revenue" );
        }
        else if( revenue >= 50000 && revenue < 80000 )
        {
            System.out.println( "Good Sales Revenue" );
        }
        else
        {
            System.out.println( "Excellent Sales Revenue" );
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}