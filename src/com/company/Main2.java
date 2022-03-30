import java.sql.SQLOutput;

public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul adunarii este: " + sum(3, 5));

        int result2 = substract(5, 4);
        System.out.println("Rezultatul scaderii este: " + result2);

        System.out.println(result - result2);

        System.out.println("Hello \nAndreea");

        int result3 = multiply(9, 5);
        System.out.println("Rezultatul inmultirii este: " + result3);

        int result4 = divide(21, 3);
        System.out.println("Rezultatul impartirii este: " + result4);

        System.out.println("    J     a    v     v    a");
        System.out.println("    J    a a    v   v   a  a");
        System.out.println("J   J   aaaaa    V V   aaaaa");
        System.out.println("  JJ   a     a    V   a     a");

        System.out.println(" +'''''''''+");
        System.out.println("[ |  o  o  | ]");
        System.out.println("  |    ^   |");
        System.out.println("  |   '_'  |");
        System.out.println("  +________+ ");

        System.out.println("Media numerelor este: " + avr(7,5,9) );

        int result5 = modulus(8, 9);
        System.out.println("Rezultatul restului impartirii celor doua numere este:" + result5);


    }



    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int divide(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static void printMyName(){
    }

    public static double avr(int a, int b, int c) {

        return (a + b + c) / 3;
    }

    public static int modulus(int firstNumber, int secondNumber) {
        int result = firstNumber % secondNumber;
        return result;
    }








    }