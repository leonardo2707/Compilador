package Classes;

import java.util.ArrayList;


public class Dicionario {
    
    ArrayList<Token> dicionario = new ArrayList<Token>();
    int[] CodigosReservados = new int[11];
    
    
    public ArrayList<Token> getDicionario() {
        return dicionario;
    }
    
    public Dicionario()
    {
        dicionario.add(new Token(1, "while"));
        dicionario.add(new Token(2, "void"));
        dicionario.add(new Token(3, "string"));
        dicionario.add(new Token(4, "return"));
        dicionario.add(new Token(5, "numeroInteiro"));
        dicionario.add(new Token(6, "numeroFloat"));
        dicionario.add(new Token(7, "nomeVariavel"));
        dicionario.add(new Token(8, "nomeDoChar"));
        dicionario.add(new Token(9, "nomeDaString"));
        dicionario.add(new Token(10, "main"));
        dicionario.add(new Token(11, "literal"));
        dicionario.add(new Token(12, "integer"));
        dicionario.add(new Token(13, "inicio"));
        dicionario.add(new Token(14, "if"));
        dicionario.add(new Token(15, "î"));
        dicionario.add(new Token(16, "for"));
        dicionario.add(new Token(17, "float"));
        dicionario.add(new Token(18, "fim"));
        dicionario.add(new Token(19, "else"));
        dicionario.add(new Token(20, "do"));
        dicionario.add(new Token(21, "cout"));
        dicionario.add(new Token(22, "cin"));
        dicionario.add(new Token(23, "char"));
        dicionario.add(new Token(24, "callFuncao"));
        dicionario.add(new Token(25, ">>"));
        dicionario.add(new Token(26, ">="));
        dicionario.add(new Token(27, ">"));
        dicionario.add(new Token(28, "=="));
        dicionario.add(new Token(29, "="));
        dicionario.add(new Token(30, "<="));
        dicionario.add(new Token(31, "<<"));
        dicionario.add(new Token(32, "<"));
        dicionario.add(new Token(33, "++"));
        dicionario.add(new Token(34, "+"));
        dicionario.add(new Token(35, "}"));
        dicionario.add(new Token(36, "{"));
        dicionario.add(new Token(37, ";"));
        dicionario.add(new Token(38, ":"));
        dicionario.add(new Token(39, "/"));
        dicionario.add(new Token(40, ","));
        dicionario.add(new Token(41, "*"));
        dicionario.add(new Token(42, ")"));
        dicionario.add(new Token(43, "("));
        dicionario.add(new Token(44, "$"));
        dicionario.add(new Token(45, "!="));
        dicionario.add(new Token(46, "--"));
        dicionario.add(new Token(47, "-"));
        
        
        //palavras reservadas
        
        CodigosReservados[0] = 1;
        CodigosReservados[1] = 2;
        CodigosReservados[2] = 3;
        CodigosReservados[3] = 4;
        CodigosReservados[4] = 10;
        CodigosReservados[5] = 13;
        CodigosReservados[6] = 14;
        CodigosReservados[7] = 16;
        CodigosReservados[8] = 17;
        CodigosReservados[4] = 18;
        CodigosReservados[5] = 19;
        CodigosReservados[6] = 20;
        CodigosReservados[7] = 21;
        CodigosReservados[8] = 12;
        CodigosReservados[9] = 23;
        CodigosReservados[10] = 10;
    }
    
    
    public Token retornaTokenDicionario(String tipo)
    {
       
        for(int i = 0; i < dicionario.size(); i ++)
        {
            if(dicionario.get(i).getToken().equals(tipo))
            {
                return dicionario.get(i);
            }
        }
        
        return null;
    }
    
    public boolean verificaPalavraReservada(int codToken)
    {
        
        for(int i=0; i <= CodigosReservados.length; i++)
        {
            if(CodigosReservados[i] == codToken)
            {
                return true;
            }
            
        }
        
        return false;
    }
    
}
