package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.place.Place;

public class StoryTeller {
    AbstractFactory factory;

    public StoryTeller(AbstractFactory factory) {
        this.factory = factory;
    }

    public void tellMeAStory() {
        Animal animal = factory.makeAnimal();
        Container container = factory.makeContainer();
        Place place = factory.makePlace();

        System.out.println("There was a " + animal.getName());
        System.out.println("The " + animal.getName() + " was living in a " + container.getName());
        System.out.println("But the " + animal.getName() + " was original from " + place.getName());
    }
}
