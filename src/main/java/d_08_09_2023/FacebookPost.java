package d_08_09_2023;

public class FacebookPost {
    public String imeIPrezimeKoJeObjavioPost;
    public String imeIPrezimeNaCijemProfiluJePostObjavljen;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void like() {
        brojLajkova++;
    }

    public void dislike() {
        brojLajkova--;
        if (brojLajkova < 0) {
            brojLajkova = 0;
        }
    }

    public void share() {
        brojDeljenja++;
    }

    public void print() {
        System.out.println(imeIPrezimeKoJeObjavioPost + " >>> " + imeIPrezimeNaCijemProfiluJePostObjavljen);
        System.out.println(tekstObjave);
        System.out.println("Likes " + brojLajkova + " | Shares " + brojDeljenja);
    }
}
