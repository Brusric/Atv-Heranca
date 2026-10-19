package model;

public class PagamentoCartao implements Pagamento {
    
    private double valor;

    public PagamentoCartao(double valor){
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento(){
        return valor + (valor * 0.05);
    }

    @Override
    public String emitirRecibo(){
        return "\n------ RECIBO CARTÃO ------\n"
        + "Valor: " + valor + "\n"
        + "Valor + taxa de 5%: " + calcularPagamento();
    }

}
