public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int velocidadeMaxima;
    private String tipoCombustivel;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, String cor, double preco, int velocidadeMaxima, String tipoCombustivel, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tipoCombustivel = tipoCombustivel;
        this.ligado = ligado;
    }

    public Carro(String marca, String modelo, int ano, String cor, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = 0.0;
        this.tipoCombustivel = "Desconhecido";
        this.ligado = false;    
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        this.cor = "Sem cor";
        this.preco = 0.0;
        this.velocidadeMaxima = 0;
        this.tipoCombustivel = "Desconhecido";
        this.ligado = false;
    }


    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar(int velocidade) {
        if (ligado && velocidade <= velocidadeMaxima) {
            System.out.println("O carro está acelerando a " + velocidade + " km/h.");
        } else if (!ligado) {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        } else {
            System.out.println("Velocidade " + velocidade + " km/h excede a velocidade máxima de " + velocidadeMaxima + " km/h.");
        }
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void mostrarInformacoes() {
        System.out.println("===== Informações do Carro =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Está Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("================================");
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("O carro foi pintado de " + novaCor + ".");
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("O preço do carro foi alterado para R$ " + novoPreco + ".");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}