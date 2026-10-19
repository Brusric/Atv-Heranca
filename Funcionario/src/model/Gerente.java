package model;

public class Gerente implements Funcionario {
    @Override
    public String baterPonto(){
        return "Gerente bateu o ponto";
    }
    public String fecharCaixa() {
        return "Gerente fechou o caixa";
    }
}
