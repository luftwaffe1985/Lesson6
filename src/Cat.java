//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Cat extends Animal{





    private final int maxRunLength = 200;

    @Override
    public void run(int obstLength) {
        if ((obstLength >= 0) && (obstLength <= maxRunLength)) System.out.println(name + " can run " + obstLength);
        else System.out.println(name + " can't run " + obstLength);
    }

    @Override
    public void swim(int obstLength) {
        System.out.println(name + " can't swim " );
    }
    private static int catCount = 0;

    public Cat (String name, int runSpeed, int swimSpeed) {
        super(name, runSpeed, swimSpeed);
        catCount++;
        System.out.println("Общее количество котов = " + catCount);
        }

}



