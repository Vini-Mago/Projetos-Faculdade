import java.util.Scanner;

public class manipular {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite uma string:");
            String input = scanner.nextLine();
            
            int length = input.length();
            System.out.println("Número de caracteres: " + length);
            
            String upperCaseString = input.toUpperCase();
            System.out.println("String em maiúsculo: " + upperCaseString);
            
            int vowelCount = 0;
            for (char c : input.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("Número de vogais: " + vowelCount);
            
            boolean startsWithUNI = input.toLowerCase().startsWith("uni");
            System.out.println("Começa com 'UNI': " + startsWithUNI);
            
            boolean endsWithRIO = input.toLowerCase().endsWith("rio");
            System.out.println("Termina com 'RIO': " + endsWithRIO);
        }
    }
}
