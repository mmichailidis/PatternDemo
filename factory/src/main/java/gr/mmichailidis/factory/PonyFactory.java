package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.animal.Pony;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.container.Stable;
import gr.mmichailidis.factory.place.Forest;
import gr.mmichailidis.factory.place.Place;

public class PonyFactory implements AbstractFactory {
    public Place makePlace() {
        return new Forest();
    }

    public Container makeContainer() {
        return new Stable();
    }

    public Animal makeAnimal() {
        return new Pony();
    }
}
