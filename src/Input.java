import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int inputNumber(String inputMessage, String errorMessage,int option) {
        Scanner input = new Scanner(System.in);
        int valueInput;
        while (true) {
            System.out.println(inputMessage);
            try {
                valueInput = input.nextInt();
                if (valueInput > option && option != 0) {
                    throw new InputMismatchException();
                }
                input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                input.nextLine();
            }
        }
        return valueInput;
    }
}
