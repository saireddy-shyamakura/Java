package constructor;

 class doggy{
    String name;
    int age;
}
 
public class dogs{
    public static void main(String[] args) {
        doggy doggy = new doggy();
        doggy.name = "goldie";
        doggy.age = 7;
        System.out.println(doggy.age);
        System.out.println(doggy.name);
    }
}