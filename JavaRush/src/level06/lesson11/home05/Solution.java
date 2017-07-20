package level06.lesson11.home05;
/* Are there any new ideas? Let's think ...
1. In the Solution class, create a public static class Idea
2. In the Idea class, create the public String getDescription() method,
Which will return any non-empty text
3. In the Solution class, create a static method public void printIdea(Idea idea),
Which will display the description of the idea - this is what the getDescription method returns
*/

public class Solution {
	public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {
            return "Here's an Idea";
        }
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
}
