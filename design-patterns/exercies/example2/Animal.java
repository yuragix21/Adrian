public class Animal {
 public String name;
 public String sex;
 public int age;
 public double weight;
 public String color;


 public Animal(String name, String sex, int age, double weight, String color){
  this.name = name;
  this.sex = sex;
  this.age = age;
  this.weight = weight;
  this.color = color;
 }


 public String getName(){
  return name;
 }
 public void breathe(){
  System.out.println(name + " is breathe. ");
 }

 public void eat(String food){
  System.out.println(name + " is eating. " + food);
 }

 public void run(String destination){
  System.out.println(name + " is traveling for. " + destination);
 }

 public void sleep(int hours){
  System.out.println(name + " is sleeping for. " + hours + "hours");
 }

 @Override
 public String toString(){
  return
	  "name='" + name + '\'' + '\n' +
	  "sex='" + sex + '\'' + '\n' +
	  "age=" + age + '\n' + 
	  "weight=" + weight + '\n' +
	  "color'" + color + '\'';
 }
}
