/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.FuncoesSalvarAbrir;
import Classes.Token;
import RegraDeNegocios.Automato;
import RegraDeNegocios.clBotoesEditor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emerson
 */
public class Editor extends javax.swing.JFrame {

    clBotoesEditor botoes = new clBotoesEditor(this);
    ArrayList<Token> lista;
    
    public void setLista(ArrayList<Token> lista){
        this.lista = lista;
    }
    

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();

        jmNovo.addActionListener(botoes);
        jmAbrir.addActionListener(botoes);
        jmSalvar.addActionListener(botoes);
        jmSair.addActionListener(botoes);
        jmSobre.addActionListener(botoes);
        jmAnalise.addActionListener(botoes);
        
    }

    public FuncoesSalvarAbrir Novo() {
        FuncoesSalvarAbrir funcoes = new FuncoesSalvarAbrir();
        jeditArea.setText("");

        return funcoes;
    }

    public FuncoesSalvarAbrir abrir(FuncoesSalvarAbrir funcoes) {
        pegarCaminhoArquivo(funcoes);

        return funcoes;
    }

    public FuncoesSalvarAbrir salvar(FuncoesSalvarAbrir funcoes) {

        if (funcoes.getCaminhoDoArquivo().equals("")) {
            PegarCaminhoESalvar(funcoes);
        } else {
            gravarArquivo(funcoes.getCaminhoDoArquivo(), jeditArea.getText());
        }

        return funcoes;
    }
    
    public void Sair()
    {
        this.dispose();
    }
    
    public void sobre()
    {
        String texto = "Um compilador para a aula de compiladores, ele é um editor de texto que deve \nsalvar, recuperar e editar textos. E deve compilar um codigo fonte e mostrar seus \nerros como qualquer ambiente de desenvolvimento. \n\nDesenvolvido por:\n\t\tEmerson Leonardo Zock Alves\n\t\tGabriel Abel Ortolan";
         JOptionPane.showMessageDialog(null, texto, "Sobre Editor de Texto", JOptionPane.INFORMATION_MESSAGE);
    }

    private void PegarCaminhoESalvar(FuncoesSalvarAbrir funcoes) {

        JFileChooser fc = new JFileChooser();
        //Exibe o diálogo. Deve ser passado por parâmetro o JFrame de origem.
        fc.showSaveDialog(this);
        //Captura o objeto File que representa o arquivo selecionado.

        File selFile = fc.getSelectedFile();

        if (selFile != null) {
            funcoes.setCaminhoDoArquivo(selFile.getAbsolutePath());
            gravarArquivo(funcoes.getCaminhoDoArquivo(), jeditArea.getText());

        }

    }

    private void gravarArquivo(String nomeArquivo, String textoArquivo) {
        textoArquivo = textoArquivo.replaceAll("\n", "\r\n");
        
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textoArquivo);
            bufferedWriter.flush();
            //Se chegou ate essa linha, conseguiu salvar o arquivo com sucesso.
            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
        }

    }

    private void pegarCaminhoArquivo(FuncoesSalvarAbrir funcoes) {
        JFileChooser fc = new JFileChooser();
        //Exibe o diálogo. Deve ser passado por parâmetro o JFrame de origem.
        fc.showOpenDialog(this);
        //Captura o objeto File que representa o arquivo selecionado.
        File selFile = fc.getSelectedFile();
        //JOptionPane.showMessageDialog(null, selFile.getAbsolutePath());
        if (selFile != null) {

            if (!funcoes.getCaminhoDoArquivo().equals(selFile.getAbsolutePath())) {
                funcoes.setCaminhoDoArquivo(selFile.getAbsolutePath());
            }

            jeditArea.setText(lerArquivo(selFile.getAbsolutePath()));

        }
    }

    private String lerArquivo(String nomeArquivo) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(nomeArquivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            return sb.toString();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                    + ex.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public String pegarTexto()
    {
        return jeditArea.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jeditArea = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAutomato = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNovo = new javax.swing.JMenuItem();
        jmAbrir = new javax.swing.JMenuItem();
        jmSalvar = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();
        jmenu3 = new javax.swing.JMenu();
        jmAnalise = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador C-Hala");

        jScrollPane1.setViewportView(jeditArea);

        tabelaAutomato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Token", "Linha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaAutomato);
        if (tabelaAutomato.getColumnModel().getColumnCount() > 0) {
            tabelaAutomato.getColumnModel().getColumn(0).setResizable(false);
            tabelaAutomato.getColumnModel().getColumn(1).setResizable(false);
            tabelaAutomato.getColumnModel().getColumn(2).setResizable(false);
        }

        jMenu1.setText("Arquivo");

        jmNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmNovo.setText("Novo");
        jmNovo.setActionCommand("novo");
        jMenu1.add(jmNovo);

        jmAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmAbrir.setText("Abrir");
        jmAbrir.setActionCommand("abrir");
        jMenu1.add(jmAbrir);

        jmSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmSalvar.setText("Salvar");
        jmSalvar.setActionCommand("salvar");
        jMenu1.add(jmSalvar);

        jmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmSair.setText("Sair");
        jmSair.setActionCommand("sair");
        jMenu1.add(jmSair);

        jMenuBar1.add(jMenu1);

        jmenu3.setText("Executar");

        jmAnalise.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmAnalise.setText("Analise Léxica");
        jmAnalise.setActionCommand("analise");
        jmenu3.add(jmAnalise);

        jmenu3.setActionCommand("analise");

        jMenuBar1.add(jmenu3);

        jMenu2.setText("Sobre");

        jmSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmSobre.setText("Sobre o Editor");
        jmSobre.setActionCommand("sobre");
        jMenu2.add(jmSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
    
    public void adicionarLinhas(){
        DefaultTableModel model = (DefaultTableModel) tabelaAutomato.getModel();
        Object rowData[] = new Object[3];
        model.setNumRows(0);
        for(int i = 0 ; i < lista.size() ; i++){
            rowData[0] = lista.get(i).getCodToken();
            rowData[1] = lista.get(i).getToken();
            rowData[2] = lista.get(i).getLinha();
            model.addRow(rowData);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane jeditArea;
    private javax.swing.JMenuItem jmAbrir;
    private javax.swing.JMenuItem jmAnalise;
    private javax.swing.JMenuItem jmNovo;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenuItem jmSalvar;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenu jmenu3;
    private javax.swing.JTable tabelaAutomato;
    // End of variables declaration//GEN-END:variables

}
