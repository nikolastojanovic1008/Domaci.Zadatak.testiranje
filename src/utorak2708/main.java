package utorak2708;

public class main {
    public static void main(String[] args) {
        String tekst = "Neki String";
       // System.out.println(tekst.charAt(0));
        int duzinaStringa = tekst.length();

        for (int i = 0; i<duzinaStringa; i++ ){
            System.out.println("Karakter: " + tekst.charAt(i));
        }
        if (tekst.contains("String")){
            System.out.println("Imamo ga u tekstu");
        }else {
            System.out.println("nemamo ga u tekstu");
        }
        tekst.trim(); // briše sve praznine unutar Stringa
        tekst.isEmpty(); // vraća true ako nam je String prazan

    }
}
