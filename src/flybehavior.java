public interface flybehavior {
    private boolean fly() {
        return false;
    }

    default boolean getFly() {
        return this.fly();
    }
}
