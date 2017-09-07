/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegraDeNegocios;

import Classes.FuncoesSalvarAbrir;
import Views.Editor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emerson
 */
public class clBotoesEditor implements ActionListener{

    private Editor editor;
    private FuncoesSalvarAbrir funcoes = new FuncoesSalvarAbrir();

    public clBotoesEditor(Editor editor) {
        this.editor = editor;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("novo".equals(e.getActionCommand()))
        {
            funcoes = editor.Novo();
        }
        
        if("abrir".equals(e.getActionCommand()))
        {
            funcoes = editor.abrir(funcoes);
        }
        
        
        if("salvar".equals(e.getActionCommand()))
        {
            funcoes = editor.salvar(funcoes);
        }
        
        if("sair".equals(e.getActionCommand()))
        {
            editor.Sair();
        }
        
        if("sobre".equals(e.getActionCommand()))
        {
            editor.sobre();
        }
        
        if("analise_lexica".equals(e.getActionCommand()))
        {
            
        }
        
    }
    
}
