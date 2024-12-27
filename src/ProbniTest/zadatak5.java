package ProbniTest;

public class zadatak5 {
    public static void main(String[] args) {
        /*
        Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.
         */
        String[] nizStringova = {"jedan", "dva", "jedan", "dva", "tri"};
        stampaj(bezDuplikata(nizStringova));
    }

    public static String[] bezDuplikata(String[] niz) {
        int brojduplikata = 0;
        for (int i = 0; i < niz.length - 1; i++) {
            String trenutniElement = niz[i];
            for (int j = i + 1; j < niz.length; j++) {
                if(!trenutniElement.equals("") && trenutniElement.equalsIgnoreCase(niz[j]) ) {
                    brojduplikata++;
                    niz[j] = "";
                }

            }
        }
        String[] rezultat = new String[niz.length - brojduplikata];
        int j = 0;
        for (int i = 0; i < niz.length; i++) {
            if (!niz[i].equalsIgnoreCase("")) {
                rezultat [j] =niz[i];
                j++;
                if (j >= rezultat.length) {
                    break;
                }
            }
        }
        return rezultat;
    }

    static public void stampaj(String[] nekiniz) {
        for (int i = 0; i < nekiniz.length; i++) {
            System.out.println(nekiniz[i]);
        }
    }
}
