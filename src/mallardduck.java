public class mallardduck extends duck {
    mallardduck() {
        this.quackBehavior = new quack();
        this.flyBehavior = new flybehavior() {
        };
    }

    public boolean swim() {
        return false;
    }

    public String display() {
        return "Mallard Duck";
    }


    public String toString() {
        String smth = this.display();
        return "1.Display : " + smth + "\n2.Kind : " + this.kind() +"\n3.KindOFfood : " +
                this.kindOFfood() +"\n4.Swim : " + this.swim() + "\n5.Fly : " + this.performFly() +
                "\n6.Quack : " + this.performQuack();
    }

    @Override
    public String kind() {
        return "American Duck";
    }

    @Override
    public String kindOFfood() {
        return "Cabbage & Cucumber";
    }

    public boolean performFly() {
        return this.flyBehavior.getFly();
    }

    public String performQuack() {
        return this.quackBehavior.getQuack();
    }

}
