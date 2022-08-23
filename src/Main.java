public class Main {
    public static void main(String[] args) {

        //Задание 1
        int apple = 3;
        byte pear = 4;
        short banana = 5;
        long berry = 10L;
        double sugarWeight = 2.1;
        float chilliWeight = 1.7f;
        boolean bananaIsAdult = banana > 3;
        char bar = 37;
        System.out.println(bananaIsAdult);


        //Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Обший вес боксеров " + weightAllBoxers + " кг.");
        System.out.println("Разница в весе между боксерами " + weightDifference + " кг.");


        //Задание 3
        int BananaWeight = 80 * 5;
        int MilkWeight = 105 * 2;
        int IceCreamSundaeWeight = 100 * 2;
        int RawEggsWeight = 70 * 4;
        double WeightAllProducts = BananaWeight + MilkWeight + IceCreamSundaeWeight + RawEggsWeight;
        System.out.println("Обший вес продуктов для спорт-завтрака " + WeightAllProducts + " г" + " или " + WeightAllProducts/1_000 + " кг.");


        //Задача 4
        double sportsmanWight = 7 * 1_000;
        double NumberOfDays1 = sportsmanWight / 250;
        double NumberOfDays2 = sportsmanWight / 500;
        System.out.println("Чтобы похудеть спортсмену потребуется " + NumberOfDays1 + " дней, " +
                "если он будет терять ежедневно по 250 грамм и " + NumberOfDays2 + ", если - по 500 грамм. "
                + sportsmanWight / ((250 + 500) / 2) + " дней в среднем может потребоваться, чтобы добиться результата похудения.");


        //Задача 5
        int зарплатаМаша = 67760;
        int зарплатаДенис = 83690;
        int зарплатаКристина = 76230;
        System.out.println("Зарплата Маши после индексации составляет " + зарплатаМаша * 1.10 + " рублей, зарплата Дениса - "
                + зарплатаДенис * 1.10 + " рублей, зарплата Кристины - " + зарплатаКристина * 1.10 + " рублей. " +
                "Годовой доход каждого сотрудника вырос на " + ((зарплатаМаша * 1.10 * 12) - (зарплатаМаша * 12)) + ", "
        + ((зарплатаДенис * 1.10 * 12) - (зарплатаДенис * 12)) + " и " + ((зарплатаКристина * 1.10 * 12) - (зарплатаКристина * 12)) + " соответственно.");

    }
}




