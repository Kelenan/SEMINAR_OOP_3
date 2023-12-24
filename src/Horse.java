import java.time.LocalDate;
import java.util.List;

public class Horse extends Animal implements Goable, Swimable{
    public Horse(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going",type);
        return 55.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming",type);
        return 12.0;
    }
}
