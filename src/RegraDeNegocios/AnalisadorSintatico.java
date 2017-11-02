package RegraDeNegocios;

import Classes.ExceptionsCompilador;
import Classes.GramaticaCodificada;
import Classes.TabelaParsing;
import Classes.Token;
import java.util.ArrayList;
import java.util.Collections;

public class AnalisadorSintatico {
    
    private ArrayList<Token> tokensDaSentenca = new ArrayList<Token>();
    private TabelaParsing tabParsing = new TabelaParsing();
    private GramaticaCodificada gramaticaCodificada = new GramaticaCodificada();
    
    //a = recebe o símbolo da entrada
    //x recebe o topo da pilha
    public ArrayList<Token> analisarTreta(Token x, Token a, ArrayList<Token> pilha) throws ExceptionsCompilador
    {
        do {
            //Se X== vazio então
            if (x.getCodToken() == 15) {
                //remove o topo da lista
                pilha.remove(0);
                //x recebe o topo da pilha
                x = pilha.get(0);
            }
            //Se X == terminal então
            else if (x.getCodToken() <= 47) {
                
                //Se X==a então
                if (x.getCodToken() == a.getCodToken()) {
                    // Retire o elemento do topo da pilha
                    pilha.remove(0);
                    //Volta para o Léxico
                    return pilha;

                } else {
                    throw new ExceptionsCompilador("[Erro Sintatico] Erro na linha: " +  a.getLinha() + "\nCom o texto " + a.getNome() + " um " + a.getToken());
                    //AQUI DA UM ERRO SINTATICO EM ALGUMA LINHA
                }
            }
             //Se M(X,a) <> null então  
            else 
            {
                //Se M(X,a) <> null então 
                if (tabParsing.getRegra(x.getCodToken(), a.getCodToken()) != 0) {
                    int numeroRegra = tabParsing.getRegra(x.getCodToken(), a.getCodToken());
                //Retire o elemento do topo da pilha 
                    pilha.remove(0);
                // Coloque o conteúdo da regra na pilha
                    ArrayList<Token> regra = gramaticaCodificada.getRegras().get(numeroRegra).getRegra(); //pega regra aqui na treta que o gabriel esta fazendo
                    ArrayList<Token> aux = pilha;
                    
                    Collections.reverse(regra);
                    //a regra deve ficar em cima da pinha
                    for (int i = 0; i < aux.size(); i++) {
                        regra.add(aux.get(i));
                    }
                    
                    pilha = regra;
                //aqui ele termina de colocar o conteudo da regra na pilha
                //X recebe o topo da pilha
                x = pilha.get(0);
                } else {
                  throw new ExceptionsCompilador("[Erro Sintatico] Erro na linha: " +  a.getLinha() + "\nCom o texto " + a.getNome() + " um " + a.getToken());
                    //AQUI DA UM ERRO SINTATICO EM ALGUMA LINHA
                }
            }
        } while (x.getCodToken() != 44);
        return pilha;
    }
}


/*
Início
	X recebe o topo da pilha
	a  recebe o símbolo da entrada
Repita
        Se X== vazio então
	Retire o elemento do topo da pilha
	X recebe o topo da pilha
        Senão
	Se X == terminal então
		Se X==a então
		   Retire o elemento do topo da pilha
		   Volta para o Léxico
		Senão
                                      Erro
		                       Encerra o programa 		
          	Senão  
		            Se M(X,a) <> null então  
			     Retire o elemento do topo da pilha 
                                      Coloque o conteúdo da regra na pilha
			     X recebe o topo da pilha
		             Senão
			     Erro
			     Encerra o programa
		              Fim Se
	        Fim Se
          Fim Se
Até X=$ (*pilha vazia, análise concluída*)
Fim
*/