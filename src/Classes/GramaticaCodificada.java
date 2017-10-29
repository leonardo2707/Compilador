/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class GramaticaCodificada {
    
    ArrayList<Regra> regras = new ArrayList<Regra>();
    
    ArrayList<Token> regra1 = new ArrayList<Token>();
    ArrayList<Token> regra2 = new ArrayList<Token>();
    ArrayList<Token> regra3 = new ArrayList<Token>();
    ArrayList<Token> regra4 = new ArrayList<Token>();
    ArrayList<Token> regra5 = new ArrayList<Token>();
    ArrayList<Token> regra6 = new ArrayList<Token>();
    ArrayList<Token> regra7 = new ArrayList<Token>();
    ArrayList<Token> regra8 = new ArrayList<Token>();
    ArrayList<Token> regra9 = new ArrayList<Token>();
    ArrayList<Token> regra10 = new ArrayList<Token>();
    ArrayList<Token> regra11= new ArrayList<Token>();
    ArrayList<Token> regra12 = new ArrayList<Token>();
    ArrayList<Token> regra13 = new ArrayList<Token>();
    ArrayList<Token> regra14 = new ArrayList<Token>();
    ArrayList<Token> regra15 = new ArrayList<Token>();
    ArrayList<Token> regra16 = new ArrayList<Token>();
    ArrayList<Token> regra17 = new ArrayList<Token>();
    ArrayList<Token> regra18 = new ArrayList<Token>();
    ArrayList<Token> regra19 = new ArrayList<Token>();
    ArrayList<Token> regra20 = new ArrayList<Token>();
    ArrayList<Token> regra21 = new ArrayList<Token>();
    ArrayList<Token> regra22 = new ArrayList<Token>();
    ArrayList<Token> regra23 = new ArrayList<Token>();
    ArrayList<Token> regra24 = new ArrayList<Token>();
    ArrayList<Token> regra25 = new ArrayList<Token>();
    ArrayList<Token> regra26 = new ArrayList<Token>();
    ArrayList<Token> regra27 = new ArrayList<Token>();
    ArrayList<Token> regra28 = new ArrayList<Token>();
    ArrayList<Token> regra29 = new ArrayList<Token>();
    ArrayList<Token> regra30 = new ArrayList<Token>();
    ArrayList<Token> regra31 = new ArrayList<Token>();
    ArrayList<Token> regra32 = new ArrayList<Token>();
    ArrayList<Token> regra33 = new ArrayList<Token>();
    ArrayList<Token> regra34 = new ArrayList<Token>();
    ArrayList<Token> regra35 = new ArrayList<Token>();
    ArrayList<Token> regra36 = new ArrayList<Token>();
    ArrayList<Token> regra37 = new ArrayList<Token>();
    ArrayList<Token> regra38 = new ArrayList<Token>();
    ArrayList<Token> regra39 = new ArrayList<Token>();
    ArrayList<Token> regra40 = new ArrayList<Token>();
    ArrayList<Token> regra41 = new ArrayList<Token>();
    ArrayList<Token> regra42 = new ArrayList<Token>();
    ArrayList<Token> regra43 = new ArrayList<Token>();
    ArrayList<Token> regra44 = new ArrayList<Token>();
    ArrayList<Token> regra45 = new ArrayList<Token>();
    ArrayList<Token> regra46 = new ArrayList<Token>();
    ArrayList<Token> regra47 = new ArrayList<Token>();
    ArrayList<Token> regra48 = new ArrayList<Token>();
    ArrayList<Token> regra49 = new ArrayList<Token>();
    ArrayList<Token> regra50 = new ArrayList<Token>();
    ArrayList<Token> regra51 = new ArrayList<Token>();
    ArrayList<Token> regra52 = new ArrayList<Token>();
    ArrayList<Token> regra53 = new ArrayList<Token>();
    ArrayList<Token> regra54 = new ArrayList<Token>();
    ArrayList<Token> regra55 = new ArrayList<Token>();
    ArrayList<Token> regra56 = new ArrayList<Token>();
    ArrayList<Token> regra57 = new ArrayList<Token>();
    ArrayList<Token> regra58 = new ArrayList<Token>();
    ArrayList<Token> regra59 = new ArrayList<Token>();
    ArrayList<Token> regra60 = new ArrayList<Token>();
    ArrayList<Token> regra61 = new ArrayList<Token>();
    ArrayList<Token> regra62 = new ArrayList<Token>();
    ArrayList<Token> regra63 = new ArrayList<Token>();
    ArrayList<Token> regra64 = new ArrayList<Token>();
    ArrayList<Token> regra65 = new ArrayList<Token>();
    ArrayList<Token> regra66 = new ArrayList<Token>();
    ArrayList<Token> regra67 = new ArrayList<Token>();
    ArrayList<Token> regra68 = new ArrayList<Token>();
    ArrayList<Token> regra69 = new ArrayList<Token>();
    ArrayList<Token> regra70 = new ArrayList<Token>();
    ArrayList<Token> regra71 = new ArrayList<Token>();
    ArrayList<Token> regra72 = new ArrayList<Token>();
    ArrayList<Token> regra73 = new ArrayList<Token>();
    ArrayList<Token> regra74 = new ArrayList<Token>();
    ArrayList<Token> regra75 = new ArrayList<Token>();
    ArrayList<Token> regra76 = new ArrayList<Token>();
    ArrayList<Token> regra77 = new ArrayList<Token>();
    ArrayList<Token> regra78 = new ArrayList<Token>();
    ArrayList<Token> regra79 = new ArrayList<Token>();
    ArrayList<Token> regra80 = new ArrayList<Token>();
    
    Dicionario dicionario = new Dicionario();
    
    
    public GramaticaCodificada(){
        
        
        regras.add(1, new Regra(dicionario.retornaTokenDicionarioCodigo(35), dicionario.retornaTokenDicionarioCodigo(51), dicionario.retornaTokenDicionarioCodigo(50), dicionario.retornaTokenDicionarioCodigo(49),
        dicionario.retornaTokenDicionarioCodigo(36), dicionario.retornaTokenDicionarioCodigo(10), dicionario.retornaTokenDicionarioCodigo(2)));
        
        regras.add(2, new Regra(dicionario.retornaTokenDicionarioCodigo(54), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(53),
        dicionario.retornaTokenDicionarioCodigo(38), dicionario.retornaTokenDicionarioCodigo(52), dicionario.retornaTokenDicionarioCodigo(7)));
        /*regra2.add(dicionario.retornaTokenDicionarioCodigo(54));
        regra2.add(dicionario.retornaTokenDicionarioCodigo(37));
        regra2.add(dicionario.retornaTokenDicionarioCodigo(53));
        regra2.add(dicionario.retornaTokenDicionarioCodigo(38));
        regra2.add(dicionario.retornaTokenDicionarioCodigo(52));
        regra2.add(dicionario.retornaTokenDicionarioCodigo(7));*/
        
        regras.add(3, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra3.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(4, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra4.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        
        regras.add(5, new Regra(dicionario.retornaTokenDicionarioCodigo(52), dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(40)));
        /*regra5.add(dicionario.retornaTokenDicionarioCodigo(52));
        regra5.add(dicionario.retornaTokenDicionarioCodigo(7));
        regra5.add(dicionario.retornaTokenDicionarioCodigo(40));*/
        
        regras.add(6, new Regra(dicionario.retornaTokenDicionarioCodigo(12)));
        //regra6.add(dicionario.retornaTokenDicionarioCodigo(12));
        
        regras.add(7, new Regra(dicionario.retornaTokenDicionarioCodigo(17)));
        //regra7.add(dicionario.retornaTokenDicionarioCodigo(17));
        
        regras.add(8, new Regra(dicionario.retornaTokenDicionarioCodigo(3)));
        //regra8.add(dicionario.retornaTokenDicionarioCodigo(3));
        
        regras.add(9, new Regra(dicionario.retornaTokenDicionarioCodigo(23)));
        //regra9.add(dicionario.retornaTokenDicionarioCodigo(23));
        
        regras.add(10, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra10.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(11, new Regra(dicionario.retornaTokenDicionarioCodigo(54), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(53),
        dicionario.retornaTokenDicionarioCodigo(38), dicionario.retornaTokenDicionarioCodigo(55)));
        /*regra11.add(dicionario.retornaTokenDicionarioCodigo(54));
        regra11.add(dicionario.retornaTokenDicionarioCodigo(37));
        regra11.add(dicionario.retornaTokenDicionarioCodigo(53));
        regra11.add(dicionario.retornaTokenDicionarioCodigo(38));
        regra11.add(dicionario.retornaTokenDicionarioCodigo(55));*/
        
        regras.add(12, new Regra(dicionario.retornaTokenDicionarioCodigo(52), dicionario.retornaTokenDicionarioCodigo(7)));
        /*regra12.add(dicionario.retornaTokenDicionarioCodigo(52));
        regra12.add(dicionario.retornaTokenDicionarioCodigo(7));*/
        
        regras.add(13, new Regra(dicionario.retornaTokenDicionarioCodigo(50), dicionario.retornaTokenDicionarioCodigo(35), dicionario.retornaTokenDicionarioCodigo(42),
        dicionario.retornaTokenDicionarioCodigo(58), dicionario.retornaTokenDicionarioCodigo(43), dicionario.retornaTokenDicionarioCodigo(4), 
        dicionario.retornaTokenDicionarioCodigo(51), dicionario.retornaTokenDicionarioCodigo(50), dicionario.retornaTokenDicionarioCodigo(49),
        dicionario.retornaTokenDicionarioCodigo(36), dicionario.retornaTokenDicionarioCodigo(57), dicionario.retornaTokenDicionarioCodigo(7),
        dicionario.retornaTokenDicionarioCodigo(56)));
        
        /*regra13.add(dicionario.retornaTokenDicionarioCodigo(50));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(35));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(42));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(58));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(43));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(4));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(51));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(50));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(49));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(36));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(57));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(7));
        regra13.add(dicionario.retornaTokenDicionarioCodigo(56));*/
        
        regras.add(14, new Regra(dicionario.retornaTokenDicionarioCodigo(12)));
        //regra14.add(dicionario.retornaTokenDicionarioCodigo(12));
        
        regras.add(15, new Regra(dicionario.retornaTokenDicionarioCodigo(2)));
        //regra15.add(dicionario.retornaTokenDicionarioCodigo(2));
        
        regras.add(16, new Regra(dicionario.retornaTokenDicionarioCodigo(23)));
        //regra16.add(dicionario.retornaTokenDicionarioCodigo(23));
        
        regras.add(17, new Regra(dicionario.retornaTokenDicionarioCodigo(17)));
        //regra17.add(dicionario.retornaTokenDicionarioCodigo(17));
        
        regras.add(18, new Regra(dicionario.retornaTokenDicionarioCodigo(3)));
        //regra18.add(dicionario.retornaTokenDicionarioCodigo(3));
        
        regras.add(19, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra19.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(20, new Regra(dicionario.retornaTokenDicionarioCodigo(5)));
        //regra20.add(dicionario.retornaTokenDicionarioCodigo(5));
        
        regras.add(21, new Regra(dicionario.retornaTokenDicionarioCodigo(6)));
        //regra21.add(dicionario.retornaTokenDicionarioCodigo(6));
        
        regras.add(22, new Regra(dicionario.retornaTokenDicionarioCodigo(7)));
        //regra22.add(dicionario.retornaTokenDicionarioCodigo(7));
        
        regras.add(23, new Regra(dicionario.retornaTokenDicionarioCodigo(8)));
        //regra23.add(dicionario.retornaTokenDicionarioCodigo(8));
        
        regras.add(24, new Regra(dicionario.retornaTokenDicionarioCodigo(9)));
        //regra24.add(dicionario.retornaTokenDicionarioCodigo(9));
        
        regras.add(25, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra25.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(26, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra26.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(27, new Regra(dicionario.retornaTokenDicionarioCodigo(42), dicionario.retornaTokenDicionarioCodigo(59), dicionario.retornaTokenDicionarioCodigo(43)));
     /*   regra27.add(dicionario.retornaTokenDicionarioCodigo(42));
        regra27.add(dicionario.retornaTokenDicionarioCodigo(59));
        regra27.add(dicionario.retornaTokenDicionarioCodigo(43));*/
        
        
        regras.add(28, new Regra(dicionario.retornaTokenDicionarioCodigo(60), dicionario.retornaTokenDicionarioCodigo(53)));
        /*regra28.add(dicionario.retornaTokenDicionarioCodigo(60));
        regra28.add(dicionario.retornaTokenDicionarioCodigo(53));*/
        
        regras.add(29, new Regra(dicionario.retornaTokenDicionarioCodigo(60), dicionario.retornaTokenDicionarioCodigo(53), dicionario.retornaTokenDicionarioCodigo(37)));
        /*regra29.add(dicionario.retornaTokenDicionarioCodigo(60));
        regra29.add(dicionario.retornaTokenDicionarioCodigo(53));
        regra29.add(dicionario.retornaTokenDicionarioCodigo(37));*/
        
        regras.add(30, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra30.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(31, new Regra(dicionario.retornaTokenDicionarioCodigo(18), dicionario.retornaTokenDicionarioCodigo(62), 
        dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(13)));
        /*regra31.add(dicionario.retornaTokenDicionarioCodigo(18));
        regra31.add(dicionario.retornaTokenDicionarioCodigo(62));
        regra31.add(dicionario.retornaTokenDicionarioCodigo(37));
        regra31.add(dicionario.retornaTokenDicionarioCodigo(61));
        regra31.add(dicionario.retornaTokenDicionarioCodigo(13));*/
        
        regras.add(32, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra32.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(33, new Regra(dicionario.retornaTokenDicionarioCodigo(62), dicionario.retornaTokenDicionarioCodigo(37), 
        dicionario.retornaTokenDicionarioCodigo(61)));
        /*regra33.add(dicionario.retornaTokenDicionarioCodigo(62));
        regra33.add(dicionario.retornaTokenDicionarioCodigo(37));
        regra33.add(dicionario.retornaTokenDicionarioCodigo(61));*/
        
        regras.add(34, new Regra(dicionario.retornaTokenDicionarioCodigo(63), dicionario.retornaTokenDicionarioCodigo(29), dicionario.retornaTokenDicionarioCodigo(7)));
        /*regra34.add(dicionario.retornaTokenDicionarioCodigo(63));
        regra34.add(dicionario.retornaTokenDicionarioCodigo(29));
        regra34.add(dicionario.retornaTokenDicionarioCodigo(7));*/
        
        regras.add(35, new Regra(dicionario.retornaTokenDicionarioCodigo(63), dicionario.retornaTokenDicionarioCodigo(29), dicionario.retornaTokenDicionarioCodigo(9)));
        /*regra35.add(dicionario.retornaTokenDicionarioCodigo(63));
        regra35.add(dicionario.retornaTokenDicionarioCodigo(29));
        regra35.add(dicionario.retornaTokenDicionarioCodigo(9));*/
        
        regras.add(36, new Regra(dicionario.retornaTokenDicionarioCodigo(63), dicionario.retornaTokenDicionarioCodigo(29), 
        dicionario.retornaTokenDicionarioCodigo(8)));
        /*regra36.add(dicionario.retornaTokenDicionarioCodigo(63));
        regra36.add(dicionario.retornaTokenDicionarioCodigo(29));
        regra36.add(dicionario.retornaTokenDicionarioCodigo(8));*/
        
        regras.add(37, new Regra(dicionario.retornaTokenDicionarioCodigo(63), dicionario.retornaTokenDicionarioCodigo(29),
        dicionario.retornaTokenDicionarioCodigo(63)));
        /*regra37.add(dicionario.retornaTokenDicionarioCodigo(63));
        regra37.add(dicionario.retornaTokenDicionarioCodigo(29));
        regra37.add(dicionario.retornaTokenDicionarioCodigo(63));*/
        
        regras.add(38, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra38.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regra39.add(dicionario.retornaTokenDicionarioCodigo(64));
        regra39.add(dicionario.retornaTokenDicionarioCodigo(7));
        regra39.add(dicionario.retornaTokenDicionarioCodigo(24));
        
        regra40.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        // Continuar do 41 até o 80...
    }
    
    
}
