public class Gryffendor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffendor(String firstName, String lastName, int powerOfMagic, int distanceOfTransgressions, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Грифендор:" + '\'' + firstName +
                " " + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgressions=" + distanceOfTransgressions +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    private int getTotalPoints() {
        return nobility + honor + bravery;
    }

    public static void getCompareStudents(Gryffendor studentOne, Gryffendor studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " Обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " Обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }

    }
}