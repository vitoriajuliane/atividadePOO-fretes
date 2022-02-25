package mercado.atividadefretes;

public abstract class frete {
    private String nome;
    private double distancia;
    private double valorPorKM;

    public frete(String nome, double distancia, double valorPorKM) {
        this.nome = nome;
        this.distancia = distancia;
        this.valorPorKM = valorPorKM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorPorKM() {
        return valorPorKM;
    }

    public void setValorPorKM(double valorPorKM) {
        this.valorPorKM = valorPorKM;
    }
    
    public abstract double calcularFrete();

    @Override
    public String toString() {
        return "frete{" + "nome=" + nome + ", distancia=" + distancia + ", valorPorKM=" + valorPorKM + '}';
    }

    
    
    
}
