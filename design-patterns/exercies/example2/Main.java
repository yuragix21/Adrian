public class Main {
 public static void main(String[] args){
  Human john = new Human("John", 30);
  Dog buddy = new Dog("Buddy", "Male", 5, 15.5, "Brown",john);

  Cat cat1 = new Cat("Esmeralda", "Female", 2, 1.35, "Gray", true);

  System.out.println(buddy.getName() + "'s best friend is " + buddy.getBestFriend().getName() + ".");
  buddy.bark();

  System.out.println("CAT OBJECT");
  System.out.println(cat1);
 }
}
