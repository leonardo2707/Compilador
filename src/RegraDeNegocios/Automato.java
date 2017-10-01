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
                    
                    index = automatochar(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoString(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoLiteral(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoPalavraReservada(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoSoma(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoSubtracao(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoDivisao(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoMultiplicacao(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoAtribuicaoEComparacao(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoDiferente(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoCaracteresEspeciais(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoMaior(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index = automatoMenor(index);
                    if(this.sentenca.length == index)
                    {
                        break;
                    }
                    
                    index =  automatoComentario(index);
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
                break;
            }
              
        }
        
        if(!verificaErro)
        {
             JOptionPane.showMessageDialog(null, "Analise léxica concluida - Sem erros", "Compilador C-Hala",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    
    /*Daqui para baixo fica os automatos*/
    
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
                    } else if (this.sentenca[index] == '.') {
                        if (!possuiVirgula) {
                            possuiVirgula = true;
                            valor += this.sentenca[index];
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
    
    //automato para identificar um char
    private int automatochar(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";
        
        while(this.sentenca.length >= index)
        {
            if (primeiroIndex == index) {
                if (this.sentenca[index] == '#') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }

            } else {
                
                if (primeiroIndex + 1 == index && index != this.sentenca.length) {
                    valor += sentenca[index];
                    index++;
                }else if(this.sentenca.length == index)
                {
                    throw new ExceptionsCompilador("Fim da Sentença, Um tipo char pode somente ter um Character/Digito/Simbolo Especial e depois deve ser fechado #.\nErro na linha:");
                }

                if (primeiroIndex + 2 == index && index != this.sentenca.length) {
                    if (this.sentenca[index] == '#') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("nomeDoChar") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("nomeDoChar");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }

                    } else {
                        throw new ExceptionsCompilador("Um tipo char pode somente ter um Character/Digito/Simbolo Especial e depois deve ser fechado #\nErro na linha: ");
                    }
                }else
                {
                    throw new ExceptionsCompilador("Fim da Sentença, Um tipo char pode somente ter um Character/Digito/Simbolo Especial e depois deve ser fechado #.\nErro na linha:");
                }
            }
        }
        
        throw new ExceptionsCompilador("Fim da Sentença");
        
    }
    
    //automato para verificar se é uma String
    private int automatoString(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";
        boolean fechamento = false;
        
        while(this.sentenca.length >= index)
        {
            if(primeiroIndex == index)
            {
                if(this.sentenca[index] == '%')
                {
                    valor += this.sentenca[index];
                    index++;
                }else
                {
                    return index;
                }
            }else if(primeiroIndex+1 == index && index != this.sentenca.length)
            {
                if(this.sentenca[index] == '%')
                {
                    valor += this.sentenca[index];
                    index++;
                }else
                {
                    throw new ExceptionsCompilador("Um tipo String precisa ser aberto por %% e fechado por %%.\nErro na linha:");
                }
                
            }else
            {
                if (!fechamento && index != this.sentenca.length) {
                    if (this.sentenca[index] != '%') {
                        valor += this.sentenca[index];
                        index++;
                    }else
                    {
                       valor += this.sentenca[index];
                       index++;
                       fechamento = true;
                    }
                } else {
                    if (this.sentenca.length != index) {
                        if (this.sentenca[index] == '%') {
                            valor += this.sentenca[index];
                            index++;

                            if (dicionario.retornaTokenDicionario("nomeDaString") != null) {
                                Token tokenSentenca = dicionario.retornaTokenDicionario("nomeDaString");
                                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                return index;
                            } else {
                                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                            }

                        } else {
                            throw new ExceptionsCompilador("Um tipo String precisa ser aberto por %% e fechado por %%.\nErro na linha:");
                        }
                    } else {
                        throw new ExceptionsCompilador("Fim da Sentença, um tipo String precisa ser aberto por %% e fechado por %%.\nErro na linha:");
                    }
                }
            }
            
        }
        /*else if(index == this.sentenca.length)
            {
                throw new ExceptionsCompilador("Fim da Sentença, um tipo String precisa ser aberto por %% e fechado por %%.\nErro na linha:");
            }*/
        
        throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    //automato para verificar se é um literal
    private int automatoLiteral(int index) throws ExceptionsCompilador
    {
         int primeiroIndex = index;
         String valor = "";
         
        while(this.sentenca.length >= index)
        {
            if(primeiroIndex == index)
            {
                if(this.sentenca[index] == '"')
                {
                    valor += this.sentenca[index];
                    index++;
                }else
                {
                    return index;
                }
            }else if(this.sentenca.length != index)
            {
                if(this.sentenca[index] != '"')
                {
                    valor += this.sentenca[index];
                    index++;
                }else
                {
                    valor += this.sentenca[index];
                    index++;
                    if (dicionario.retornaTokenDicionario("literal") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("literal");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                }
            }else
            {
                throw new ExceptionsCompilador("Fim da Sentença, Literal não foi fechado com \" ele incia em  " + primeiroIndex);
            }
        
        }
        
        
          throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    //automato para verificar se tem uma palavra reservada
    private int automatoPalavraReservada(int index) throws ExceptionsCompilador
    {
         int primeiroIndex = index;
         String valor = "";
         
         while(this.sentenca.length >= index)
         {
             if(primeiroIndex == index)
            {
                if (Character.isLetter(this.sentenca[index])) {
                        valor += this.sentenca[index];
                        index++;
              }else
                {
                    return index;
                }
                
            }else
             {
                 if (this.sentenca.length != index) {

                     if (Character.isLetter(this.sentenca[index])) {
                         valor += this.sentenca[index];
                         index++;
                     } else {
                         if (dicionario.retornaTokenDicionario(valor) != null) {
                             Token tokenSentenca = dicionario.retornaTokenDicionario(valor);
                             if (dicionario.verificaPalavraReservada(tokenSentenca.getCodToken())) {
                                 
                                 tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                                 return index;
                                 
                             } else {
                                 throw new ExceptionsCompilador("Palavra reservada " + valor + " não se encontrado no dicionario");
                             }
                         } else {
                             throw new ExceptionsCompilador("Palavra reservada " + valor + " não se encontrado no dicionario");
                         }
                     }

                 } else {
                     if (dicionario.retornaTokenDicionario(valor) != null) {
                         Token tokenSentenca = dicionario.retornaTokenDicionario(valor);
                         if (dicionario.verificaPalavraReservada(tokenSentenca.getCodToken())) {
                             tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                             return index;
                         } else {
                             throw new ExceptionsCompilador("Palavra reservada " + valor + " não se encontrado no dicionario");
                         }
                     } else {
                         throw new ExceptionsCompilador("Palavra reservada " + valor + " não se encontrado no dicionario");
                     }
                 }
             }
              
         }
         
         throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    
    //automato para verificar se é uma variavel
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
                    valor += this.sentenca[index];
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
                    if (Character.isLetter(this.sentenca[index])) {
                        valor += this.sentenca[index];
                        index++;

                    } else if (Character.isDigit(this.sentenca[index])) {
                        valor += this.sentenca[index];
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
    
    
    /*Automatos caracteres especiais*/
    
    //automato da soma
    private int automatoSoma(int index) throws ExceptionsCompilador {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                /*Se não começar com o $ significa que não é um nome de variavel*/
                if (this.sentenca[index] == '+') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }
            } else {
                if (this.sentenca.length != index) {
                    if (this.sentenca[index] == '+') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("++") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("++");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else {
                        if (dicionario.retornaTokenDicionario("+") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("+");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    }

                } else {
                    if (dicionario.retornaTokenDicionario("+") != null) {
                        Token tokenSentenca = dicionario.retornaTokenDicionario("+");
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
    
    //automato da subtração
    private int automatoSubtracao(int index) throws ExceptionsCompilador {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                /*Se não começar com o $ significa que não é um nome de variavel*/
                if (this.sentenca[index] == '-') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }
            } else {
                if (this.sentenca.length != index) {
                    if (this.sentenca[index] == '-') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("--") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("--");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else {
                        if (dicionario.retornaTokenDicionario("-") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("-");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    }

                } else {
                    if (dicionario.retornaTokenDicionario("-") != null) {
                        Token tokenSentenca = dicionario.retornaTokenDicionario("-");
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
    
    //automato da divisão
    private int automatoDivisao(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                if (this.sentenca[index] == '/') {
                    valor += this.sentenca[index];
                    index++;
                    
                     if (dicionario.retornaTokenDicionario("/") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("/");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    
                } else {
                    return index;
                }
            }
        }
        
          throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    //automato da Multiplicacao
    private int automatoMultiplicacao(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                if (this.sentenca[index] == '*') {
                    valor += this.sentenca[index];
                    index++;
                    
                     if (dicionario.retornaTokenDicionario("*") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("*");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    
                } else {
                    return index;
                }
            }
        }
        
          throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    
     //automato da Atribuiçao e Comparaçao
    private int automatoAtribuicaoEComparacao(int index) throws ExceptionsCompilador {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                /*Se não começar com o $ significa que não é um nome de variavel*/
                if (this.sentenca[index] == '=') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }
            } else {
                if (this.sentenca.length != index) {
                    if (this.sentenca[index] == '=') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("==") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("==");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else {
                        if (dicionario.retornaTokenDicionario("=") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("=");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");
                        }
                    }

                } else {
                    if (dicionario.retornaTokenDicionario("=") != null) {
                        Token tokenSentenca = dicionario.retornaTokenDicionario("=");
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
    
    private int automatoDiferente(int index) throws ExceptionsCompilador
    {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) 
        {
            if(primeiroIndex == index)
            {
                if(this.sentenca[index] == '!')
                {
                    valor += "!";
                    index++;
                }else
                {
                    return index;
                }
            }else
            {
              if(this.sentenca.length != index)
              {
                  if(this.sentenca[index] == '=')
                  {
                      valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("!=") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("!=");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                  }
              }else
              {
                  throw new ExceptionsCompilador("Fim da Sentença. o operador diferente é escrito assim: !=\nErro na linha: ");
              }
            }
        }
        
        
        throw new ExceptionsCompilador("Fim da Sentença");
    }
    
    private int automatoCaracteresEspeciais(int index) throws ExceptionsCompilador
    {
        if (this.sentenca[index] == '{') {
            
            if (dicionario.retornaTokenDicionario("{") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario("{");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), "{"));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
        if (this.sentenca[index] == '}') {
            
            if (dicionario.retornaTokenDicionario("}") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario("}");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), "}"));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
        if (this.sentenca[index] == '(') {
            
            if (dicionario.retornaTokenDicionario("(") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario("(");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), "("));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
        if (this.sentenca[index] == ')') {
            
            if (dicionario.retornaTokenDicionario(")") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario(")");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), ")"));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
        if (this.sentenca[index] == ';') {
            
            if (dicionario.retornaTokenDicionario(";") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario(";");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), ";"));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
        if (this.sentenca[index] == ':') {
            
            if (dicionario.retornaTokenDicionario(":") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario(":");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), ":"));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        
         if (this.sentenca[index] == ',') {
            
            if (dicionario.retornaTokenDicionario(",") != null) {
                index++;
                Token tokenSentenca = dicionario.retornaTokenDicionario(",");
                tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), ","));
                return index;
            } else {
                throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

            }
        }
        //se não é nenhum caractere especial ele volta de onde parou
        return index;
    }
    
    private int automatoMaior(int index) throws ExceptionsCompilador {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                if (this.sentenca[index] == '>') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }
            } else {
                if (this.sentenca.length != index) {
                    if (this.sentenca[index] == '=') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario(">=") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario(">=");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else if (this.sentenca[index] == '>') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario(">>") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario(">>");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else {

                        if (dicionario.retornaTokenDicionario(">") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario(">");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    }
                } else {

                    if (dicionario.retornaTokenDicionario(">") != null) {
                        Token tokenSentenca = dicionario.retornaTokenDicionario(">");
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
    
    
     private int automatoMenor(int index) throws ExceptionsCompilador {
        int primeiroIndex = index;
        String valor = "";

        while (this.sentenca.length >= index) {
            if (primeiroIndex == index) {
                if (this.sentenca[index] == '<') {
                    valor += this.sentenca[index];
                    index++;
                } else {
                    return index;
                }
            } else {
                if (this.sentenca.length != index) {
                    if (this.sentenca[index] == '=') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("<=") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("<=");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else if (this.sentenca[index] == '<') {
                        valor += this.sentenca[index];
                        index++;

                        if (dicionario.retornaTokenDicionario("<<") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("<<");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    } else {

                        if (dicionario.retornaTokenDicionario("<") != null) {
                            Token tokenSentenca = dicionario.retornaTokenDicionario("<");
                            tokensDaSentenca.add(new Token(tokenSentenca.getCodToken(), tokenSentenca.getToken(), valor));
                            return index;
                        } else {
                            throw new ExceptionsCompilador("Tipo Não encontraro no dicionario");

                        }
                    }
                } else {

                    if (dicionario.retornaTokenDicionario("<") != null) {
                        Token tokenSentenca = dicionario.retornaTokenDicionario("<");
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
    /*fim dos Automatos caracteres especiais*/
     
    /*automatos comentarios*/
    
     private int automatoComentario(int index) throws ExceptionsCompilador
     {
        int primeiroIndex = index;
        boolean comentarioLinha = false;
        boolean fechando = false;

        while (this.sentenca.length >= index) {
            
            if(primeiroIndex == index)
            {
                if(this.sentenca[index] == '@')
                {
                    index++;
                    
                }else
                {
                    return index;
                }
                
                if(this.sentenca.length != index)
                {
                    if(this.sentenca[index] != '@')
                    {
                        comentarioLinha = true;
                    }else
                    {
                        index++;
                    }
                }else
                {
                    comentarioLinha = true;
                }
            }else
            {
                //o automato vai entrar dentro desse if se for um comentario de linha
                if(comentarioLinha)
                {
                      if(this.sentenca.length != index)
                      {
                          if(this.sentenca[index] == '\n')
                          {
                              index++;
                              return index;
                          }else
                          {
                              index++;
                          }
                          
                      }else
                      {
                          return index;
                      }
                    
                }else //o automato vai entrar dentro deste if se for um comentario de bloco
                {
                    //aqui só tem que verficar se ele fecha
                    if(this.sentenca.length != index)
                    {
                        if(!fechando)
                        {
                            if(this.sentenca[index] == '@')
                            {
                                index++;
                                fechando = true;
                            }else
                            {
                                index++;
                            }
                        }else
                        {
                            if(this.sentenca[index] == '@')
                            {
                                index++;
                                return index;
                            }else //com esse if, voce pode colocar @ no comentario, só que se voce botar @@ ele vai ver que finalizou
                            {
                                index++;
                                fechando = false;
                            }
                        }
                    }else
                    {
                         throw new ExceptionsCompilador("Comentario de block não foi fechado corretamente.\nErro na linha:");
                    }
                }
                
            }
         
        } 
         throw new ExceptionsCompilador("Fim da Sentença");
     }
     
     
    /*fim dos automatos de comentarios*/
     
    /*Fim dos automatos*/

    public ArrayList<Token> getTokensDaSentenca() {
        return tokensDaSentenca;
    }
    
    
}
