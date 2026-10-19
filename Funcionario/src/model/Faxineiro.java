package model;

public class Faxineiro implements Funcionario {
    @Override
    public String baterPonto(){
        return "Faxineiro bateu o ponto";
    }
    public String solicitarMaterial(){
        return "Faxineiro solicitou o material";
    }
}
