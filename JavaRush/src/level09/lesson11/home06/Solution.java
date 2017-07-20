package level09.lesson11.home06;

import java.util.ArrayList;

/* The fairy tale "Little Red Riding Hood"
1. There are five classes: a red cap, a grandmother, a patty, a woodcutter, a wolf.
2. Each class has 2 fields: killed (killed ArrayList) and ate (ate ArrayList).
3. Necessary objects are created (hood, grandmother, ...).
4. Arrange the right connection, who has eaten whom and killed, 
so that the logic of the fairy tale "Little Red Riding Hood" turned out.
PS: no one ate pies. They were only carried. The wolf has eaten a little. And then he was killed.
*/

public class Solution {
	public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }

    public static class LittleRedRidingHood extends StoryItem {
    }

    public static class Grandmother extends StoryItem {
    }

    public static class Patty extends StoryItem {
    }

    public static class Woodman extends StoryItem {
    }

    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}
