import java.util.Objects;

public abstract class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgressions;


    public Hogwarts(String name, int powerOfMagic, int transgressions) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressions = transgressions;
    }

    public abstract void printStudent();

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
    }

    public void compareTwoStudentsAtOneHogwarts(Hogwarts student) {

        int fullPower1 = student.getPowerOfMagic() + student.getPowerOfMagic();
        int fullPower2 = this.getPowerOfMagic() + this.getPowerOfMagic();
        if (fullPower1 > fullPower2) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else if (fullPower1 < fullPower2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else {
            System.out.println("Силы студентов равны.");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerOfMagic == hogwarts.powerOfMagic && transgressions == hogwarts.transgressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerOfMagic, transgressions);
    }

    @Override
    public String toString() {
        return "Хогвартс: сила магии " + powerOfMagic + ", трансгрессия " + transgressions + '.';
    }
}

