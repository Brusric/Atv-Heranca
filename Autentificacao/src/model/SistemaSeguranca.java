package model;

public class SistemaSeguranca implements Autenticavel {
    private boolean autenticado = false;

    public boolean getAutenticado(){
        return autenticado;
    }

    @Override
    public boolean login(String usuario, String senha){
        if (usuario.equals("admin") && senha.equals("1234")){
            autenticado = true;
            return true;
        } else {
            autenticado = false;
            return false;
        }
    }
    @Override
    public void logout(){
        autenticado = false;
        System.out.println("Volte sempre :)");
    }
}
