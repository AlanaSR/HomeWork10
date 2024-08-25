import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int hardworking, int loyalty, int honesty, int powerOfMagic, int trangressions) {
        super(name, powerOfMagic, trangressions);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
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
    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardworking, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Пуффендуй: имя " + getName() + ", трудолюбие " + hardworking + ", верность " + loyalty + ", честность" + honesty + ", сила магии " + getPowerOfMagic() + ", трансгрессия " + getTransgressions() + '.';
    }
    public void compareTwoStudentsAtOneFaculty(Hufflepuff hufflepuff) {

        int fullPower1 = this.getHardworking() + this.getLoyalty() + this.getHonesty();
        int fullPower2 = hufflepuff.getHardworking() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
        if (fullPower1 > fullPower2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
        } else if (fullPower1 < fullPower2) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Силы студентов равны.");
        }
    }
}
