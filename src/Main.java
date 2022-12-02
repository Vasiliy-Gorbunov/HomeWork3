public class Main {
    public static void main(String[] args) {
        int one = 1;
        byte two = 2;
        short three = 3;
        long four = 4;
        float five = 5f;
        double six = 6;
        System.out.println("Значение переменной one с типом int равно "+one);
        System.out.println("Значение переменной two с типом byte равно "+two);
        System.out.println("Значение переменной three с типом short равно "+three);
        System.out.println("Значение переменной four с типом long равно "+four);
        System.out.println("Значение переменной five с типом float равно "+five);
        System.out.println("Значение переменной six с типом double равно "+six);

        float first = 27.12f;
        long second = 987678965549L;
        double third = 2.786;
        boolean fourth = false;
        char fifth = 569;
        short sixth = -159;
        int seventh = 27897;
        byte eighth = 67;

        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short summPaper = 480;
        int summPupils = LudmilaPavlovna+AnnaSergeevna+EkaterinaAndreevna;
        int paperPerPupil = summPaper/summPupils;
        System.out.println("\nНа каждого ученика рассчитано "+paperPerPupil+" листов бумаги");

        byte effPer2Min = 16;
        int effPer20Min = effPer2Min*10;
        int effPerHour = effPer20Min*3;
        int effPerDay = effPerHour*24;
        int effPer3Days = effPerDay*3;
        int effPerMonth = effPerDay*30;
        System.out.println("\nЗа 20 минут работы машина произвела бутылок "+effPer20Min+" шт");
        System.out.println("За сутки работы машина произвела бутылок "+effPerDay+" шт");
        System.out.println("За 3 дня работы машина произвела бутылок "+effPer3Days+" шт");
        System.out.println("За месяц работы машина произвела бутылок "+effPerMonth+" шт");

        byte summPaint = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int paintPerClass = whitePerClass+brownPerClass;
        int classesInSchool = summPaint/paintPerClass;
        int whitePaint = classesInSchool*whitePerClass;
        int brownPaint = classesInSchool*brownPerClass;
        System.out.println("\nВ школе, где "+classesInSchool+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");

        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightPlombir = 100;
        byte weightEgg = 70;
        int weightSumm = weightBanana*5+weightMilk*2+weightPlombir*2+weightEgg*4;
        int grPerKg = 1000;
        float weightInKg = weightSumm/(float)grPerKg;
        System.out.println("\nВес спорт-завтрака "+weightInKg+" кг");

        short summLoseKg = 7;
        int summLoseGr = summLoseKg*grPerKg;
        int if250PerDay = summLoseGr/250;
        int if500PerDay = summLoseGr/500;
        float middleLose = summLoseGr/(float)((250+500)/2);
        System.out.println("\nНужно сбросить "+summLoseKg+" кг");
        System.out.println("Если сбрасывать по 250 грамм в день, уйдёт "+if250PerDay+" дней");
        System.out.println("Если сбрасывать по 500 грамм в день, уйдёт "+if500PerDay+" дней");
        System.out.println("В среднем, должно уйти "+middleLose+" дней");

        float increaseZp = 1.1f;
        byte monthPerYear = 12;
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        float zpMashaIncr = zpMasha*increaseZp;
        float zpDenisIncr = zpDenis*increaseZp;
        float zpKristinaIncr = zpKristina*increaseZp;
        float deltaMashaPerYear = zpMashaIncr*monthPerYear-(zpMasha*monthPerYear);
        float deltaDenisPerYear = zpDenisIncr*monthPerYear-(zpDenis*monthPerYear);
        float deltaKristinaPerYear = zpKristinaIncr*monthPerYear-(zpKristina*monthPerYear);
        System.out.println("\nМаша теперь получает "+zpMashaIncr+" рублей. Годовой доход вырос на "+deltaMashaPerYear+" рублей");
        System.out.println("Маша теперь получает "+zpDenisIncr+" рублей. Годовой доход вырос на "+deltaDenisPerYear+" рублей");
        System.out.println("Маша теперь получает "+zpKristinaIncr+" рублей. Годовой доход вырос на "+deltaKristinaPerYear+" рублей");
    }
}