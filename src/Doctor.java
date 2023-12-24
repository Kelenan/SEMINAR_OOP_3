import java.time.LocalDate;
import java.util.List;

public class Doctor extends Staff implements Vaccinationable{
    public Doctor(String name, int age) {
        super(name, age);
    }
    public void Inspection(Animal animal){
        var animalType = animal.type;
        var illness = animal.illness;

        System.out.printf("Осмотр животного %s, и он болен %s",animalType,illness);
    }

    private Nurse nurse;
    public Doctor (Nurse nurse){
        super("yhg", 12);
        this.nurse = nurse;
    }


    @Override
    public void toVaccine() {
    }

}
