import java.util.Objects;

public class Griffindor extends Hogwarts {

    private int nobleness;
    private int honor;
    private int bravery;


    public Griffindor(String name, int nobleness, int honor, int bravery, int powerOfMagic, int trangressions) {
        super(name, powerOfMagic, trangressions);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }


    public void compareTwoStudentsAtOneFaculty(Griffindor griffindor) {

        int fullPower1 = this.getNobleness() + this.getHonor() + this.getBravery();
        int fullPower2 = griffindor.getNobleness() + griffindor.getHonor() + griffindor.getBravery();
        if (fullPower1 > fullPower2) {
            System.out.println(this.getName() + " лучший Грифиндорец, чем " + griffindor.getName());
        } else if (fullPower1 < fullPower2) {
            System.out.println(griffindor.getName() + " лучший Грифиндорец, чем " + this.getName());
        } else {
            System.out.println("Силы студентов равны.");
        }
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Griffindor that = (Griffindor) o;
        return nobleness == that.nobleness && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobleness, honor, bravery);
    }

    @Override
    public String toString() {
        return "Гриффиндор: имя " + getName() + ", благородство " + nobleness + ", честь " + honor + ", храбрость " + bravery + ", сила магии " + getPowerOfMagic() + ", трансгрессия " + getTransgressions() + ".";
    }
}
