import java.time.LocalDate;
import java.util.List;

public class Shark extends Animal implements Swimable{
    public Shark(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming",type);
        return 75.0;
    }
}
