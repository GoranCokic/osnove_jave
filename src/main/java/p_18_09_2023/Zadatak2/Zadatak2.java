package p_18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih studentOsnovnih1 = new StudentOsnovnih("marko","123",6);
        StudentOsnovnih studentOsnovnih2 = new StudentOsnovnih("janko","345",3);

        StudentMaster studentMaster1 = new StudentMaster("zdenko","4343",1);
        StudentMaster studentMaster2 = new StudentMaster("kremenko", "3434",6);

        studentOsnovnih1.print();
        studentOsnovnih2.print();
        System.out.println("-----");
        studentMaster1.print();
        studentMaster2.print();
    }
}
