package gr.mmichailidis.factory;

public class Application {
    public static void main(String[] args) {
        DinosaurFactory dinosaurFactory = new DinosaurFactory();
        PonyFactory ponyFactory = new PonyFactory();
        FishFactory fishFactory = new FishFactory();

        StoryTeller dinoStory = new StoryTeller(dinosaurFactory);
        dinoStory.tellMeAStory();

        StoryTeller fishStory = new StoryTeller(fishFactory);
        fishStory.tellMeAStory();

        StoryTeller ponyStory = new StoryTeller(ponyFactory);
        ponyStory.tellMeAStory();

        StoryTellerWithMethodFactory methodFactory = new StoryTellerWithMethodFactory();
        methodFactory.tellMeAStory();
    }
}
