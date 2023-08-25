package p_25_08_2023;

public class UvodMetode {
    public static void main(String[] args) {
        printHello(); //ovo je nacin da pozoves metodu u main metodu
        printHello(); // u debugger ides "step into" da analiza udje u donju metodu
        printHello();
    }
    public static void printHello(){
        System.out.println("Hello world");
    }
}
