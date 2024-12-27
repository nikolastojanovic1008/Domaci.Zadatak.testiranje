package JavaPrviDeo.PrvaNedelja.Cetvrtak2208;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teorija {
    public static void main(String[] args) {

        // OVO je jednolinijski komentar
        /*
        Ovo je
        viselinijski komentar
         */

        int ceoBroj; // deklaracija promenjive
        ceoBroj = 5; // inicijalizacija promenjive
        int ceoBroj1 = -7; //deklaracija i inicijalizacija

        double realanBroj = 5.341; // realan broj
        char karakter = 'a';
        boolean logickiTip = 5 == 2;  //logicki tip = false
        boolean ligickiTip1 = 2 == 2; //logicki tip = true
        String text = "Ovo je neki tekst 2!";

        //Aritmeticki operatori
        int sabiranje = 5 + 3;
        System.out.println("Rezultat sabiranja je: " + sabiranje);
        int oduzimanje = 4 -2;
        System.out.println("Rezultat oduzimanja je: " + oduzimanje);
        int mnozenje = 5 * 3;
        System.out.println("Rezultat mnozenja je: " + mnozenje);
        double deljenje = 5.0 / 2;
        System.out.println("rezultat deljenja je: " + deljenje);
        int ostatak = 5 % 2;
        System.out.println("Ostatak pri deljenju je: " + ostatak);
        int a = 5;
        a = 7;
        System.out.println("Rezultat dodele je: " + a);
        //a++;
        System.out.println("Rezultat inkrementa je: " + a++);
        System.out.println(a);
        //--a;
        System.out.println("Rezultat dekrementa je: " + a--);
        System.out.println(a);

//Operatori pridruzivanja
        int broj = 1;
        broj = broj + 5;
        broj+= 5; // broj = broj + 5
        broj-= 7; // broj = broj - 7
        broj*=2; // broj = broj * 2
        broj/=3; // broj = broj / 3


// Operatori poredjenja
        System.out.println(5>2); // operator vece
        System.out.println(5<2); // operator manje
        System.out.println(5>=5); // vece-jednako
        System.out.println(5<=4); // manje-jednako
        System.out.println(5==5); // == koristi se da proverimo cele brojeve po jednakosti
        System.out.println(5!=4); // != koristimo da proverimo nejednakost medu brojevima

//Operacije sa stringovima
        String txt1 = "Ovo je";
        String txt2 = " moj string";
        String txt3 = txt1 + txt2; // Ovo je moj string
        System.out.println(txt3);
        String txt4 = txt3.toLowerCase();
        System.out.println(txt4);
        String txt5 = txt3.toUpperCase();
        System.out.println(txt5);
// Stringove poredimo koristeci equals metodu
        System.out.println(txt1.equals(txt2)) ;// Poredimo stringove obracajuci paznju na velicinu karaktera
        String txt11 = "ovo je";
        System.out.println(txt1.equalsIgnoreCase(txt11)); //Poredimo stringove NE obracajuci paznju na velicinu karaktera
/*
Zadatak 1:
Napraviti promenljivu koja ce da sadrzi vasu godinu rodjenja i
promenljivu koja ce da sadrzi trenutnu godinu.Kao rezultat stampa vas broj godina.
 */




        System.out.printf("Hello and welcome!");


        }
    }
