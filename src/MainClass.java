import java.util.Arrays;

public class MainClass {

    private static int count;
    public static void main(String[] args) {

            Animal cat = new Cat("Murzik", 20, 0);
            cat.run(30);
            cat.swim(1);
            count++;

            Animal dog = new Dog("Sharik", 40, 10);
            dog.run(40);
            dog.swim(20);
            count++;
            
            System.out.println("Общее количество животных = " + count);
        }
        }










