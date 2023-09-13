package d_12_09_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    ZeleniKarton(String imeIPrezimeStudenta,
                 String brojIndeksa,
                 String nazivPredmeta,
                 String imeIPrezimeProfesora,
                 int ocena){
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public int getOcena(){
        return this.ocena;
    }

    public String isPolozen(){
        if (ocena>5){
            return "yes";
        } else {
            return "no";
        }
    }

    public void print(){
        System.out.println("Predmet: " + this.nazivPredmeta + " - " + " ocena " + this.ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + " - " + " broj indeksa " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeIPrezimeProfesora);
    }
}

