public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //"Home Work 09.01.2023");
    public static void task1() {
        System.out.println("Задача 1");
        int age = 21;
        System.out.println("Если возраст человека равен " + age + " то");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        //task2
        System.out.println("ЗАДАЧА №2");
        int temperature = 4;
        System.out.println("На улице " + temperature + " градусов");
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //task 3
        System.out.println("ЗАДАЧА №3");
        int speed = 55;
        System.out.println("«Если скорость " + speed + " то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task2() {
        System.out.println("Задача 4");
        int age = 25;
        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить");
        if (age >= 2 && age <= 6) {
            System.out.println(" в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println(" в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println(" в университет");
        }
        else if (age > 24) {
            System.out.println(" на работу");
        }
    }

    public static void task3() {
        System.out.println("Задача 5");
        int age = 14;
        System.out.println("Если возраст ребенка равен " + age + " то ему ");
        if (age < 5) {
            System.out.println(" нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении");
        }
        else if (age >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task4() {
        System.out.println("Задача 6");
        int capacity = 101;
        System.out.println("вы " + capacity + " пассажир осталось мест");
        if (capacity <= 60)
            System.out.println("есть сидячие места");
        if (capacity <= 102) {
            System.out.println("есть стоячие места");
        } else {
            System.out.println("нет мест");
        }
    }

    public static void task5() {
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        if (one >=three ||two>=three){
            System.out.println("То Меньше "+three+"");}
        else {
            System.out.println("То ,больше "+three+"");}
        }

        }























