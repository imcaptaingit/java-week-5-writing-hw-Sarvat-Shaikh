package programme_1_Calculator;
/**
 * Created by Sarvat Shaikh
 */
/*
Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with the name “Calculator” and “homework_week_9.calculate.Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method, and it does not
return anything. But it has two parameters with the name “int a” and “int
b”. Also, each method have System.out.println(). This prints the result.
Also create all one of more methods with name “calculateResult” with
three parameters with name int 'a' int b and char symbol. Write the logic
in calculateResult method that when a user enters first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into the main class. It has a scanner that takes user
input. Also write the logic that it asks user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respectively
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enters Y program asking the user to enter First Number, and if user enter
N programme should terminate)
 */
public class Calculator {
    // method to calculate Addition
    public void addition(int a, int b){
        System.out.println("Addition of " + a + " and " + b + " is : "+ (a+b));
    }
    //method to calculate the Subtraction
        public void subtraction(int a, int b){
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a-b));
    }
    //method to calculate the Division
         public void Division(int a, int b){
        System.out.println("Division of " + a + " and " + b + " is : " + (a/b));
    }

    //method to calculate the Multiplication
    public void Multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a*b));
    }

    //Method to calculate the result
    public void calculateResult(int a, int b, char symbol){
        if (symbol == '+'){
            addition(a,b);
        }else if (symbol == '-'){
            subtraction(a,b);
        } else if (symbol == '/') {
            Division(a,b);
        } else if (symbol == '*') {
            Multiplication(a,b);
        } else{
            System.out.println("Invalid Input !!! "); // Warning message for an invalid entry
        }
    }
}
