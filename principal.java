package mercado.atividadefretes;

public class principal {
    public static void main(String[]args){
        cadrasteFrete cadastro = new cadrasteFrete();

        FretePadrao Frete1 = new FretePadrao(150 , "vitor", 45, 125);
        FretePadrao Frete2 = new FretePadrao(150 , "julião", 50, 135);
        
        FreteExpresso FreteExpresso1 = new FreteExpresso(2, "Adam", 50.6, 54);
        FreteExpresso FreteExpresso2 = new FreteExpresso(2, "maria", 100, 108);
        FreteSuperExpresso FreteSuperExpresso1 = new FreteSuperExpresso(12, 3, "joana", 150 , 21);

        cadastro.adicionarFrete(Frete1);
        cadastro.adicionarFrete(Frete2);
        cadastro.adicionarFrete( FreteExpresso1);
        cadastro.adicionarFrete( FreteExpresso2);
        cadastro.adicionarFrete(FreteSuperExpresso1 );

        cadastro.calcularTotal();
        //mercado.imprimirCliente();


    }
}


