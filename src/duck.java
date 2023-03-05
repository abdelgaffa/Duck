public abstract class duck {
    protected flybehavior flyBehavior;
    protected quackbehavior quackBehavior;

    public duck() {
    }

    public abstract String display();

    public abstract boolean swim();

    public abstract String toString();

    public abstract String kind();

    public abstract String kindOFfood();

    public void setFlyBehavior(flybehavior fly) {
        this.flyBehavior = fly;
    }

    public void setQuackBehavior(quackbehavior quack) {
        this.quackBehavior = quack;
    }

    abstract boolean performFly();

    abstract String performQuack();
}
