package mercado.atividadefretes;

public class FreteSuperExpresso extends FretePadrao {
    private int valorDoSeguro;

    public FreteSuperExpresso(int valorDoSeguro, double nivelDeUrgencia, String nome, double distancia, double valorPorKM) {
        super(nivelDeUrgencia, nome, distancia, valorPorKM);
        this.valorDoSeguro = valorDoSeguro;
    }

    public int getValorDoSeguro() {
        return valorDoSeguro;
    }

    public void setValorDoSeguro(int valorDoSeguro) {
        this.valorDoSeguro = valorDoSeguro;
    }
    
    
    
    public double calcularFrete(){
        double nivel = (getDistancia()*getValorPorKM()) + (getNivelDeUrgencia() * 100) + valorDoSeguro; 
         return nivel;
    }

    @Override
    public String toString() {
        return "FreteSuperExpresso{" + "valorDoSeguro=" + valorDoSeguro + '}';
    }
    
}
