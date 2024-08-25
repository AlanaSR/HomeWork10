import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int powerOfMagic, int trangressions) {
        super(name, powerOfMagic, trangressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, lustForPower);
    }

    @Override
    public String toString() {
        return "Слизерин: имя " + getName() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + lustForPower + ", сила магии " + getPowerOfMagic() + ", трансгрессия " + getTransgressions() + '.';
    }

    public void compareTwoStudentsAtOneFaculty(Slytherin slytherin) {

        int fullPower1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int fullPower2 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
        if (fullPower1 > fullPower2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + slytherin.getName());
        } else if (fullPower1 < fullPower2) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Силы студентов равны.");
        }
    }
}
