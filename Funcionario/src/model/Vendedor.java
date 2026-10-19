package model;

public class Vendedor implements Funcionario {
    @Override
    public String baterPonto(){
        return "Vendedor bateu o ponto";
    }
    public String realizarVenda(){
        return "Vendedor realizou a venda";
    }
}
