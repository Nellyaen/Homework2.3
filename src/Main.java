public class Main {
    public static void main(String[] args) {
        //задание 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var differenceWeight = boxer1Weight - boxer2Weight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        //задание 7
        //Вычитание из большего веса меньшего
        System.out.println("Разница между весами бойцов " + (boxer2Weight - boxer1Weight) + " кг");
        //остаток от деления
        System.out.println("Разница между весами бойцов " + (boxer2Weight % boxer1Weight) + " кг");


        //задание 8
        // 1
        var totalHours = 640;
        var workingHours = 8;
        System.out.println("Всего работников в компании " + totalHours / workingHours + " человек" );

        //2
        var quantityWokers = (totalHours / workingHours) + 94;
        System.out.println("Если в компании работает " + quantityWokers + " человек,то всего " + totalHours / quantityWokers + " часа работы может быть поделено между сотрудниками");



    }
}