//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
//

public abstract class Animal {


    protected String name;
    protected int runSpeed;
    protected int swimSpeed;

    final int maxRunLength = 0;
    final int maxSwimLength = 0;

    abstract void run(int obstLength);

    abstract void swim(int obstLength);

    public Animal(String name, int runSpeed, int swimSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

//        public void run(int obstLength) {
//        System.out.println(name + " has run  " + runSpeed);
//    }
//
//    public void swim(int obstLength) {
//        System.out.println(name + " has swum " + swimSpeed);
//    }



        }


