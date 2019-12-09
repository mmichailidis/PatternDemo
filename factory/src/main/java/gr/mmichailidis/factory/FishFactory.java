package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.animal.Fish;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.container.Tank;
import gr.mmichailidis.factory.place.Aquarium;
import gr.mmichailidis.factory.place.Place;

public class FishFactory implements AbstractFactory {
    public Place makePlace() {
        return new Aquarium();
    }

    public Container makeContainer() {
        return new Tank();
    }

    public Animal makeAnimal() {
        return new Fish();
    }
}
