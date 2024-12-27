package DrugiDeoOOP.Projekti.Fakultet1;

public class Main {
    public static void main(String[] args) {
        Osoba x = new Osoba("Nikola", "Stojanović", 1982);


        Student student = new Student("Milan", "Milošević", 1990, "1990/1234", 8.9);
        Predmet predmet1 = new Predmet("Matematika", 7, "Prof. Dr. Stošić");
        Predmet predmet2 = new Predmet("Programiranje", 9, "Doc. Dr. Nešić");
        Predmet predmet3 = new Predmet("Fizika", 6,"Prof. Dr. Stojanović");

        student.dodajPredmet(predmet1);
        student.dodajPredmet(predmet2);
        student.dodajPredmet(predmet3);
        System.out.println(student.predstaviSe());
        student.ispisPredmeta();
    }
}
