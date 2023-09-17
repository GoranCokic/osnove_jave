package p_15_09_2023.Zadatak1;

public class Student extends Osoba{
    private String brojIndeksa;
    private int dugZaSkolarinu;

    public Student() { //defultni koristis da bi koristio gettter i setter
    }

    public Student(String brojIndeksa, int dugZaSkolarinu, String imeIPrezime, String jmbg) {
        super(imeIPrezime,jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void  uplatiSkolarinu(int uplata){
        this.dugZaSkolarinu = this.dugZaSkolarinu - uplata;
    }
    @Override
    public void stampa(){
        super.stampa();
        System.out.println("Broj indeksa " + this.brojIndeksa);
        System.out.println("Dug za skolarinu " + this.dugZaSkolarinu);
    }
}
