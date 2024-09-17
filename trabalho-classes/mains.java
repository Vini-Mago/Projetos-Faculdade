public class mains {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Prata", 90000.0, 210, "Gasolina", false);

        Carro carro2 = new Carro("Honda", "Civic", 2018, "Branco", 200);

        Carro carro3 = new Carro();

        System.out.println("=== Informações do Carro 1 ===");
        carro1.mostrarInformacoes();

        System.out.println("\n=== Informações do Carro 2 ===");
        carro2.mostrarInformacoes();

        System.out.println("\n=== Informações do Carro 3 ===");
        carro3.mostrarInformacoes();

        System.out.println("\n--- Manipulando Carro 1 ---");
        carro1.ligar();
        carro1.acelerar(150);
        carro1.frear();
        carro1.alterarPreco(95000.0);
        carro1.pintar("Preto");
        carro1.mostrarInformacoes();
        carro1.desligar();

        System.out.println("\n--- Manipulando Carro 2 ---");
        carro2.alterarPreco(85000.0);
        carro2.setTipoCombustivel("Diesel");
        carro2.ligar();
        carro2.acelerar(180);
        carro2.frear();
        carro2.desligar();
        carro2.mostrarInformacoes();

        System.out.println("\n--- Manipulando Carro 3 ---");
        carro3.setMarca("Ford");
        carro3.setModelo("Focus");
        carro3.setAno(2022);
        carro3.setCor("Azul");
        carro3.setPreco(75000.0);
        carro3.setVelocidadeMaxima(220);
        carro3.setTipoCombustivel("Flex");
        carro3.ligar();
        carro3.acelerar(200);
        carro3.frear();
        carro3.mostrarInformacoes();
        carro3.desligar();
    }
}
