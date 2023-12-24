import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable, Swimable{
    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }


    @Override
    public double run() {
        System.out.printf("%s going",type);
        return 25.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming",type);
        return 5.0;
    }
}
