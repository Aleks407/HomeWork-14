public class Slytherin extends Hogwards {
    private int trick;
    private int determination;
    private int resourcefulness;
    private int ambition;
    private int thirstOfPower;

    public Slytherin(String firstName, String lastName, int powerOfMagic, int distanceOfTransgressions, int trick, int determination, int resourcefulness, int ambition, int thirstOfPower) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgressions);
        this.trick = trick;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
        this.thirstOfPower = thirstOfPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    public void setThirstOfPower(int thirstOfPower) {
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public String toString() {
        return "Слизерин: " +'\'' +firstName +" "+ lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgressions=" + distanceOfTransgressions +
                ", trick=" + trick +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", ambition=" + ambition +
                ", thirstOfPower=" + thirstOfPower ;
    }

    private int getTotalPoints() {
        return trick + determination + resourcefulness + ambition + thirstOfPower;
    }

    public static void getCompareStudents(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " Обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentTwo.getTotalPoints() > studentOne.getTotalPoints()) {
            System.out.println(studentTwo + " Обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }


}
