/*
 * Esta é a classe onde os automatos estarão e vão fazer a magia!!
 */
package RegraDeNegocios;

import Classes.Dicionario;
import Classes.Token;
import java.util.ArrayList;

public class Automato {
    
    private char[] sentenca;
    private ArrayList<Token> tokensDaSentenca = new ArrayList<Token>();
    private Dicionario dicionario = new Dicionario();
    
    //esse construtor separa a sentença em um vetor
    public Automato(String sentenca)
    {
        this.sentenca = sentenca.toCharArray();   
    }
    
    
   
    
    
    
    
    
    
}
