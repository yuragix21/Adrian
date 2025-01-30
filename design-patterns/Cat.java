public class Cat{
 public String name;
 public String gender;
 public int age;
 public double weight;
 public String color;

 public Cat(String name, String gender, int age, double weight, String color){
  this.name = name;
  this.gender = gender;
  this.age = age;
  this.weight = weight;
  this.color = color;
 }

 // Getters
 public String getName(){
  return name;
 }

 public String getGender(){
  return gender;
 }

 public int getAge(){
  return age;
 }

 public double getWeight(){
  return weight;
 }

 public String getColor(){
  return color;
 }

 // Setters
 public void setName(String newName){
  this.name = newName;
 }

 public void setGender(String newGender){
  this.gender = newGender;
 }

 public void setAge(int newAge){
  this.age = newAge;
 }

 public void setWeight(double newWeight){
  this.weight = newWeight;
 }

 public void setColor(String newColor){
  this.color = newColor;
 }

 // methods
 public void breathe(){
  System.out.println(name + " is breathing. ");
 }

 public void eat(String food){
  System.out.println(name + " is eating. " + food);
 }

 public void run(String destination){
  System.out.println(name + " is travel. " + destination);
 }

 public void sleep(int hours){
  System.out.println(name + "is sleeping much. " + hours);
 }

 public void meow(){
  System.out.println(name + "meowwwwwww!!!. ");
 }

 // toString method for better readability
 @Override
 public String toString(){
  return 
	  "name='" + name + '\'' +
	  ", gender='" + gender + '\'' +
	  ", age=" + age +
	  ", weight=" + weight + 
	  ", color='" + color + '\'';
 }

 	
}
