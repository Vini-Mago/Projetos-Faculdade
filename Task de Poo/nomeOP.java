import java.util.ArrayList;

public class nomeOP {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Talles");
        nomes.add("Ana");

        nomes.remove(1);
        System.out.println("Após remover o segundo nome: " + nomes);

        nomes.remove(2);
        System.out.println("Após remover o terceiro nome: " + nomes);

        if (nomes.get(0).equals("Talles")) {
            System.out.println("O primeiro nome é Talles.");
        } else {
            System.out.println("O primeiro nome não é Talles.");
        }
    }
}
