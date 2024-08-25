public class Main {

    public static int rnd() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {

        Griffindor griffindor1 = new Griffindor("Гермиона Грейнджер", rnd(), rnd(), rnd(), rnd(), rnd());
        Griffindor griffindor2 = new Griffindor("Рональд Уизли", rnd(), rnd(), rnd(), rnd(), rnd());
        Griffindor griffindor3 = new Griffindor("Гарри Поттер", rnd(), rnd(), rnd(), rnd(), rnd());
        Slytherin slytherin1 = new Slytherin("Драко малфой", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        Slytherin slytherin2 = new Slytherin("Грегори Гойл", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        Slytherin slytherin3 = new Slytherin("Грэхэм Монтегю", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        Hufflepuff hufflepuff1 = new Hufflepuff("Седрик Диггори", rnd(), rnd(), rnd(), rnd(), rnd());
        Hufflepuff hufflepuff2 = new Hufflepuff("Джастин Фитч-Флетчли", rnd(), rnd(), rnd(), rnd(), rnd());
        Hufflepuff hufflepuff3 = new Hufflepuff("Захария Смит", rnd(), rnd(), rnd(), rnd(), rnd());
        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу Чанг", rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма Паттил", rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус Белби", rnd(), rnd(), rnd(), rnd(), rnd(), rnd());
        System.out.println(griffindor1.toString());
        System.out.println(slytherin2.toString());
        hufflepuff3.compareTwoStudentsAtOneFaculty(hufflepuff1);
        griffindor2.compareTwoStudentsAtOneFaculty(griffindor3);
        slytherin3.compareTwoStudentsAtOneFaculty(slytherin1);
        ravenclaw3.compareTwoStudentsAtOneFaculty(ravenclaw2);
        griffindor1.compareTwoStudentsAtOneHogwarts(slytherin2);
        ravenclaw1.compareTwoStudentsAtOneHogwarts(hufflepuff2);
    }
}