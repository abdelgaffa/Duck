public class redheadduck extends duck {

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void quack() {
        System.out.println("can quack");
    }

    @Override
    public void fly() {
        System.out.println("the bird is quacking");
    }
}

