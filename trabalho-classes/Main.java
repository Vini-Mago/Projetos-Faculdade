public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos Silva", 30, "Masculino", 1.75, 75.0, "Brasileira", "Solteiro", "Engenheiro", "123.456.789-10", "Rua A, 123");

        Pessoa pessoa2 = new Pessoa("Ana Souza", 25, "Feminino", 1.65, 60.0, "Brasileira", "Casada", "Designer", "987.654.321-00", "Rua B, 456");

        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Sexo: " + pessoa1.getSexo());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("Nacionalidade: " + pessoa1.getNacionalidade());
        System.out.println("Estado Civil: " + pessoa1.getEstadoCivil());
        System.out.println("Profissão: " + pessoa1.getProfissao());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Endereço: " + pessoa1.getEndereco());

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Sexo: " + pessoa2.getSexo());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Peso: " + pessoa2.getPeso());
        System.out.println("Nacionalidade: " + pessoa2.getNacionalidade());
        System.out.println("Estado Civil: " + pessoa2.getEstadoCivil());
        System.out.println("Profissão: " + pessoa2.getProfissao());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("Endereço: " + pessoa2.getEndereco());
    }
}
