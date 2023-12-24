import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Swimable, Flyable{
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying",type);
        return 15.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going",type);
        return 1.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming",type);
        return 7.0;
    }
}
