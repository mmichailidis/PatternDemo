package gr.mmichailidis.factory;

import gr.mmichailidis.factory.animal.Animal;
import gr.mmichailidis.factory.animal.Fish;
import gr.mmichailidis.factory.container.Cave;
import gr.mmichailidis.factory.container.Container;
import gr.mmichailidis.factory.place.Forest;
import gr.mmichailidis.factory.place.Place;

public class StoryTellerWithMethodFactory {

    public void tellMeAStory() {
        Animal animal = makeAnimal();
        Container container = makeContainer();
        Place place = makePlace();

        System.out.println("There was a " + animal.getName());
        System.out.println("The " + animal.getName() + " was living in a " + container.getName());
        System.out.println("But the " + animal.getName() + " was original from " + place.getName());
    }

    private Place makePlace() {
        return new Forest();
    }

    private Container makeContainer() {
        return new Cave();
    }

    private Animal makeAnimal() {
        return new Fish();
    }
}
