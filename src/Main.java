public class Main {

    public static void main(String[] args) {
        System.out.println();

        Gryffendor[] studentsGryffendor = {
                new Gryffendor("Гарри", "Поттер", 20, 18, 22, 25, 25),
                new Gryffendor("Гермиона", "Грейнджер", 20, 18, 20, 20, 25),
                new Gryffendor("Рон", "Уизли", 18, 19, 19, 21, 25)

        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 18, 17, 15, 12, 10, 14, 15),
                new Slytherin("Грэхэм ", "Монтегю", 11, 10, 11, 15, 16, 19, 15),
                new Slytherin("Грегори", "Гойл", 10, 12, 14, 18, 20, 18, 17)

        };
        Puffenduy[] studentPuffenduy = {
                new Puffenduy("Захария", "Смит", 12, 20, 25, 26, 30),
                new Puffenduy("Седрик", "Диггори", 21, 8, 16, 10, 24),
                new Puffenduy(" Джастин", "Финч-Флетчли", 20, 18, 16, 19, 20)
        };
        Kogtevran[] studentsKogtevran = {
                new Kogtevran("Чжоу", "Чанг", 10, 9, 14, 20, 22, 25),
                new Kogtevran("Падма", "Патил", 9, 10, 11, 18, 20, 22),
                new Kogtevran("Маркус", "Белби", 11, 10, 13, 19, 21, 23)
        };

        PrintService printService = new PrintService();
        printService.print(studentsGryffendor);
        printService.print(studentSlytherin);
        printService.print(studentPuffenduy);
        printService.print(studentsKogtevran);

        System.out.println();
        Hogwards.getCompareStudents(studentsGryffendor[0], studentSlytherin[0]);
    }

}




