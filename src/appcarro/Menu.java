package appcarro;
public class Menu {
    ArranjoCarro ar=new ArranjoCarro();
    public void menu(JP jp){
        int vc=0;
        while(vc!=6){
            vc=jp.lerInteiro("\n 1) Cadastrar Carros "
                    + "\n 2) Mostrar todos os Carros"
                    + "\n 3) Localizar Carro"
                    + "\n 4) Relatórios"
                    + "\n 5) Apagar todos os Carros"
                    + "\n 6) Sair");
            switch(vc){
                case 1:
                    Carro car= new Carro(jp.lerPalavra("Digite o modelo do carro"),jp.lerInteiro("Digite o ano do carro"),jp.lerReal("Digite o Preço"), jp.lerPalavra("Digite o fabricante"));
                    ar.adicionar(car);
                    break;
                case 2:
                    ar.exibir(jp);
                    break;
                case 3:
                    ar.buscar(jp, jp.lerPalavra("Localiza o Carro:"));
                    ar.exibir(jp);
                    break;
                case 4:
                    ar.exibir(jp);
                    break;
                case 5:
                    ar.limpar();
                    break;
                case 6:
                    jp.exibir("Tchau!");
                    break;
                default:
                    
            }
            
        }
    }
}
