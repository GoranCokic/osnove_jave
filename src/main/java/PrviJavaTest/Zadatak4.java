package PrviJavaTest;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        String unos = "Welcome to Google";
        String tip = "bold";
        String nekiLink = "google.com";

        System.out.println(kreiranjeAnchorTaga(nekiLink, unos));

        unos = "Ovaj deo je bold";
        tip = "bold";
        System.out.print(formatiranje(unos, tip));
        System.out.print(", a ");

        unos = "ovo je italic";
        tip = "italic";
        System.out.println(formatiranje(unos, tip));

        unos = "Naravno samo je falio paragraf";
        tip = "paragraph";
        System.out.println(formatiranje(unos, tip));
    }

    public static String formatiranje(String text, String tip) {
        if (tip.equals("bold")) {
            text = "<b>" + text + "</b>";
        } else if (tip.equals("italic")) {
            text = "<em>" + text + "</em>";
        } else if (tip.equals("paragraph")) {
            text = "<p>" + text + "</p>";
        }
        return text;
    }

    public static String kreiranjeAnchorTaga(String nekiLink, String text) {
        return "<a href=" + nekiLink + ">" + text + "</a>";
    }
}
