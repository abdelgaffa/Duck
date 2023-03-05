public class mallardduck extends duck implements quackable , flyable{
    @Override
    public void display() {
        System.out.println("Duck's name : Mallard Duck");
    }

    @Override
    public void swim() {
        System.out.println("The ability to swim : can swim");
    }

    @Override
    public void quack() {
        System.out.println("The ability to quack : can quack");
    }

    @Override
    public void fly() {
        System.out.println("The ability to fly : can fly");
    }
}
