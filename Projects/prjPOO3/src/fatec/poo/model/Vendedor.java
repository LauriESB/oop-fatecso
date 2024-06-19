package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidosVendedor;
    
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        pedidosVendedor = new ArrayList<>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao / 100;
    }
    
    public void addPedidoVendedor(Pedido pedidos) {
        pedidosVendedor.add(pedidos);
        pedidos.setVendedor(this);
    } 
     
     public void removePedido(Pedido pedido){
        pedidosVendedor.remove(pedido);
        pedido.setVendedor(null);
    }
}
