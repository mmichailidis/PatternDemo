package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.place.Place;

public interface AbstractFactory {
    Place makePlace();

    Container makeContainer();

    Animal makeAnimal();
}
