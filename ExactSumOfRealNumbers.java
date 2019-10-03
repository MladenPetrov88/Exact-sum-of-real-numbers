import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < num; i++) {
            BigDecimal numbers = new BigDecimal(scanner.next());
            sum = sum.add(numbers);
        }
        System.out.println(sum);
    }
}
