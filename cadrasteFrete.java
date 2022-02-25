package mercado.atividadefretes;

import java.util.ArrayList;

public class cadrasteFrete {
    ArrayList<frete> fretes = new ArrayList<>(10);

    public void adicionarFrete(frete c){
        fretes.add(c);
    }

    public void calcularTotal(){
        double u = 0;
        for (int i = 0; i < fretes.size(); i++) {
     
                u += fretes.get(i).calcularFrete();
        }
         System.out.println("O valor total de todos os fretes cadastrados é de:" + u + " reais.");
    }
}

