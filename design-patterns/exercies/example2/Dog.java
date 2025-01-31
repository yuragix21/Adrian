public class Dog extends Animal {
 private Human bestFriend;

 public void bark(){
  System.out.println(name + " is bark!!!!. ");
 }

 public Dog(String name, String sex, int age, double weight, String color, Human bestFriend){
  super(name, sex, age, weight, color);

  this.bestFriend = bestFriend;
 }

 public Human getBestFriend(){
  return bestFriend;
 }

 public void setBestFriend(){
  this.bestFriend = bestFriend; 
 }

 @Override
 public String toString(){
  return
	"name='" + name + '\'' + '\n' +
	"sex='" + sex + '\'' + '\n' +
	"age=" + age + '\n' +
	"weight=" + weight + '\n' +
	"color='" + color + '\'' + '\n' +
	"bestFriend=" + bestFriend;
 }
}
