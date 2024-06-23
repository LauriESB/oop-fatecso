package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Cliente extends Pessoa{
    private double limiteCredito;
    private double limiteDisponivel;
    private ArrayList<Pedido> pedidosCliente;
    
    public Cliente(String cpf, String nome, double limiteCredito) {
        super(nome, cpf);
        this.limiteCredito = limiteCredito;
        pedidosCliente = new ArrayList<Pedido>();
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }  
    
    public void addPedidosCliente(Pedido pedidos){
        pedidosCliente.add(pedidos);
        pedidos.setCliente(this);
        limiteDisponivel = limiteDisponivel - pedidos.getValorPedido(); 
    }
    
    public void retiraPedidosCliente(Pedido pedidos) {
        pedidosCliente.remove(pedidos);
        pedidos.setCliente(null);
        limiteDisponivel = limiteDisponivel + pedidos.getValorPedido();
    }
}
