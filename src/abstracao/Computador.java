package abstracao;

public class Computador {
    public static void main(String[] args) {
        MSNMenssenger msn = new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();
    
        FacebookMensseger fbc = new FacebookMensseger();
        fbc.enviarMensagem();
        fbc.receberMensagem();
    
        InstagramMensseger ins = new InstagramMensseger();
        ins.enviarMensagem();
        ins.receberMensagem();
    }
}
