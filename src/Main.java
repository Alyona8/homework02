public class Main {
    public static void main(String[] args) {
        //Задача 1
        int apple = 9;
        byte orange = 3;
        short pineapple = 5;
        long pear = 105L;
        float fruitWeight = 1.8f;
        double vegetableWeight = 5.1;
        char star = 42;
        boolean orangeEnough = orange < 8;

        //Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксёров " + weightOffAllBoxers + " кг");
        System.out.println("Разница в весе боксёров " + weightDifference + " кг");

        //Задача 3
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int bananasGr = bananas * 80;
        int milkGr = milk / 100 * 105;
        int iceCreamGr = iceCream *100;
        int eggsGr = eggs * 70;
        int breakfastWeight = bananasGr + milkGr + iceCreamGr + eggsGr;
        int grPerKg = 1000;
        float breakfastWeightKg = breakfastWeight / (float)grPerKg;
        System.out.println("Вес спорт-завтрака составляет " + breakfastWeight + " грамм");
        System.out.println("Вес спорт-завтрака в килограммах составляет " + breakfastWeightKg + " кг");

        //Задача 4
        byte needToLoseKg = 7;
        int needToLoseGr = needToLoseKg * 1000;
        int weightLose250 = needToLoseGr / 250;
        int weightLose500 = needToLoseGr / 500;
        int averageWeightLose = (weightLose250 + weightLose500) / 2;
        System.out.println("Если спортсмен будет терять в день 250 грамм, то на похудение на 7 кг у него уйдёт " + weightLose250 + " дней");
        System.out.println("Если спортсмен будет терять в день 500 грамм, то на похудение на 7 кг у него уйдёт " + weightLose500 + " дней");
        System.out.println("В среднем, чтобы похудеть на 7 кг, спортсмену понадобится " + averageWeightLose + " день");


        //Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double salaryIncrease = 0.1;
        double saInMasha = salaryMasha * salaryIncrease + salaryMasha;
        double saInDenis = salaryDenis * salaryIncrease + salaryDenis;
        double saInKristina = salaryKristina * salaryIncrease + salaryKristina;
        byte monthsYear = 12;
        double diffAnIncMasha = (saInMasha * monthsYear) - (salaryMasha * monthsYear);
        double diffAnIncDenis = (saInDenis * monthsYear) - (salaryDenis * monthsYear);
        double diffAnIncKristina = (saInKristina * monthsYear) - (salaryKristina * monthsYear);
        System.out.println("Маша теперь получает " + saInMasha + " рублей. Годовой доход вырос на " + diffAnIncMasha + " рублей.");
        System.out.println("Денис теперь получает " + saInDenis + " рублей. Годовой доход вырос на " + diffAnIncDenis + "рублей.");
        System.out.println("Кристина теперь получает " + saInKristina + " рубля. Годовой доход вырос на " + diffAnIncKristina + " рублей.");


    }
}