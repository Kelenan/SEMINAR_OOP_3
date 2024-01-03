package pharmacy;

import java.util.*;
import java.util.HashSet;


public class PharmacyMain {
    public static void main(String[] args) {
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt","20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.addComponents(pineceline);
        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, pineceline);
        IterablePharmacy pharmacy3 = new IterablePharmacy();
        pharmacy3.addComponents(sugar, pineceline);
        IterablePharmacy pharmacy4 = new IterablePharmacy();
        pharmacy4.addComponents(sugar, salt);


        ArrayList<Component> components = new ArrayList<Component>();
        components.add(salt);
        components.add(pineceline);
        components.add(sugar);
        Collections.sort(components);
        System.out.println(components);



        Set<IterablePharmacy> result = new HashSet<IterablePharmacy>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);


        System.out.println(result.size());
        ArrayList<IterablePharmacy> pharmacyArList= new ArrayList<IterablePharmacy>(result);
        System.out.println(result);
        Collections.sort(pharmacyArList);
        System.out.println(pharmacyArList);





        //while (iterator.hasNext()){e
          //  System.out.println(iterator.next());
        //}



    }
}
