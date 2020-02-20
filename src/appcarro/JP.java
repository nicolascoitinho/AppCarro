package appcarro;
import javax.swing.JOptionPane;
public class JP {
    public int lerInteiro(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
    }
    public String lerPalavra(String msg){
        return JOptionPane.showInputDialog(null,msg);
    }
    public double lerReal(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(null, msg));//null
    }
    public void exibir(Object x){
        JOptionPane.showInputDialog(x);
    }
}
