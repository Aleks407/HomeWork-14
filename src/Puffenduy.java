public class Puffenduy extends Hogwards {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String firstName, String lastName, int powerOfMagic, int distanceOfTransgressions, int diligence, int loyalty, int honesty) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgressions);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуфендуй: " +'\'' +firstName +" "+ lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgressions=" + distanceOfTransgressions +
                ", honesty=" + honesty +
                ", loyalty=" + loyalty +
                ", diligence=" + diligence;
    }

    private int getTotalPoints() {
        return diligence + loyalty + honesty;
    }

    public static void getCompareStudents(Puffenduy studentOne, Puffenduy studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " Обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentTwo.getTotalPoints() > studentOne.getTotalPoints()) {
            System.out.println(studentTwo + " Обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }

}
