import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a temperatura:");
            int temperatura = scanner.nextInt();
            
            if (temperatura > 30) {
                System.out.println("O clima está quente.");
            } else {
                System.out.println("O clima está frio.");
            }
        }
    }
}
