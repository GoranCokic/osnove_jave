package p_14_09_2023.Zadatak5;

public class TestStep {
    private String opis;
    private String actualVrednost;
    private String expectedVrednost;
    private String errorMessage;

    public TestStep(String opis,
                    String actualVrednost,
                    String expectedVrednost,
                    String errorMessage) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectedVrednost = expectedVrednost;
        this.errorMessage = errorMessage;
    }

    public String getOpis() {
        return opis;
    }

    public String getActualVrednost() {
        return actualVrednost;
    }

    public String getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean validateActExp() {
        if (this.actualVrednost.equals(this.expectedVrednost)) {
            this.errorMessage = "";
            return true;
        } else {
            this.errorMessage = "ubagovano";
            return false;
        }
    }

    public void stampa() {
        System.out.println("| " + this.opis + " |");
        String status;
        if (validateActExp()) {
            status = "passed";
        } else {
            status = "failed";
        }
        System.out.println("| " + status + " | " + this.errorMessage);
    }
}
