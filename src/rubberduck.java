public class rubberduck extends duck{
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void quack() {
        System.out.println("the duck is squeaking");
    }

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
