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
    Dicionario dicionario = new Dicionario();
    
    
    public GramaticaCodificada(){
        
        regras.add(0,null);
        regras.add(1, new Regra(dicionario.retornaTokenDicionarioCodigo(35), dicionario.retornaTokenDicionarioCodigo(51), dicionario.retornaTokenDicionarioCodigo(50), dicionario.retornaTokenDicionarioCodigo(49), dicionario.retornaTokenDicionarioCodigo(36), dicionario.retornaTokenDicionarioCodigo(10), dicionario.retornaTokenDicionarioCodigo(2)));
        
        regras.add(2, new Regra(dicionario.retornaTokenDicionarioCodigo(54), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(53), dicionario.retornaTokenDicionarioCodigo(38), dicionario.retornaTokenDicionarioCodigo(52), dicionario.retornaTokenDicionarioCodigo(7)));
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
        
        regras.add(39, new Regra(dicionario.retornaTokenDicionarioCodigo(64), dicionario.retornaTokenDicionarioCodigo(7),
        dicionario.retornaTokenDicionarioCodigo(24)));
        /*regra39.add(dicionario.retornaTokenDicionarioCodigo(64));
        regra39.add(dicionario.retornaTokenDicionarioCodigo(7));
        regra39.add(dicionario.retornaTokenDicionarioCodigo(24));*/
        
        regras.add(40, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //regra40.add(dicionario.retornaTokenDicionarioCodigo(15));
        
        regras.add(41, new Regra(dicionario.retornaTokenDicionarioCodigo(43), dicionario.retornaTokenDicionarioCodigo(65),
        dicionario.retornaTokenDicionarioCodigo(66), dicionario.retornaTokenDicionarioCodigo(42)));
        //41 = 43,65,66,42
        
        regras.add(42, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //42 = 15
        regras.add(43, new Regra(dicionario.retornaTokenDicionarioCodigo(40), dicionario.retornaTokenDicionarioCodigo(65),
        dicionario.retornaTokenDicionarioCodigo(66)));
        //43 = 40,65,66
        
        regras.add(44, new Regra(dicionario.retornaTokenDicionarioCodigo(5)));
        //44 = 5
        
        regras.add(45, new Regra(dicionario.retornaTokenDicionarioCodigo(9)));
        //45 = 9
        
        regras.add(46, new Regra(dicionario.retornaTokenDicionarioCodigo(6)));
        //46 = 6
        
        regras.add(47, new Regra(dicionario.retornaTokenDicionarioCodigo(8)));
        //47 = 8
        
        regras.add(48, new Regra(dicionario.retornaTokenDicionarioCodigo(7)));
        //48 = 7
        
        
        regras.add(49, new Regra(dicionario.retornaTokenDicionarioCodigo(14), dicionario.retornaTokenDicionarioCodigo(43),
        dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(67), dicionario.retornaTokenDicionarioCodigo(42), dicionario.retornaTokenDicionarioCodigo(36),
        dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(62),
        dicionario.retornaTokenDicionarioCodigo(35), dicionario.retornaTokenDicionarioCodigo(68)));
        //49 = 14 43 7 67 42 36 61 37 62 35 68
        
        regras.add(50, new Regra(dicionario.retornaTokenDicionarioCodigo(19),dicionario.retornaTokenDicionarioCodigo(36),
        dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(62),
        dicionario.retornaTokenDicionarioCodigo(35)));
        // 50 = 19, 36, 61, 37, 62, 35
        
        
        regras.add(51, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //51 = 15
        
        regras.add(52, new Regra(dicionario.retornaTokenDicionarioCodigo(1),dicionario.retornaTokenDicionarioCodigo(43),
        dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(67), dicionario.retornaTokenDicionarioCodigo(42),
        dicionario.retornaTokenDicionarioCodigo(36),dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(37),
        dicionario.retornaTokenDicionarioCodigo(62), dicionario.retornaTokenDicionarioCodigo(35)));
        //52 = 1,43,7,67,42,36,61,37,62,35
        
        regras.add(53, new Regra(dicionario.retornaTokenDicionarioCodigo(28), dicionario.retornaTokenDicionarioCodigo(69)));
        //53 = 28,69
        
        regras.add(54, new Regra(dicionario.retornaTokenDicionarioCodigo(45), dicionario.retornaTokenDicionarioCodigo(69)));
        //54 = 45,69
        
        regras.add(55, new Regra(dicionario.retornaTokenDicionarioCodigo(27), dicionario.retornaTokenDicionarioCodigo(69)));
         //55 = 27,69
         
        regras.add(56, new Regra(dicionario.retornaTokenDicionarioCodigo(26), dicionario.retornaTokenDicionarioCodigo(69)));
        //56 = 26,69
         
        regras.add(57, new Regra(dicionario.retornaTokenDicionarioCodigo(32), dicionario.retornaTokenDicionarioCodigo(69)));
         //57 = 32,69
         
        regras.add(58, new Regra(dicionario.retornaTokenDicionarioCodigo(30), dicionario.retornaTokenDicionarioCodigo(69)));
        //58 = 30,69
         
        regras.add(59, new Regra(dicionario.retornaTokenDicionarioCodigo(5)));
        // 59 = 5
         
        regras.add(60, new Regra(dicionario.retornaTokenDicionarioCodigo(6)));
        //60 = 6
        
        regras.add(61, new Regra(dicionario.retornaTokenDicionarioCodigo(9)));
        //61 = 9
        
        regras.add(62, new Regra(dicionario.retornaTokenDicionarioCodigo(8)));
        //62 = 8
        
        regras.add(63, new Regra(dicionario.retornaTokenDicionarioCodigo(7)));
        //63 = 7
        
        regras.add(64, new Regra(dicionario.retornaTokenDicionarioCodigo(16), dicionario.retornaTokenDicionarioCodigo(43),
        dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(29), dicionario.retornaTokenDicionarioCodigo(69),
        dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(67),
        dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(70), dicionario.retornaTokenDicionarioCodigo(42),
        dicionario.retornaTokenDicionarioCodigo(36), dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(37),
        dicionario.retornaTokenDicionarioCodigo(62), dicionario.retornaTokenDicionarioCodigo(35)));
        //64 = 16,43,7,29,69,37,7,67,37,70,42,36,61,37,62,35
        
        regras.add(65, new Regra(dicionario.retornaTokenDicionarioCodigo(33), dicionario.retornaTokenDicionarioCodigo(5)));
        //65 = 33,5
         
        regras.add(66, new Regra(dicionario.retornaTokenDicionarioCodigo(46), dicionario.retornaTokenDicionarioCodigo(5)));
        //66 = 46,5
         
        regras.add(67, new Regra(dicionario.retornaTokenDicionarioCodigo(20), dicionario.retornaTokenDicionarioCodigo(36),
        dicionario.retornaTokenDicionarioCodigo(61), dicionario.retornaTokenDicionarioCodigo(37), dicionario.retornaTokenDicionarioCodigo(62),
         dicionario.retornaTokenDicionarioCodigo(35), dicionario.retornaTokenDicionarioCodigo(1), 
        dicionario.retornaTokenDicionarioCodigo(43), dicionario.retornaTokenDicionarioCodigo(7), dicionario.retornaTokenDicionarioCodigo(67),
        dicionario.retornaTokenDicionarioCodigo(42)));
        //67 = 20,36,61,37,62,35,1,43,7,67,42
        
        regras.add(68, new Regra(dicionario.retornaTokenDicionarioCodigo(22), dicionario.retornaTokenDicionarioCodigo(25), 
        dicionario.retornaTokenDicionarioCodigo(7)));
        //68 = 22,25,7
        
        regras.add(69, new Regra(dicionario.retornaTokenDicionarioCodigo(21), dicionario.retornaTokenDicionarioCodigo(31), 
        dicionario.retornaTokenDicionarioCodigo(11), dicionario.retornaTokenDicionarioCodigo(71)));
        //69 = 21,31,11,71
        
        regras.add(70, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //70 = 15
        
        regras.add(71, new Regra(dicionario.retornaTokenDicionarioCodigo(31), dicionario.retornaTokenDicionarioCodigo(7), 
        dicionario.retornaTokenDicionarioCodigo(72), dicionario.retornaTokenDicionarioCodigo(71)));
        //71 = 31,7,72,71
        
        regras.add(72, new Regra(dicionario.retornaTokenDicionarioCodigo(31), dicionario.retornaTokenDicionarioCodigo(11), 
        dicionario.retornaTokenDicionarioCodigo(71)));
        //72 = 31,11,71
        
        regras.add(73, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //73 = 15
        
        regras.add(74, new Regra(dicionario.retornaTokenDicionarioCodigo(40), dicionario.retornaTokenDicionarioCodigo(7), 
        dicionario.retornaTokenDicionarioCodigo(72)));
        //74 = 40,7,72
        
        regras.add(75, new Regra(dicionario.retornaTokenDicionarioCodigo(73), dicionario.retornaTokenDicionarioCodigo(74)));
        //75 = 73,74
        
        regras.add(76, new Regra(dicionario.retornaTokenDicionarioCodigo(24), dicionario.retornaTokenDicionarioCodigo(7),
        dicionario.retornaTokenDicionarioCodigo(64)));
        //76 = 24,7,64
        
        regras.add(77, new Regra(dicionario.retornaTokenDicionarioCodigo(34), dicionario.retornaTokenDicionarioCodigo(73),
        dicionario.retornaTokenDicionarioCodigo(74)));
        //77 = 34, 73, 74
        
         regras.add(78, new Regra(dicionario.retornaTokenDicionarioCodigo(47), dicionario.retornaTokenDicionarioCodigo(73),
        dicionario.retornaTokenDicionarioCodigo(74)));
        //78 = 47,73,74
        
        regras.add(79, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        //79 = 15
        
        regras.add(80, new Regra(dicionario.retornaTokenDicionarioCodigo(75), dicionario.retornaTokenDicionarioCodigo(76)));
        //80 = 75, 76
        
        regras.add(81, new Regra(dicionario.retornaTokenDicionarioCodigo(15)));
        // 81 = 15
        
        regras.add(82, new Regra(dicionario.retornaTokenDicionarioCodigo(41), dicionario.retornaTokenDicionarioCodigo(75), 
                dicionario.retornaTokenDicionarioCodigo(76)));
        //82 = 41,75,76
        
        regras.add(83, new Regra(dicionario.retornaTokenDicionarioCodigo(39), dicionario.retornaTokenDicionarioCodigo(75), 
                dicionario.retornaTokenDicionarioCodigo(76)));
        //83 = 39,75,76
        
        regras.add(84, new Regra(dicionario.retornaTokenDicionarioCodigo(5)));
        //84 = 5
        
        regras.add(85, new Regra(dicionario.retornaTokenDicionarioCodigo(6)));
        //85 = 6
        
        regras.add(86, new Regra(dicionario.retornaTokenDicionarioCodigo(7)));
        //86 = 7
        
        regras.add(87, new Regra(dicionario.retornaTokenDicionarioCodigo(9)));
        //87 = 9
        
        regras.add(88, new Regra(dicionario.retornaTokenDicionarioCodigo(8)));
        //88 = 8
        
        regras.add(89, new Regra(dicionario.retornaTokenDicionarioCodigo(43), dicionario.retornaTokenDicionarioCodigo(63),
        dicionario.retornaTokenDicionarioCodigo(42)));
        //89 =  43,63,42
        
    }

    public ArrayList<Regra> getRegras() {
        return regras;
    }
    
    
    
    
}
