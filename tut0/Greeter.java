public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            greeter(name);
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }

    public static void greeter(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

