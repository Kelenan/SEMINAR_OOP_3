import java.time.LocalDate;
import java.util.List;

public class Parrot extends Animal implements Flyable, Goable{
    public Parrot(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s flying",type);
        return 4.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going",type);
        return 0.5;
    }
}

