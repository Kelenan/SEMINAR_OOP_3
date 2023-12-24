import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable) result.add((Goable) animal);
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyable) result.add((Flyable) animal);
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimable) result.add((Swimable) animal);
        }
        return result;
    }
    public List<Animal> getPatients() {
        return patients;
    }

    public List<Vaccinationable> getVaccinationable() {
        List<Vaccinationable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Vaccinationable) result.add((Vaccinationable) animal);
        }
        return result;
    }


}
