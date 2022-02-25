package mercado.atividadefretes;

public class FreteExpresso extends FretePadrao{

    public FreteExpresso(double nivelDeUrgencia, String nome, double distancia, double valorPorKM) {
        super(nivelDeUrgencia, nome, distancia, valorPorKM);
    }

    

    
    public double calcularFrete(){
         double nivel = (getDistancia()*getValorPorKM()) + (getNivelDeUrgencia() * 100); 
         return nivel;
    }
    
    
    
      
}
