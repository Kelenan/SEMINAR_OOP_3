package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>     {
    private int index;
    private List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        //components c = components.get(index);
        //index++;
        //return c;
        return components.get(index++);
    }
}
