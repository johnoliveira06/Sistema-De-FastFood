/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FastController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente.Cliente;
import model.Produto.Produto;


/**
 *
 * @author multilaser
 */
public class PedidoView extends javax.swing.JFrame {

    static FastController controller;
    boolean possivel;
    List<Cliente> clientes;
    List<Produto> produtos;
    
    public PedidoView() {
        initComponents();
        controller = FastController.getInstance();
        controller.inserirProdutos();
        produtos = controller.getAllProdutos();
        clientes = controller.getAllClientes();
        listaClientes();
        listaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLanche = new javax.swing.JTable();
        jtqnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcMetodo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jttotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtdinheiro = new javax.swing.JTextField();
        jttroco = new javax.swing.JTextField();
        jbadicionarl = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jbConcluir = new javax.swing.JButton();
        jbremoverl = new javax.swing.JButton();
        jbCalcularT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtTempo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbresetarp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Selecione o cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 230, 22);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Bairro", "Rua e N. da casa"
            }
        ));
        jScrollPane1.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 1100, 60);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Pedido final:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 220, 340, 22);

        jTableLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produtos", "Preço"
            }
        ));
        jScrollPane2.setViewportView(jTableLanche);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 150, 1100, 60);

        jtqnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtqntActionPerformed(evt);
            }
        });
        jtqnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtqntKeyTyped(evt);
            }
        });
        getContentPane().add(jtqnt);
        jtqnt.setBounds(370, 100, 50, 40);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Forma de pagamento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 340, 190, 20);

        jcMetodo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jcMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão" }));
        jcMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMetodoActionPerformed(evt);
            }
        });
        getContentPane().add(jcMetodo);
        jcMetodo.setBounds(70, 360, 170, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Tempo Estimado para Entrega");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 400, 290, 20);

        jttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttotalActionPerformed(evt);
            }
        });
        getContentPane().add(jttotal);
        jttotal.setBounds(420, 340, 80, 30);

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Dinheiro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 390, 70, 15);

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Troco");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 430, 60, 15);

        jtdinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(jtdinheiro);
        jtdinheiro.setBounds(420, 380, 80, 30);

        jttroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttrocoActionPerformed(evt);
            }
        });
        getContentPane().add(jttroco);
        jttroco.setBounds(420, 420, 80, 30);

        jbadicionarl.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jbadicionarl.setText("Adicionar Lanche");
        jbadicionarl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbadicionarlActionPerformed(evt);
            }
        });
        getContentPane().add(jbadicionarl);
        jbadicionarl.setBounds(450, 110, 170, 25);

        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Total", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePedido);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 240, 1100, 90);

        jbConcluir.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbConcluir.setForeground(new java.awt.Color(0, 153, 255));
        jbConcluir.setText("Concluir Pedido");
        jbConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbConcluir);
        jbConcluir.setBounds(770, 360, 280, 80);

        jbremoverl.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jbremoverl.setText("Remover Lanche");
        jbremoverl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbremoverlActionPerformed(evt);
            }
        });
        getContentPane().add(jbremoverl);
        jbremoverl.setBounds(650, 110, 170, 25);

        jbCalcularT.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jbCalcularT.setText("Calcular");
        jbCalcularT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularTActionPerformed(evt);
            }
        });
        getContentPane().add(jbCalcularT);
        jbCalcularT.setBounds(540, 410, 150, 50);

        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setText("Ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1030, 0, 90, 30);

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setText("Selecione o lanche e a quantidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 110, 340, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(490, 372, 300, 0);

        jtTempo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jtTempo.setForeground(new java.awt.Color(255, 153, 51));
        jtTempo.setCaretColor(new java.awt.Color(255, 153, 0));
        jtTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTempoActionPerformed(evt);
            }
        });
        getContentPane().add(jtTempo);
        jtTempo.setBounds(40, 420, 220, 40);

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setText("Total");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 350, 80, 15);

        jbresetarp1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jbresetarp1.setText("Resetar");
        jbresetarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbresetarp1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbresetarp1);
        jbresetarp1.setBounds(540, 340, 150, 50);

        setSize(new java.awt.Dimension(1137, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbadicionarlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbadicionarlActionPerformed
       int row = jTableLanche.getSelectedRow();
       int row2 = jTableCliente.getSelectedRow();
       DefaultTableModel table = (DefaultTableModel) jTablePedido.getModel();
       
       //Converter string pra int
       float numeroconvertido = Integer.parseInt(jtqnt.getText());
       numeroconvertido = numeroconvertido * produtos.get(row).getValor();
       
             
       Object[] dados = {produtos.get(row).getNome(), jtqnt.getText(), numeroconvertido, clientes.get(row2).getNome()};   
       table.addRow(dados);
       
       jtqnt.setText("");
       
        //Calcular tempo de entrega
        int row3 = jTableCliente.getSelectedRow();
        
        if ("Floresta".equals(clientes.get(row3).getEndereco())){
            jtTempo.setText("40 minutos.");
        }
        if ("Liberdade".equals(clientes.get(row3).getEndereco())){
            jtTempo.setText("20 minutos.");
        }
        if ("Caranazal".equals(clientes.get(row3).getEndereco())){
            jtTempo.setText("5 minutos.");
        }
        if ("Laguinho".equals(clientes.get(row3).getEndereco())){
            jtTempo.setText("1 hora.");
        }
        
       //Calcular valor total
       float soma = 0;
       for (int i=0; i<jTablePedido.getRowCount(); i++) { 
       float valor = (float) jTablePedido.getValueAt(i, 2);
       soma+=valor;   
       }      
       jttotal.setText(String.valueOf(soma));
       
      
       //jttotal.setText("12");
       
       
       
       
  
       
        
    }//GEN-LAST:event_jbadicionarlActionPerformed

    private void jbConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirActionPerformed
        
        if (possivel == true) {
            jTableCliente.clearSelection();
            jTableLanche.clearSelection();
            jttotal.setText("");
            jtdinheiro.setText("");
            jtTempo.setText("");
            jttroco.setText("");
            DefaultTableModel table = (DefaultTableModel) jTablePedido.getModel();

            while(table.getRowCount()>0){
                table.removeRow(0);
            }

            JOptionPane.showMessageDialog(null, "Pedido concluído e entregue com sucesso!");
      } else {
            JOptionPane.showMessageDialog(null, "Dinheiro insuficiente para o pagamento do pedido.");
        }
    }//GEN-LAST:event_jbConcluirActionPerformed

    private void jtqntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtqntKeyTyped
        char num = evt.getKeyChar();
        if(!(Character.isDigit(num))
        || (num == KeyEvent.VK_BACK_SPACE)
        || (num == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jtqntKeyTyped

    private void jbremoverlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbremoverlActionPerformed
      int row = jTablePedido.getSelectedRow();
      
      DefaultTableModel table = (DefaultTableModel) jTablePedido.getModel();
      table.removeRow(row);
      
      float soma = 0;
       for (int i=0; i<jTablePedido.getRowCount(); i++) { 
       float valor = (float) jTablePedido.getValueAt(i, 2);
       soma+=valor;   
       }      
       jttotal.setText(String.valueOf(soma));
    }//GEN-LAST:event_jbremoverlActionPerformed

    private void jcMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMetodoActionPerformed
    //jcMetodo.getText().getSelectedItem();  
    if (jcMetodo.getSelectedItem() == "Dinheiro") {
        jttroco.setEnabled(true);
        jtdinheiro.setEnabled(true);
    } if (jcMetodo.getSelectedItem() == "Cartão") {
        jttroco.setEnabled(false);
        jtdinheiro.setEnabled(false);
        possivel = true;
    }
    }//GEN-LAST:event_jcMetodoActionPerformed

    private void jttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttotalActionPerformed
        
        
                 
    }//GEN-LAST:event_jttotalActionPerformed

    private void jbCalcularTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularTActionPerformed
        float num1 = Float.parseFloat(jttotal.getText());
        float num2 = Float.parseFloat(jtdinheiro.getText());
        
   
        if (num2 >= num1) {
            possivel = true;
            float troco = num2 - num1;       
            jttroco.setText(Integer.toString((int) troco));
        } else {
            possivel = false;
            float troco = num2 - num1;
            jttroco.setText(Integer.toString((int) troco));
        }
       
    }//GEN-LAST:event_jbCalcularTActionPerformed

    private void jtqntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtqntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtqntActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jtdinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdinheiroActionPerformed
        
    }//GEN-LAST:event_jtdinheiroActionPerformed

    private void jttrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttrocoActionPerformed
        
        
    }//GEN-LAST:event_jttrocoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Para adicionar um pedido faça os seguintes passos:" + "\n" + "---------------------------------------------------------" + "\n" + "1 - Selecione o cliente." + "\n" + "2 - Selecione o lanche e coloque a quantidade." + "\n" + "3 - Clique me Adicionar Lanche. ( Caso queira remover uma das escolhes, selecione a escolha e clique me 'Excluir Lanche'" + "\n" + "4 - Repita os passos 2 e 3 até terminar o pedido." + "\n" + "5 - Conclua o pedido :p." + "\n\n" + "(Para reiniciar o pedido, clique em 'RESETAR')" + "\n" + "OBRIGADO!" + "\n" + "---------------------------------------------------------");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTempoActionPerformed
       
    }//GEN-LAST:event_jtTempoActionPerformed

    private void jbresetarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbresetarp1ActionPerformed
        jTableCliente.clearSelection();
        jTableLanche.clearSelection();
        jttotal.setText("");
        jtdinheiro.setText("");
        jtTempo.setText("");
        jttroco.setText("");
        
        DefaultTableModel table = (DefaultTableModel) jTablePedido.getModel();

            while(table.getRowCount()>0){
                table.removeRow(0);
            }
    }//GEN-LAST:event_jbresetarp1ActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoView().setVisible(true);
            }
        });
    }

    public JTable getjTableLanche() {
        return jTableLanche;
    }
   
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableLanche;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JButton jbCalcularT;
    private javax.swing.JButton jbConcluir;
    private javax.swing.JButton jbadicionarl;
    private javax.swing.JButton jbremoverl;
    private javax.swing.JButton jbresetarp1;
    private javax.swing.JComboBox<String> jcMetodo;
    private javax.swing.JTextField jtTempo;
    private javax.swing.JTextField jtdinheiro;
    private javax.swing.JTextField jtqnt;
    private javax.swing.JTextField jttotal;
    private javax.swing.JTextField jttroco;
    // End of variables declaration//GEN-END:variables
    

    
    private void listaClientes() {        
       
        DefaultTableModel tableModel = (DefaultTableModel) jTableCliente.getModel();
        tableModel.setNumRows(0);
        
        for(Cliente cliente : clientes) {
            tableModel.addRow(new Object[]{
                cliente.getNome(),
                cliente.getNumero(),
                cliente.getEndereco(),
                cliente.getCep(),
            });
        }
    }

    private void listaProdutos() {
       
        DefaultTableModel tableModel = (DefaultTableModel) jTableLanche.getModel();
        tableModel.setNumRows(0);
        
        for(Produto produto : produtos) {
            tableModel.addRow(new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getValor()
            });
        }
    }

    
    
    
}

