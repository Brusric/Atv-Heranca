import model.*;

public class Main {
    public static void main(String[] args) {
        Pagamento pC = new PagamentoCartao(100);
        Pagamento pD = new PagamentoDinheiro(100);

        System.out.println(pC.emitirRecibo());
        System.out.println(pD.emitirRecibo());

    }
}
