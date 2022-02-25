package mercado.atividadefretes;

public class FretePadrao extends frete implements Fretavel {
    private double nivelDeUrgencia;

    public FretePadrao(double nivelDeUrgencia, String nome, double distancia, double valorPorKM) {
        super(nome, distancia, valorPorKM);
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public double getNivelDeUrgencia() {
        return nivelDeUrgencia;
    }

    public void setNivelDeUrgencia(double nivelDeUrgencia) {
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    
    
    public double calcularFrete(){
         double nivel = getDistancia()*getValorPorKM(); 
          return nivel;
    }

    @Override
    public String toString() {
        return "FretePadrao{" + "nivelDeUrgencia=" + nivelDeUrgencia + '}';
    }
    
    
    
}
