import polimorfismo.FacebookMensseger;
import polimorfismo.InstagramMensseger;
import polimorfismo.MSNMenssenger;
import polimorfismo.Mensseger;

public class App {
    public static void main(String[] args) {
        Mensseger smi = null;

        String app = "msn";

        if(app.equals("msn")) smi = new MSNMenssenger();
        else if (app.equals("fbc")) smi = new FacebookMensseger();
        else if (app.equals("ins")) smi = new InstagramMensseger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
