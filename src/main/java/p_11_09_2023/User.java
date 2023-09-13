package p_11_09_2023;

import java.util.Random;

public class User {
    private int id; //default vrednost je 0
    private String ime; //default vrednost je null
    private String email; //default vrednost je null

    private int starost;//defualt vrednost je false

    //konstruktori
    public User() {
        System.out.println("pozvan je konstrukor");
        Random randomIdGenerator = new Random();
        this.id = randomIdGenerator.nextInt(1000);
    }


    //ovo je getter metoda, sluzi da se vade private stvari
    public String getIme() {
        return this.ime;
    }

    //ovo je setter metoda
    public void setIme(String ime) {
        this.ime = ime;
        //ovo levo oznacva da je leva promeljiva iz objekta a da je desna vrednost parametar iz metode.
    }

    public String getEmail() {
        return this.ime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStarist() {
        return this.starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }


}
