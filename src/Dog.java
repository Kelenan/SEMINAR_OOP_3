import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimable, Vaccinationable{
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
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

    @Override
    public void toVaccine() {
        System.out.printf("%s vaccine",type);


    }
}
