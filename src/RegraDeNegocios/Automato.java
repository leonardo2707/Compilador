/*
 * Esta é a classe onde os automatos vão fazer a magia!!
 * pensei em implementar todos os automatos primeiro, dai eles vão verificando a sentença
 * se algun deles der erro retorna um erro e para, se não der erro eles retornam o index 
 * de onde pararam na sentença para começar a verificar por todos os automatos de novo
 * se entrar em um automato e der erro por ele retorna valor tipo -1 que define que deu erro
 * jundo desse menos 1 deve ser salvo o index de onde deu erro para avisar depois :D


uma função de exception que se der algum erro ele retornar o erro, mas se não encontrar nada ele vai para a proxima função 
enviando o index que enviou para outra função, para saber onde começou, e se der erro deve ser enviado ao exeption uma
mensagem de erro falando em que linha parou
 */
package RegraDeNegocios;

import Classes.Dicionario;
import Classes.Token;
import Classes.ExceptionsCompilador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Automato {
    
    private char[] sentenca;
    private ArrayList<Token> tokensDaSentenca = new ArrayList<Token>();
    private Dicionario dicionario = new Dicionario();
    
    //esse construtor separa a sentença em um vetor
    public Automato(String sentenca)
    {
        //se o arquivo foi aberto de algum computador baseado no msdos, ele transformar a quebra de linha em apenas /n
        sentenca = sentenca.replaceAll("\r\n", "\n");
        this.sentenca = sentenca.toCharArray();   
    }
    
    public void verificaSentenca()
    {
        boolean verificaErro = false;
        int index = 0;
        int indexAnterior;
        
        //A ultima posição é o simbolo do fim, então o index tem que ser menor que o fim
        while(this.sentenca.length > index)
        {
            indexAnterior = index;
            try
            {
                //se tiver algum espaço em branco ou quebra de linha ele ignora
                if (this.sentenca[index] == ' ' || this.sentenca[index] == '\n') {
                    index++;
                } else {

                    index = automatoVariavel(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }

                    
                    index = automatoIntegerFloat(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                }
                
                
                
                //Se passou por todos os if e o index não mudou
                if(indexAnterior == index)
                {
                    verificaErro = true;
                    JOptionPane.showMessageDialog(null, "Erro na linha: ", "Compilador C-Hala",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                
                
            }catch(ExceptionsCompilador ex)
            {
                verificaErro = true;
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Compilador C-Hala",JOptionPane.INFORMATION_MESSAGE);
            }
              
        }
        
        if(!verificaErro)
        {
             JOptionPane.showMessageDialog(null, "Analise léxica concluida - Sem erros", "Compilador C-Hala",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    
    private int automatoIntegerFloat(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";
        Boolean possuiVirgula = false;
        
        while(this.sentenca.length >= index)
        {
            if(primeiroIndex == index)
            {
                if(Character.isDigit(this.sentenca[index]))
                {
                     valor += this.sentenca[index];
                    index++;
                }else
                {
                    return index;
                }
            } else {
                /*Este if serve para caso a variavel estiver no final da senteça ele não tentar acessar o proximo index
                * e só finzalizar o nome da variavel
                 */
                if (this.sentenca.length != index) {
                    if (Character.isDigit(this.sentenca[index])) {
                        valor += this.sentenca[index];
                        index++;
                    } else if (sentenca[index] == '.') {
                        if (!possuiVirgula) {
                            possuiVirgula = true;
                            valor += sentenca[index];
                            index++;
                        } else {
                            throw new ExceptionsCompilador("Numero com duas virgulas não é permitido posição" + index);
                        }
                    } else {
                        //se possui virgula é float, senão é int
                        if (possuiVirgula) {
                            if (dicionario.retornaTokenDicionario("numeroFloat") != null) {
                                Token tokenSentenca = dicionario.retornaTokenDicionario("numeroFloat");
                                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                return index;
                            } else {
                                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                            }

                        } else {
                            if (dicionario.retornaTokenDicionario("numeroInteiro") != null) {
                                Token tokenSentenca = dicionario.retornaTokenDicionario("numeroInteiro");
                                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                return index;
                            } else {
                                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                            }
                        }
                    }
                }else //no caso ele entraria aqui se estivesse no final do arquivo e não tivesse nada depois
                {
                    if (possuiVirgula) {
                            if (dicionario.retornaTokenDicionario("numeroFloat") != null) {
                                Token tokenSentenca = dicionario.retornaTokenDicionario("numeroFloat");
                                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                return index;
                            } else {
                                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                            }

                        } else {
                        
                            if (dicionario.retornaTokenDicionario("numeroInteiro") != null) {
                                Token tokenSentenca = dicionario.retornaTokenDicionario("numeroInteiro");
                                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                return index;
                            } else {
                                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                            }
                        }
                }
            }
        }
        
        throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    //automato para verificar sé uma variavel
    private int automatoVariavel(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";
        
        
        while(this.sentenca.length >= index)
        {
            if(primeiroIndex == index)
            {
                /*Se não começar com o $ significa que não é um nome de variavel*/
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
                /*Este if serve para caso a variavel estiver no final da senteça ele não tentar acessar o proximo index
                * e só finzalizar o nome da variavel
                */
                if (this.sentenca.length != index) {
                    if (Character.isLetter(sentenca[index])) {
                        valor += sentenca[index];
                        index++;

                    } else if (Character.isDigit(sentenca[index])) {
                        valor += sentenca[index];
                        index++;
                    } else {
                        if (dicionario.retornaTokenDicionario("nomeVariavel") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("nomeVariavel");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    }
                }else
                {
                    if (dicionario.retornaTokenDicionario("nomeVariavel") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("nomeVariavel");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                     } else {
                       throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                     }
                }
            }
        }
        
        throw new ExceptionsCompilador("Fim da Sentença");
    }

    public ArrayList<Token> getTokensDaSentenca() {
        return tokensDaSentenca;
    }
    
    
}
