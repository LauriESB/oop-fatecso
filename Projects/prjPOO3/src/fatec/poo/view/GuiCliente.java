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
public class GuiCliente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCliente
     */
    public GuiCliente() {
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

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblLimiteCredito = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtLimiteCredito = new javax.swing.JTextField();
        txtTelefone01 = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox<>();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblLimiteDisponivel = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblLimite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCPF.setText("CPF");
        getContentPane().add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        lblEndereco.setText("Endereco");
        getContentPane().add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        lblTelefone.setText("Telefone");
        getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        lblLimiteCredito.setText("Limite de crédito");
        getContentPane().add(lblLimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 154, -1));

        txtNome.setEnabled(false);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, -1));

        txtEndereco.setEnabled(false);
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 350, -1));

        txtCidade.setEnabled(false);
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 250, -1));

        txtTelefone.setEnabled(false);
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, -1));

        txtLimiteCredito.setEnabled(false);
        getContentPane().add(txtLimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 90, -1));

        txtTelefone01.setEnabled(false);
        getContentPane().add(txtTelefone01, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 30, -1));

        lblUF.setText("UF");
        getContentPane().add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxUF.setEnabled(false);
        getContentPane().add(cbxUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 70, -1));

        lblCEP.setText("CEP");
        getContentPane().add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        txtCEP.setEnabled(false);
        getContentPane().add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 140, -1));

        lblLimiteDisponivel.setText("Limite disponível");
        getContentPane().add(lblLimiteDisponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        getContentPane().add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        btnSair.setText("Sair");
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        lblLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 110, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblLimiteDisponivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefone01;
    // End of variables declaration//GEN-END:variables
}