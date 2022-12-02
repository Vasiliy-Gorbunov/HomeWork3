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
        float weightInKg = weightSumm/1000f;
        System.out.println("\nВес спорт-завтрака "+weightInKg+" кг");


    }
}