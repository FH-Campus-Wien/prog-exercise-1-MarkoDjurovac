package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    public void sayHelloWorld(){
        System.out.println( "Hello World!" );
    }

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

    public void sumOfLiterals(){
        char literal_char = 'Z';
        int literal_int_oct = 012;
        long literal_long = 80L;
        float literal_float = 44e-1f;
        float literal_float2 = 5.5f;
        double literal_double_e_num = 8.88e1;
        int literal_int_hex = 0xface;
        double literal_double = 99.9;

        int sum = (int)literal_char + literal_int_oct + (int)literal_long + (int)literal_float +
                (int)literal_float2 + (int)literal_double_e_num + literal_int_hex + (int)literal_double;

        System.out.println( sum );
    }

    public void addTwoNumbers(){
        int num1;
        int num2;
        Scanner scanner = new Scanner( System.in );

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println( ( num1 + num2 ) );
    }

    public void swapTwoNumbers(){
        int x;
        int y;
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Before Swap:" );
        System.out.print( "x: " );
        x = scanner.nextInt();
        System.out.print( "y: " );
        y = scanner.nextInt();

        /*
         * XOR-Swapping:
         * e.g. x = 3, y = 4 -> x = 3 ^ 4 = 7
         * y = x ^ y = 7 ^ 4 = 3 -> y = 3
         * x = x ^ y = 7 ^ 3 = 4 -> x = 4
         */
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println( "After Swap:" );
        System.out.println( "x: " + x );
        System.out.println( "y: " + y );
    }

    public void compareTwoNumbers(){
        int n1;
        int n2;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "n1: " );
        n1 = scanner.nextInt();
        System.out.print( "n2: " );
        n2 = scanner.nextInt();

        if( n1 > n2 ){
            System.out.println( "n1 > n2" );
        }
        else if( n2 > n1 ){
            System.out.println( "n2 > n1" );
        }
        else{
            System.out.println( "n1 == n2" );
        }
    }

    public void ratingSalesPerson(){
        int revenue;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Enter annual Revenue: " );
        revenue = scanner.nextInt();

        if( revenue < 0 || revenue >= 100000 ){
            System.out.println( "Invalid Revenue" );
        }
        else if( revenue >= 0 && revenue < 20000 ){
            System.out.println( "Poor Sales Revenue" );
        }
        else if( revenue >= 20000 && revenue < 50000 ){
            System.out.println( "Average Sales Revenue" );
        }
        else if( revenue >= 50000 && revenue < 80000 ){
            System.out.println( "Good Sales Revenue" );
        }
        else{
            System.out.println( "Excellent Sales Revenue" );
        }
    }

    public void getCommissionRate(){
        int commissionClass;
        float commissionRate;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Enter CommissionClass: ");
        commissionClass = scanner.nextInt();

        switch( commissionClass ){
            case 1:
            case 2:
            case 3:
            case 4:
                commissionRate = (float)commissionClass / 100;
                System.out.println( "Your Commission Rate was set to " + commissionRate );
                break;
            default:
                System.out.println( "Your Commission Rate was set to 0.0" );
                break;
        }
    }

    public void leapyear(){
        int year;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Year: ");
        year = scanner.nextInt();

        if( ( year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0 ) ){
            System.out.println( "Leapyear" );
        }
        else{
            System.out.println( "Not a Leapyear" );
        }
    }

    public void transposedNumbers(){
        System.out.print( "Number: " );
        Scanner scanner = new Scanner( System.in );

        int number = scanner.nextInt();
        int numberReversed = 0;

        while( number != 0){
            // get last digit from number, e.g. 456 % 10 = 6
            int digit = number % 10;

            /*
             * multiply by 10 to get a zero next to number
             * e.g. number = 45, numberReversed = 6, digit = 5
             * -> 6 * 10 + 5 = 65
             */
            numberReversed = numberReversed * 10 + digit;

            // dividing by 10 removes the last digit, e.g. 456 -> 45
            number /= 10;
        }

        System.out.println( numberReversed );
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