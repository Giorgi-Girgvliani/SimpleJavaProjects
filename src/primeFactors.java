//10.5
import java.util.Scanner;
public class primeFactors {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive int: ");
        int posInt = input.nextInt();

        for (int i = 2; i <= posInt; i++) {
            while (posInt % i == 0){
                posInt/=i;
                stackOfIntegers.push(i);
            }
        }
        while(!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop());
            if (!stackOfIntegers.empty()) System.out.print(", ");
        }
        System.out.print(".");
    }
}
