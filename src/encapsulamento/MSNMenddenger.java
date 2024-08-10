package encapsulamento;

public class MSNMenddenger {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem..");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem..");
    }
    private void validarConexaoInternet(){
        System.out.println("Validadando conexão com a internet..");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagem..");
    }
}