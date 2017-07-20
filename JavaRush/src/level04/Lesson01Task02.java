package level04;
/* Implement the addPrice method
Implement the addPrice(int applesPrice) method so that when summing it, the total cost
Apples increased by the transferred value.
The total value of apples corresponds to the variable public static int applesPrice.
*/

public class Lesson01Task02 {
	public static void main(String[] args) {
       	new Apple();
        Apple.addPrice(50);
        new Apple();
        Apple.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple{
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice){
            Apple.applesPrice += applesPrice;
        }
    }
}
