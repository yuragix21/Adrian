public class Cat {
 public String name;
 public String sex;
 public int age;
 public double weight;
 public String color;
 public String texture;

 public Cat(String name, String sex, int age, double weight, String color, String texture){
  this.name = name;
  this.sex = sex;
  this.age = age;
  this.weight = weight;
  this.color = color;
  this.texture = texture;
 }

 @Override
 public String toString(){
 return 
     "name='" + name + '\'' + '\n' +
     "sex='" + sex + '\'' + '\n' +
     "age=" + age + '\n' +
     "weight=" + weight + '\n' +
     "color='" + color + '\'' + '\n' +
     "texture='" + texture + '\'';
 }
}
