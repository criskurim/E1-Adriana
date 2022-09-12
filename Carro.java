public class Carro {
    
    // atributos
    String marca;
    String modelo;
    String cor;
    Integer ano;
    
    // construtor
    Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
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
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Integer getAno() {
        return ano;
    }

    public void setCor(Integer ano) {
        this.ano = ano;
    }

    interface IDadosCarro
    {
        String getDados();
    }
    
    public class DadosCarro implements IDadosCarro
    {
        public String getDados() {
            return Carro.this.getMarca() + ", " + Carro.this.getModelo() + ", " + Carro.this.getCor() + ", " + Carro.this.getAno();
        }
    }
    
    
    public static void main(String args[]) {
      DadosCarro carro1 = new Carro("Fiat","Punto","branco",2012).new DadosCarro();
      DadosCarro carro2 = new Carro("Honda","Fit","cinza",2013).new DadosCarro();
      DadosCarro carro3 = new Carro("Chevrolet","Monza","vinho",1994).new DadosCarro();
      DadosCarro carro4 = new Carro("Mitsubishi","Lancer","prata",2020).new DadosCarro();
      DadosCarro carro5 = new Carro("Ferrari","F355","vermelho",1999).new DadosCarro();
      
      System.out.println(carro1.getDados());
      System.out.println(carro2.getDados());
      System.out.println(carro3.getDados());
      System.out.println(carro4.getDados());
      System.out.println(carro5.getDados());
    }
}