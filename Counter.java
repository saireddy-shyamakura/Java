package Counter;
import java.util.Scanner;

class Options {
    private final start start;
    public static int a = 0;

    public Options(start start) {
        this.start = start;
    }

    public void increment() {
        a++;
        System.out.println("Current Value is : " + a);
        start.star();
    }

    public void decrement() {
        a--;
        System.out.println("Current Value is : " + a);
        start.star();
    }

    public void clear() {
        a = 0;
        System.out.println("Value is clear");
        System.out.println("Current Value is : " + a);
        start.star();
    }

    public void save() {
        System.out.println("The value is saved : " + a);
        a = 0;
        System.out.println("Current value is : 0");
        start.star();
    }

    public void reset() {
        a = 0;
        System.out.println("Value is reset, your current value is : " + a);
        start.star();
    }
}


public class Counter {
    public static void main(String[] args) {
        start start = new start();
        System.out.println("Welcome to Counter");
        System.out.println("Current value is : 0");
        start.star();
    }
}

class start {
    private final Options options;

    public start() {
        options = new Options(this);
    }

    public void star() {
        System.out.println("Choose one");
        System.out.println("1. Increment \n2. Decrement \n3. Clear \n4. Save \n5. Reset");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                options.increment();
                break;
            case 2:
                options.decrement();
                break;
            case 3:
                options.clear();
                break;
            case 4:
                options.save();
                break;
            case 5:
                options.reset();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                star();
                break;
        }
    }
}
