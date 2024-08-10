package polimorfismo;

public abstract class Mensseger {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando conexão com a internet");
    }
}
