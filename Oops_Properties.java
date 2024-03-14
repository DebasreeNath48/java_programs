interface Flyable{
    void fly();
    void color(String col);
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}
class Bird extends Animal implements Flyable{
    Bird(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println(name + " chirps");
    }
    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }
    @Override
    public void color(String col){
        System.out.println("Color is: "+col);
    }

}
public class Oops_Properties {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot");
        bird.makeSound();
        bird.fly();
        bird.color("Green");
    }
}
