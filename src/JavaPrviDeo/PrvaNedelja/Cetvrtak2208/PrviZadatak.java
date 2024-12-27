package JavaPrviDeo.PrvaNedelja.Cetvrtak2208;

public class PrviZadatak {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti promenljivu koja ce da sadrzi vasu godinu rodjenja i
promenljivu koja ce da sadrzi trenutnu godinu.Kao rezultat stampa vas broj godina.
         */
        int godinaRodjenja = 1982;
        int trenutnaGodina = 2024;
        int mojeGodine = trenutnaGodina - godinaRodjenja;
        System.out.println("Moj broj godina je: " + mojeGodine);

        /*
        Zadatak 2:
Napraviti promenljive za vase ime, prezime i godinu rodjenja, zatim istampati ih u konzoli.

         */
        String ime = "Nikola ";
        String prezime = "Stojanović ";
        int godinaRođenja = 1982;
        System.out.println("Ja se zovem " + ime + prezime + " i rođen sam " + godinaRođenja + ". godine");


    }
}
