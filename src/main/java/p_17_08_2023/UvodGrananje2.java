package p_17_08_2023;

public class UvodGrananje2 {
    public static void main(String[] args) {
        String ime="Milan";
        String email="nesto@gmail.com";
        //stringovi se porede ovako promenljiva.equals("tekst")
        if(!ime.equals("marko")){
            System.out.println("Ime je Milan");
        }
        if(email.contains("gmail")){
            System.out.println("ovo je true");
        }
    }
}
