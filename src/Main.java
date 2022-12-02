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


    }
}