public class Cat extends Animal {
 private boolean isNasty;

 public void meow(){
  System.out.println(name + " is meow!!!!. ");
 }

 public Cat(String name, String sex, int age, double weight, String color, boolean isNasty){
  super(name, sex, age, weight, color);
  this.isNasty = isNasty;
 }

 // Getters and Setters
 public boolean getIsNasty(){
  return isNasty;
 }

 public void setIsNasty(boolean isNasty){
  this.isNasty = isNasty;
 }

 @Override
 public String toString(){
  return
	"name='" + name + '\'' + '\n' +
	"sex='" + sex + '\'' + '\n' +
	"age=" + age + '\n' +
	"weight" + weight + '\n' +
	"color='" + color + '\'' + '\n' +
	"isNasty=" + isNasty + '\n'; 
 }
}
