/*
 * Esta é a classe onde os automatos vão fazer a magia!!
 * pensei em implementar todos os automatos primeiro, dai eles vão verificando a sentença
 * se algun deles der erro retorna um erro e para, se não der erro eles retornam o index 
 * de onde pararam na sentença para começar a verificar por todos os automatos de novo
 * se entrar em um automato e der erro por ele retorna valor tipo -1 que define que deu erro
 * jundo desse menos 1 deve ser salvo o index de onde deu erro para avisar depois :D
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
        //troca o espaço para esse î
        sentenca = sentenca.replace(" ", "î");
        //podemos usar este simbolo como final?
        sentenca += "&";
        this.sentenca = sentenca.toCharArray();   
    }
    
    public void verificaSentenca()
    {
        boolean fica = true;
        int index = 0;
        while(fica)
        {
            index = automatoVariavel(index);
            
            
            
            //se retornar -1 de alguma função significa que algo deu errado;
            if(index == -1)
            {
                fica = false;
            }
        }
        
        
        
        
    }
    
    
    //automato para verificar sé uma variavel
    private int automatoVariavel(int index)
    {
        boolean fica = true;
        boolean primeiroIndex = true;
        String valor = "";
        while(fica)
        {
            if(primeiroIndex)
            {
                if(this.sentenca[index] == '$')
                {
                    valor += sentenca[index];
                    index++;
                }else
                {
                    return index;
                }
            }else
            {
                if(Character.isLetter(sentenca[index]))
                {
                    valor += sentenca[index];
                    index++;
                    
                }else if(Character.isDigit(sentenca[index]))
                {
                    valor += sentenca[index];
                    index++;
                }else
                {
                    if(dicionario.retornaTokenDicionario("nomeVariavel") != null)
                    {
                        Token tokenSentenca = dicionario.retornaTokenDicionario("nomeVariavel");
                        tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                    }else
                    {
                        //seria legal implementar um throws caso ele não encontre algum valor no dicionario
                        fica = false;
                    }
                }
            }
            
            if(sentenca[index] == '&')
            {
                //chegou no final da sentenca
                fica = false;
            }
            
        }
        
        //seria legal implementar um throws caso ele chegue no final e não encontre final da variavel
        return -1;
    }
   
    
    
    
    
    
    
}
