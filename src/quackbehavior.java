public interface quackbehavior {
    private String quack() {
        return null;
    }

    default String getQuack() {
        return this.quack();
    }
}
