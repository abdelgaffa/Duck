public class mallardduck extends duck{
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void quack() {
        System.out.println("the bird is quacking");
    }

    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
