public class redheadduck extends duck {
    public redheadduck() {
        this.flyBehavior = new flywithwings();
        this.quackBehavior = new quack();
    }

    public boolean swim() {
        return true;
    }

    public String display() {
        return "Redhead Duck";
    }

    public String toString() {
        String smth = this.display();
        return "1.Display : " + smth + "\n2.Kind : " + this.kind() +"\n3.KindOFfood : " +
                this.kindOFfood() +"\n4.Swim : " + this.swim() + "\n5.Fly : " + this.performFly() +
                "\n6.Quack : " + this.performQuack();
    }

    @Override
    public String kind() {
        return "Canadian Duck";
    }

    @Override
    public String kindOFfood() {
        return "Tuna";
    }

    public boolean performFly() {
        return this.flyBehavior.getFly();
    }

    public String performQuack() {
        return this.quackBehavior.getQuack();
    }

}
