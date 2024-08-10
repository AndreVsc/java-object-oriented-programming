package heranca;

public class Computador {
    public static void main(String[] args) {
        FacebookMensseger fbc = new FacebookMensseger();
        fbc.enviarMensagem();
        fbc.receberMensagem();
    
        TelegramMensseger tlg = new TelegramMensseger();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        InstagramMensseger ins = new InstagramMensseger();
        ins.enviarMensagem();
        ins.receberMensagem();
    }
}
