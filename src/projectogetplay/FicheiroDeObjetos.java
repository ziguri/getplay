
package projectogetplay;

/**
 *
 */
import java.io.*;
public class FicheiroDeObjetos {
    private ObjectInputStream is;
    private ObjectOutputStream os;
    
    //Metodo para abrir ficheiro de leitura
    public boolean abreLeitura(String nomeDoFicheiro) throws IOException{ 
        try{
            is = new ObjectInputStream(new FileInputStream(nomeDoFicheiro));
            return true;
        }catch(IOException e){
            return false;
        }
        
    }
    
    //Metodo para abrir um ficheiro de Escrita
    //Recebe o nome do ficheiro
    public void abreEscrita(String nomeDoFicheiro) throws IOException{
        os = new ObjectOutputStream(new FileOutputStream(nomeDoFicheiro));
    }
    
    //Metodo para ler um objeto do ficheiro
    //Devolve objeto lido
    public Object leObjeto() throws IOException, ClassNotFoundException{
        return is.readObject();
    }
    
    //Metodo para escrever objeto em Ficheir
    //Recebe Objeto para escrever
    
    public void escreveObjeto(Object o)throws IOException{
        os.writeObject(o);
    }
    
    //Metodo para fechar um ficheito aberto em modo leitura
    public void fechaLeitura() throws IOException{
        is.close();
    }
    
    //Metodo para fechar ficheiro em modo de escrita
    public void fechaEscrita() throws IOException{
        os.close();
    }
    
    
}
