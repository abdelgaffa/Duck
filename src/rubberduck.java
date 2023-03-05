public class rubberduck extends duck{
    public rubberduck() {
        this.flyBehavior = new flynoway();
        this.quackBehavior = new squeak();
    }

    public boolean swim() {
        return true;
    }

    public String display() {
        return "Rubber Duck";
    }

    public String toString() {
        String smth = this.display();
        return "1.Display : " + smth + "\n2.Kind : " + this.kind() +"\n3.KindOFfood : " +
                                            this.kindOFfood() +"\n4.Swim : " + this.swim() + "\n5.Fly : " + this.performFly() +
                "\n6.Quack : " + this.performQuack();
    }

    @Override
    public String kind() {
        return "Fake Duck";
    }

    @Override
    public String kindOFfood() {
        return "No food cuz its not real";
    }

    public boolean performFly() {
        return this.flyBehavior.getFly();
    }

    public String performQuack() {
        return this.quackBehavior.getQuack();
    }


}
