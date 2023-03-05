public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        duck[] duck = new duck[]{new mallardduck(),new rubberduck(), new decoyduck(), new redheadduck()};

        for(int i = 0; i < duck.length; ++i) {
            System.out.println(duck[i].toString() + "\n");
        }

    }
}
