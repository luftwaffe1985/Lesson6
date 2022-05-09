//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Dog extends Animal {

    private final int maxRunLength = 500;
    private final double maxSwimLength = 10;

    @Override
    public void run(int obstLength) {
        if ((obstLength >= 0) && (obstLength <= maxRunLength)) System.out.println(name + " can run " + obstLength);
        else System.out.println(name + " can't run " + obstLength);
    }

    @Override
    public void swim(int obstLength) {
        if ((obstLength >= 0) && (obstLength <= maxSwimLength)) System.out.println(name + " can swim " + obstLength);
        else System.out.println(name + " can't swim " + obstLength);
    }

    private static int dogCount = 0;

    public Dog(String name, int runSpeed, int swimSpeed) {
        super(name, runSpeed, swimSpeed);
        dogCount++;
        System.out.println("Общее количество собак = " + dogCount);
    }

}
