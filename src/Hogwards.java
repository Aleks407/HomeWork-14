import java.util.Objects;

public class Hogwards {
    protected final String firstName;
    protected final String lastName;
    protected int powerOfMagic;
    protected int distanceOfTransgressions;

    public Hogwards(String firstName, String lastName, int powerOfMagic, int distanceOfTransgressions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgressions = distanceOfTransgressions;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTransgressions() {
        return distanceOfTransgressions;
    }

    public void setDistanceOfTransgressions(int distanceOfTransgressions) {
        this.distanceOfTransgressions = distanceOfTransgressions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwards hogwards)) return false;
        return powerOfMagic == hogwards.powerOfMagic && distanceOfTransgressions == hogwards.distanceOfTransgressions && Objects.equals(firstName, hogwards.firstName) && Objects.equals(lastName, hogwards.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerOfMagic, distanceOfTransgressions);
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgressions=" + distanceOfTransgressions +
                '}';
    }


    private int getTotalPoints() {
        return powerOfMagic + distanceOfTransgressions;
    }


    public static void getCompareStudents(Hogwards studentOne, Hogwards studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.firstName+" "+studentOne.lastName+ " обладает большей мощностью магии, чем " + studentTwo.firstName+" "+studentTwo.lastName);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.firstName+" "+studentOne.firstName + " обладает большей мощностью магии, чем " + studentOne.firstName+" "+studentOne.lastName);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
