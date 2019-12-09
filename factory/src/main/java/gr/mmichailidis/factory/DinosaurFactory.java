package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.animal.Dinosaur;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.container.Cave;
import gr.mmichailidis.factory.place.Mountain;
import gr.mmichailidis.factory.place.Place;

public class DinosaurFactory implements AbstractFactory {
    public Place makePlace() {
        return new Mountain();
    }

    public Container makeContainer() {
        return new Cave();
    }

    public Animal makeAnimal() {
        return new Dinosaur();
    }
}
