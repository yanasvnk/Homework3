public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        byte q = -10;
        System.out.println("Значение переменной q с типом byte равно " + q);
        short w = 30000;
        System.out.println("Значение переменной w с типом short равно " + w);
        int e = 500000000;
        System.out.println("Значение переменной e с типом int равно " + e);
        long r = -400000000000000000L;
        System.out.println("Значение переменной r с типом long равно " + r);
        float t = 3.567898f;
        System.out.println("Значение переменной t с типом float равно " + t);
        double y = 7.98546800744333345667;
        System.out.println("Значение переменной y с типом double равно " + y);

        //Задача 2
        float u = 27.12f;
        System.out.println(u);
        long i = 987678965549L;
        System.out.println(i);
        float o = 2.786f;
        System.out.println(o);
        boolean p = false;
        System.out.println(p);
        short a = 569;
        System.out.println(a);
        short s = -159;
        System.out.println(s);
        short d = 27897;
        System.out.println(d);
        byte f = 67;
        System.out.println(f);

        //Задача 3
        byte class1 = 23;
        System.out.println(class1);
        byte class2 = 27;
        System.out.println(class2);
        byte class3 = 30;
        System.out.println(class3);
        short sheetNumber = 480;
        System.out.println(sheetNumber);
        int allStudents = class1 + class2 + class3;
        System.out.println(allStudents);
        int sheetsPerStudent = sheetNumber / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задача 4
        byte bottles = 16;
        System.out.println(bottles);
        byte time = 2;
        System.out.println(time);
        int bottlesPer1Minute = bottles / time;
        System.out.println(bottlesPer1Minute);
        byte time1 = 20;
        System.out.println(time1);
        int bottles1 = bottlesPer1Minute * time1;
        System.out.println(bottles1);
        short time2 = 60 * 24;
        System.out.println(time2);
        int bottles2 = bottlesPer1Minute * time2;
        System.out.println(bottles2);
        int time3 = time2 * 3;
        System.out.println(time3);
        int bottles3 = time3 * bottlesPer1Minute;
        System.out.println(bottles3);
        int time4 = time2 * 30;
        System.out.println(time4);
        int bottles4 = time4 * bottlesPer1Minute;
        System.out.println(bottles4);

        //Задача 5
        byte allPaintCans = 120;
        System.out.println(allPaintCans);
        byte whitePaint = 2;
        System.out.println(whitePaint);
        byte brownPaint = 4;
        System.out.println(brownPaint);
        byte allClasses = 120 / (4 + 2);
        System.out.println(allClasses);
        int whitePaintTotal = 120 - 4 * allClasses;
        System.out.println(whitePaintTotal);
        int brownPaintTotal = 120 - 2 * allClasses;
        System.out.println(brownPaintTotal);
        System.out.println("В школе, гдe " + allClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

        //Задача 6
        byte totalBananas = 5;
        System.out.println(totalBananas);
        byte bananaWeight = 80;
        System.out.println(bananaWeight);
        short totalMilk = 200;
        System.out.println(totalMilk);
        byte milkWeight = 105;
        System.out.println(milkWeight);
        byte totalIceCream = 2;
        System.out.println(totalIceCream);
        byte iceCreamWeight = 100;
        System.out.println(iceCreamWeight);
        byte totalEggs = 4;
        System.out.println(totalEggs);
        byte eggWeight = 70;
        System.out.println(eggWeight);
        short totalWeight = 5*80 + 2*105 + 2*100 + 4*70;
        System.out.println(totalWeight);
        int totalWeightKg = totalWeight / 1000;
        System.out.println(totalWeightKg);

        //Задача 7
        short toLoseGrams = 7*1000;
        System.out.println(toLoseGrams);
        int days1 = toLoseGrams / 250;
        System.out.println(days1);
        int days2 = toLoseGrams / 500;
        System.out.println(days2);
        int average = (days1+days2) / 2;
        System.out.println(average);

        //Задача 8
        int salaryMasha = 67760;
        System.out.println(salaryMasha);
        int salaryDenis = 83690;
        System.out.println(salaryDenis);
        int salaryKristina = 76230;
        System.out.println(salaryKristina);
        int higherSalaryMasha = salaryMasha + salaryMasha*10/100;
        System.out.println(higherSalaryMasha);
        int higherSalaryDenis = salaryDenis + salaryDenis*10/100;
        System.out.println(higherSalaryDenis);
        int higherSalaryKristina = salaryKristina + salaryKristina*10/100;
        System.out.println(higherSalaryKristina);
        int yearMasha = salaryMasha*12;
        System.out.println(yearMasha);
        int yearDenis = salaryDenis*12;
        System.out.println(yearDenis);
        int yearKristina = salaryKristina*12;
        System.out.println(yearKristina);
        int yearMashaNew = higherSalaryMasha*12;
        System.out.println(yearMashaNew);
        int yearDenisNew = higherSalaryDenis*12;
        System.out.println(yearDenisNew);
        int yearKristinaNew = 12 * higherSalaryKristina;
        System.out.println(yearKristinaNew);
        float differenceYearMasha = yearMashaNew % yearMasha;
        System.out.println(differenceYearMasha);
        float differenceYearDenis = yearDenisNew % yearDenis;
        System.out.println(differenceYearDenis);
        float differenceYearKristina = yearKristinaNew % yearKristina;
        System.out.println(differenceYearKristina);
        System.out.println("Маша теперь получает " + higherSalaryMasha + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей");
        System.out.println("Денис теперь получает " + higherSalaryDenis + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + higherSalaryKristina + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей");













    }
}