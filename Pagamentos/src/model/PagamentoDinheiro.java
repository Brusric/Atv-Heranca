package model;

public class PagamentoDinheiro implements Pagamento {
    
    private double valor;

    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento(){
        return valor - (valor * 0.1);
    }

    @Override
    public String emitirRecibo(){
        return "\n------ RECIBO DINHEIRO ------\n"
        + "Valor: " + valor + "\n"
        + "Valor + desconto de 10%: " + calcularPagamento();
    }

}
