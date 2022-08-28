public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задача 6");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        var differnceBoxer = twoBoxer - oneBoxer;
        System.out.println("Разница между весами боксеров методом вычитания " + differnceBoxer + " кг.");
        var differnceBoxerTwo = twoBoxer % oneBoxer;
        System.out.println("Разница между весами боксеров методом остатка от деления " + differnceBoxerTwo + " кг.");

        var allTimeWork = 640;
        var timeWork = 8;
        var manCompany = allTimeWork / timeWork;
        System.out.println("Всего работников в компании " + manCompany + " человек");
        var manCompany1 = manCompany + 94;
        var timeWorkMan = manCompany1 * timeWork;
        System.out.println("Если в компании работает " +  manCompany1 + " человек, то всего " + timeWorkMan + " часов работы может быть поделено между сотрудниками");
    }
}