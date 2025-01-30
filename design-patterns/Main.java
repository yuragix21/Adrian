public class Main {
 public static void main(String[] args){
  Cat myCat = new Cat("Oscar", "Male", 3, 4.45, "Black");
  System.out.println(myCat);
  myCat.breathe();
  myCat.eat("fish");
  myCat.run("the garden");
  myCat.sleep(5);
  myCat.meow();

  //Update the cat's name and age
  myCat.setName("Mittens");
  myCat.setAge(4);

  // Print updated details
  System.out.println("Updated cat details: " + myCat);
 }
}
