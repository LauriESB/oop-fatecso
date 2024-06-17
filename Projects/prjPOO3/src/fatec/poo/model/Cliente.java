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
    
    public Cliente(String nome, String cpf, double limiteCredito) {
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

    public void setLimiteDisponivel(double limiteCredito) {
        limiteDisponivel = limiteCredito;
    }  
    
    public void addPedidosCliente(Pedido pedidosCliente){
        this.pedidosCliente.add(pedidosCliente);
        pedidosCliente.setCliente(this);
        limiteDisponivel = limiteDisponivel - pedidosCliente.getValorPedido(); 
    }
    
    public void retiraPedidosCliente(Pedido pedidosCliente) {
        this.pedidosCliente.remove(pedidosCliente);
        pedidosCliente.setCliente(null);
        limiteDisponivel += pedidosCliente.getValorPedido();
    }
}
