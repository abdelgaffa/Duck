public class rubberduck extends duck implements quackable{
    @Override
    public void display() {
        System.out.println("Duck's name : Rubber Duck");
    }

    @Override
    public void swim() {
        System.out.println("The ability to swim : cannot swim");
    }

    @Override
    public void quack() {
        System.out.println("The ability of quack : can squeak");
    }
    }
