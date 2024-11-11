

public class PrintService {
    public void print(Gryffendor[] studentsGryffendor) {
        for (int i = 0; i < studentsGryffendor.length; i++) {
            Gryffendor studentsOfG = studentsGryffendor[i];
            System.out.println(studentsOfG);
        }

    }

    public void print(Slytherin[] studentSlytherin) {
        for (int i = 0; i < studentSlytherin.length; i++) {
            Slytherin studentsOfS = studentSlytherin[i];
            System.out.println(studentsOfS);
        }

    }

    public void print(Puffenduy[] studentPuffenduy) {
        for (int i = 0; i < studentPuffenduy.length; i++) {
            Puffenduy studentsOfP = studentPuffenduy[i];
            System.out.println(studentsOfP);
        }
    }

    public void print(Kogtevran[] studentsKogtevran) {
        for (int i = 0; i < studentsKogtevran.length; i++) {
            Kogtevran studentsOfK = studentsKogtevran[i];
            System.out.println(studentsOfK);
        }
    }
}
