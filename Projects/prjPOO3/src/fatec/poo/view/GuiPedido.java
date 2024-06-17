/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author ichla
 */
public class GuiPedido extends javax.swing.JFrame {

    /**
     * Creates new form GuiPedido
     */
    public GuiPedido() {
        initComponents();
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
        jTextPane1 = new javax.swing.JTextPane();
        lblNumPed = new javax.swing.JLabel();
        lblDataPed = new javax.swing.JLabel();
        lblValorPed = new javax.swing.JLabel();
        lblCPFCli = new javax.swing.JLabel();
        lblCPFVend = new javax.swing.JLabel();
        txtNumPed = new javax.swing.JTextField();
        txtDataPed = new javax.swing.JTextField();
        txtValPed = new javax.swing.JTextField();
        txtCPFCli = new javax.swing.JTextField();
        txtCPFVend = new javax.swing.JTextField();
        btnConsultaCPFCli = new javax.swing.JButton();
        btnConsultaCPFVend = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblNomeVendedor = new javax.swing.JLabel();
        lblNomeCliente1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumPed.setText("Número do pedido");

        lblDataPed.setText("Data do pedido");

        lblValorPed.setText("Valor do Pedido");

        lblCPFCli.setText("CPF do cliente");

        lblCPFVend.setText("CPF do vendedor");

        txtDataPed.setEnabled(false);

        txtValPed.setEnabled(false);

        txtCPFCli.setEnabled(false);

        txtCPFVend.setEnabled(false);

        btnConsultaCPFCli.setText("Consultar");
        btnConsultaCPFCli.setEnabled(false);

        btnConsultaCPFVend.setText("Consultar");
        btnConsultaCPFVend.setEnabled(false);

        btnConsultar.setText("Consultar");

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnSair.setText("Sair");

        lblNomeVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeCliente1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPFCli)
                        .addGap(26, 26, 26)
                        .addComponent(txtCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaCPFCli)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomeCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorPed)
                        .addGap(18, 18, 18)
                        .addComponent(txtValPed, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnConsultar)
                        .addGap(11, 11, 11)
                        .addComponent(btnIncluir)
                        .addGap(9, 9, 9)
                        .addComponent(btnAlterar)
                        .addGap(5, 5, 5)
                        .addComponent(btnExcluir)
                        .addGap(7, 7, 7)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumPed)
                                    .addComponent(lblDataPed))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCPFVend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPFVend, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultaCPFVend)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPed)
                    .addComponent(txtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataPed)
                    .addComponent(txtDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorPed)
                    .addComponent(txtValPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPFCli)
                        .addComponent(txtCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultaCPFCli))
                    .addComponent(lblNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPFVend)
                        .addComponent(txtCPFVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultaCPFVend))
                    .addComponent(lblNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultaCPFCli;
    private javax.swing.JButton btnConsultaCPFVend;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblCPFCli;
    private javax.swing.JLabel lblCPFVend;
    private javax.swing.JLabel lblDataPed;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JLabel lblNumPed;
    private javax.swing.JLabel lblValorPed;
    private javax.swing.JTextField txtCPFCli;
    private javax.swing.JTextField txtCPFVend;
    private javax.swing.JTextField txtDataPed;
    private javax.swing.JTextField txtNumPed;
    private javax.swing.JTextField txtValPed;
    // End of variables declaration//GEN-END:variables
}