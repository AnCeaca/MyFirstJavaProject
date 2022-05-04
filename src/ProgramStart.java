import com.company.calculator.Calculator;
import com.company.calculator.Read;

public class ProgramStart {
    Calculator calc = new Calculator();
    Read read = new Read();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Modulus\n" +
                "6. ...\n" +
                "0. Exit\n");
    }

    public boolean runMenuOption(){
        printMenu();
        int option = read.getInt();
        switch (option){
            case 1:
                doSum();
                return true;
            case 2:
                doSubtraction();
                return true;
            case 3:
                doMultiplication();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                doModulus();
                return true;
            case 0:
                System.out.println("Thank you!");
                return false;
            default:
                System.out.println("Incorrect option. Try again.");
                return true;
        }
    }

    public void runProgram() {
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }

    private void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum result is: " + calc.sum(first, second));
    }

    private void doSubtraction(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The subtraction result is: " + calc.subtract(first, second));
    }

    private void doMultiplication(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The multiplication result is: " + calc.multiply(first, second));
    }

    private void doDivision(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The division result is: " + calc.divide(first, second));
    }

    private void doModulus(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The modulus result is: " + calc.modulus(first, second));
    }



}
