import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){


        String senhaFracaString = "^(?=.*[0-9])(?=.*[a-z]).{6,}$";
        String senhaMediaString = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$";
        String senhaForteString = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{12,}$";


        Pattern senhaFracaPattern = Pattern.compile(senhaFracaString);
        Pattern senhaMediaPattern = Pattern.compile(senhaMediaString);
        Pattern senhaFortePattern = Pattern.compile(senhaForteString);

        SenhaFraca senhaFraca = new SenhaFraca(senhaFracaPattern);
        senhaFraca.setValue("teste1");

        SenhaMedia senhaMedia = new SenhaMedia(senhaMediaPattern);
        senhaMedia.setValue("Teste123");

        SenhaMtForte senhaForte = new SenhaMtForte(senhaFortePattern);
        senhaForte.setValue("Teste12345678***");

        SenhaMtForte outraSenhaForte = new SenhaMtForte(senhaFortePattern);
        outraSenhaForte.setValue("teste123");
    }
}
