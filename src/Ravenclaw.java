import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wittiness;
    private int creative;

    public Ravenclaw(String name, int intellect, int wisdom, int wittiness, int creative, int powerOfMagic, int trangressions) {
        super(name, powerOfMagic, trangressions);

        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intellect == ravenclaw.intellect && wisdom == ravenclaw.wisdom && wittiness == ravenclaw.wittiness && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intellect, wisdom, wittiness, creative);
    }

    @Override
    public String toString() {
        return "Когтевран: имя " + getName() + ", ум " + intellect + ", мудрость " + wisdom + ", остроумие " + wittiness + ", творчество " + creative + ", сила магии " + getPowerOfMagic() + ", трансгрессия " + getTransgressions() + '.';
    }

    public void compareTwoStudentsAtOneFaculty(Ravenclaw ravenclaw) {

        int fullPower1 = this.getIntellect() + this.getWisdom() + this.getWittiness() + this.getCreative();
        int fullPower2 = ravenclaw.getIntellect() + ravenclaw.getWisdom() + ravenclaw.getWittiness() + ravenclaw.getCreative();
        if (fullPower1 > fullPower2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + ravenclaw.getName());
        } else if (fullPower1 < fullPower2) {
            System.out.println(ravenclaw.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Силы студентов равны.");
        }
    }
}
