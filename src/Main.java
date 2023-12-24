import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("Barsik", LocalDate.of(1993, 10, 1), new ArrayList<>(), "Chymka", "Boss", 4);
        System.out.println(barsic);

        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 10, 1), new ArrayList<>(), "Chymka", "Boss");
        Animal parrot = new Parrot("Sebastyan", LocalDate.of(2005, 5, 5), new ArrayList<>(), "Chymka", "Boss");
        Animal fish = new Fish("Dory", LocalDate.of(2006, 6, 1), new ArrayList<>(), "Chymka", "Boss");
        Animal shark = new Shark("Baby", LocalDate.of(2007, 7, 2), new ArrayList<>(), "Chymka", "Boss");
        Animal dog = new Dog("Hot", LocalDate.of(2008, 8, 2), new ArrayList<>(), "Chymka", "Boss");
        Animal horse = new Horse("Spirit", LocalDate.of(2009, 9, 3), new ArrayList<>(), "Chymka", "Boss");
        Animal duck = new Duck("Govard", LocalDate.of(2010, 10, 5), new ArrayList<>(), "Chymka", "Boss");
        Doctor doctor1 = new Doctor("Aibolit",35);
        Nurse nurse1 = new Nurse("Gala", 20);
        Doctor doctor2 = new Doctor("House",47);
        Nurse nurse2 = new Nurse("Klava", 23);


        System.out.println(duck.type);
        System.out.println(dog.type);

        VetClinic clinic = new VetClinic();
        clinic.addPatients(barsic, eagle, parrot, fish, shark, dog, horse, duck);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyable());
        System.out.println(clinic.getSwimable());
        System.out.println(clinic.getVaccinationable());



//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsic);
//        animals.add(eagle);

//        eagle.wakeup();
//        eagle.wakeup(2);



    }

}

