package p_12_09_2023;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public String getLinkZaPoziv() {
        return this.linkZaPoziv;
    }

    public void setLinkZaPoziv(String linkZaPoziv) {
        this.linkZaPoziv = linkZaPoziv;
    }
    public Korisnik getHost(){
        return this.host;
    }
    public void setHost(Korisnik host){
        this.host = host;
    }
    public void setGuest(){
        this.guest = guest;
    }
    public void pokreniPoziv(){
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Password je: " + this.password);
        System.out.println("Host je: " + this.host.getImeIPrezime());
        System.out.println("Guest je: " + this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je: " + this.host.trajanjePoziva() + "min" );
    }
}
