public class Kogtevran extends Hogwards {
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String firstName, String lastName, int powerOfMagic, int distanceOfTransgressions, int smart, int wisdom, int wit, int creativity) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgressions);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран: " +'\'' +firstName +" "+ lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgressions=" + distanceOfTransgressions +
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }

    private int getTotalPoints() {
        return smart + wisdom + wit + creativity;
    }

    public static void getCompareStudents(Kogtevran studentOne, Kogtevran studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " Обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " Обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }

    }
}
