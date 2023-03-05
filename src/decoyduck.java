public class decoyduck extends duck {
    public decoyduck() {
        this.flyBehavior = new flynoway();
        this.quackBehavior = new muteduck();
    }

    public boolean swim() {
        return true;
    }

    public String display() {
        return "Decoy Duck";
    }

    public String toString() {
        String smth = this.display();
        return "1.Display : " + smth + "\n2.Kind : " + this.kind() +"\n3.KindOFfood : " +
                this.kindOFfood() +"\n4.Swim : " + this.swim() + "\n5.Fly : " + this.performFly() +
                "\n6.Quack : " + this.performQuack();
    }

    @Override
    public String kind() {
        return "Egyptian Duck";
    }

    @Override
    public String kindOFfood() {
        return "Fish";
    }

    public boolean performFly() {
        return this.flyBehavior.getFly();
    }

    public String performQuack() {
        return this.quackBehavior.getQuack();
    }

}
