package p_14_09_2023.Zadatak5;

import java.util.ArrayList;

public class TestCase {
    private String id;
    private String nazivTestCasea;
    private ArrayList<TestStep> nizTestCaseva;

    public TestCase(String id, String nazivTestCasea) {
        this.id = id;
        this.nazivTestCasea = nazivTestCasea;
        this.nizTestCaseva = new ArrayList<TestStep>();
    }

    public void dodajTestStep(TestStep testStep){
        this.nizTestCaseva.add(testStep);
    }

    public int brojTestStepovaKojiFail() {
        int brojac = 0;
        for (int i = 0; i < this.nizTestCaseva.size(); i++) {
            if (this.nizTestCaseva.get(i).getActualVrednost().equals(this.nizTestCaseva.get(i).getExpectedVrednost())) {
                brojac++;
            }
        }
        return brojac;
    }
    public String daLiJeTestCasePassIliFail(){
        if (this.brojTestStepovaKojiFail() == 0){
            return "PASSED";
        } else {
            return "FAILED";
        }
    }
    public void stampa(){
        System.out.println(this.id + " - " + this.nazivTestCasea);
        for (int i = 0; i < this.nizTestCaseva.size(); i++) {
            System.out.println("| " + this.nizTestCaseva.get(i).getOpis() + " |");
            String passedFailed;
            if (this.nizTestCaseva.get(i).getErrorMessage().equals("")){
                passedFailed = "passed";
            } else {
                passedFailed = "failed";
            }
            System.out.println("| Status " + passedFailed + " | " + this.nizTestCaseva.get(i).getErrorMessage());
        }

    }
}
