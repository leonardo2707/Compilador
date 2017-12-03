/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

public class AcoesSemantica {
    
    ArrayList<TabelaSimbolosSemantico> lista = new ArrayList<>();
    ArrayList<Token> listaComparacao = new ArrayList<>();
    
    public void AcoesSemantica(Token tokenAtual, int regraSemantica) throws ExceptionsCompilador
    {
        switch (regraSemantica) {
            case 100:
                regraSemantica100(tokenAtual);
                break;
            case 101:
                regraSemantica101(tokenAtual);
                break;
            case 102:
                regraSemantica102(tokenAtual);
                break;
            case 103:
                regraSemantica103();
                break;
            case 104:
                regraSemantica104(tokenAtual);
                break;
            default:
                throw new ExceptionsCompilador("[Erro Semantico] Foi buscado uma regra Semantica que não existe");
        }
    }
    
    private void regraSemantica100(Token token) throws ExceptionsCompilador
    {
        TabelaSimbolosSemantico simboloTabela = new TabelaSimbolosSemantico();
        
        if(lista.isEmpty())
        {
            
            simboloTabela.setTokenVariavel(token);
            
            lista.add(simboloTabela);
        }else
        {
            if(pesquisaNomeToken(token))
            {
                throw new ExceptionsCompilador("[Erro Semantico] variavel Ambigua: " + token.getNome());
            }else
            {
                simboloTabela.setTokenVariavel(token);
                lista.add(simboloTabela);
            }
        }
    }
    
    private void regraSemantica101(Token token) throws ExceptionsCompilador
    {
        /*nesse caso o token vai ser um tipo ( integer, float, char, String)
        que é declarado depois de colocar todas as variaveis, então eirei fazer com que todas as 
        variaveis que ainda nao tiverem tipo recebam este tipo.*/
        colocarTipoTodasVariaveisSemTipo(token);
        
        
    }
    
    private void regraSemantica102(Token token) throws ExceptionsCompilador
    {
        this.listaComparacao.add(token);
    }
    
    private void regraSemantica103() throws ExceptionsCompilador
    {
        /*Agora, esse aqui vai ser lokona de fazer, pq temos uma lista de tokens para serem verificados os tipos, 
        temos uma matriz de todas as variaveis declaras e seus tipos, então precisamos pegar todos os itens da lista
        pegar o tipo na matriz de variaveis, e armazenar o tipo, então deve ver se todo o resto que esta na lista
        é igual ao tipos pegos na tabela*/
        verificaTipoListaComparacao();
    }
    private void regraSemantica104(Token token) throws ExceptionsCompilador
    {
        for(int i = 0; i < lista.size(); i ++)
        {
            if(lista.get(i).getTokenVariavel().getNome().equals(token.getNome()))
            {
                return;
            }
        }
        
        throw new ExceptionsCompilador("[Erro Semantico] variavel nao declarada: " + token.getNome());
    }
    
    
    //se ja existir um token na lista com mesmo nome retornar true
    private Boolean pesquisaNomeToken(Token token)
    {
        for(int i = 0; i < lista.size(); i ++)
        {
            if(lista.get(i).getTokenVariavel().getNome().equals(token.getNome()))
            {
                return true;
            }
        }
        return false;
    }
    
    private void colocarTipoTodasVariaveisSemTipo(Token token)
    {
        for(int i = 0; i < lista.size(); i ++)
        {
            if(lista.get(i).getTokenTipoVariavel() == null)
            {
                lista.get(i).setTokenTipoVariavel(token);
            }
        }
    }
    
    private void verificaTipoListaComparacao() throws ExceptionsCompilador
    {
        String tipo = "";
        
        for(int i = 0; i < listaComparacao.size(); i ++)
        {
            //pega o tipo de uma das variaveis
            if(buscaTipoToken(listaComparacao.get(i)) != null && tipo.equals(""))
            {
                //coloca o tipo na variavel
                tipo = buscaTipoToken(listaComparacao.get(i)).getToken();
            }else if(buscaTipoToken(listaComparacao.get(i)) != null)
            {
                //se ele buscar um tipo e não vier o mesmo da uma excetion
                if(!buscaTipoToken(listaComparacao.get(i)).getToken().equals(tipo))
                {
                    
                     throw new ExceptionsCompilador("[Erro Semantico] feito uma opração com tipos de variaveis diferente");
                }
            }else
            {
                 throw new ExceptionsCompilador("[Erro Semantico] busca pelo tipo da variavel retornou nulo");
            }
        }
        
        //limpa a lista
        listaComparacao.clear();
    }
    
    
    private Token buscaTipoToken(Token token)
    {
        for(int i = 0; i < lista.size(); i ++)
        {
            if(lista.get(i).getTokenVariavel().getNome().equals(token.getNome()))
            {
                return lista.get(i).getTokenTipoVariavel();
            }
        }
        
        return null;
    }
}
