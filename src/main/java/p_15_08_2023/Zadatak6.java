package p_15_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
//        Naci zbir, razliku, kolicnik i proizvod brojeva a i b i rezultate smestati u odgovarajuce     promenljive.Na kraju programa odstampati rezultate
//        Primer izvrsenja:
//        a: 10
//        b: 2
//        Zbir je 12
//        Razlika je 8
//        Proizvod je 20
//        Kolicnik je 5
        int a=10;
        int b=2;
        int zbir =a+b;
        int razlika=a-b;
        int proizvod=a*b;
        int kolicnik=a/b; // /celobrojno deljenje 10/3=3 10/3.0=3.33333 ili samo pomnozis sa 1.0 npr 1.0 * 10/3=3.3333
        System.out.println("zbir je: " + zbir);
        System.out.println("razlika je: " + razlika);
        System.out.println("proizvod je: " + proizvod);
        System.out.println("kolicnik je: " + kolicnik);

    }
}
