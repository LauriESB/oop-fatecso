package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Pedido {
    private String numeroPedido;
    private String dataEmissao;
    private double valorPedido;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    } 
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
  
}
