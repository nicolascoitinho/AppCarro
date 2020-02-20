package appcarro;
import java.util.ArrayList;

public class ArranjoCarro {
    ArrayList<Carro> ar= new ArrayList<Carro>();
    JP jp=new JP();
    public void adicionar(Carro c){
        ar.add(c);        
    }    
    public void limpar(){
        ar.clear();
    }
    public void exibir(JP jp){
        for(int i = 0; i<ar.size();i++){
            jp.exibir(ar.get(i).getModelo());
            jp.exibir(ar.get(i).getAno());
            jp.exibir(ar.get(i).getPreço());
            jp.exibir(ar.get(i).getFabricante());
        }
    }
    public void buscar(JP jp,String busca) {
        for(int i = 0; i<ar.size();i++){
            if(ar.get(i).getModelo().equals(busca)){
            jp.exibir(ar.get(i).getModelo());
            jp.exibir(ar.get(i).getAno());
            jp.exibir(ar.get(i).getPreço());
            jp.exibir(ar.get(i).getFabricante());
        }
    }
    
    }
}