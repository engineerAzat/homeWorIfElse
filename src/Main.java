public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask 1\n");    // Первое задание
        int age = 17;            // Присвоение возраста
        if (age >= 18) {          // Условный оператор if выполняется в случае если возраст 18 или больше лет
            System.out.println("Доступ разрешон!");
        } else {                   // Условный оператор else выполняется в случае если возраст меньше 18 лет
            System.out.println("Доступ запрещен. Дождитесь пока вам не исполнится 18 лет!");
        }

        System.out.println("\nTask 2\n");    // Второе задание
        int temperatura = 7;          // Присвоение температуры
        if (temperatura <= 5) {       // Условный оператор if выполняется в случае если температура  равно или меньше 5 градусов
            System.out.println("На улице холодно, нужно надеть шапку!");  //Первый вариант
            System.out.println("На улице " + temperatura + " градуса(ов), нужно надеть шапку!");  //Второй вариант так как в условии задачи не понятно какой выбрать
        } else {                 // Условный оператор else выполняется в случае если температура выше 5 градусов
            System.out.println("Сегодня тепло, можно идти без шапки!");    //Первый вариант
            System.out.println("На улице " + temperatura + " градуса(ов), можно идти без шапки!");  //Второй вариант так как в условии задачи не понятно какой выбрать
        }

        System.out.println("\nTask 3\n");    // Третье задание
        int sped = 61;  // Присвоение скорости
        if (sped > 60) {  // Условный оператор if выполняется в случае если скорость больше 60
            System.out.println("Если скорость " + sped + " , то придется заплатить штраф!");
        } else {     // Условный оператор else выполняется в случае если скорость равна 60 или меньше
            System.out.println("Можно ездить спокойно!");
        }

        System.out.println("\nTask 4\n");    // Четвертое задание
        int ageMen = 55;  // Присвоение возраста   , Нет условия что делать если возраст меньше двух лет
        if (ageMen >= 2 && ageMen <= 6) {    // Условный оператор if выполняется в случае если возраст равен больше 2 и равен меньше 6
            System.out.println("Если возраст человека равен " + ageMen + " то ему нужно ходить в детский садик.");
        }
        if (ageMen >= 7 && ageMen <= 17) {    // Условный оператор if выполняется в случае если возраст равен больше 7 и равен меньше 17
            System.out.println("Если возраст человека равен " + ageMen + " то ему нужно ходить в школу.");
        }
        if (ageMen >= 18 && ageMen <= 24) {    // Условный оператор if выполняется в случае если возраст равен больше 18 и равен меньше 24
            System.out.println("Если возраст человека равен " + ageMen + " то ему нужно ходить в университет.");
        }
        else {        // Условный оператор else выполняется в случае если возраст меньше двух и больше 24
            System.out.println("Если возраст человека равен " + ageMen + " то ему нужно ходить на работу."); // ТОЖЕ выйдет если возраст меньше 2
        }

        System.out.println("\nTask 5\n");    // Пятое задание
        int ageChild = 35; // Присвоение возраста
        if (ageChild <= 5 ) {  // Условный оператор if выполняется в случае если возраст меньше 5
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild > 5 && ageChild <= 14) {  // Условный оператор if выполняется в случае если возраст больше 5 и меньше 14
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else {     // Условный оператор else выполняется в случае если возраст больше 14
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождении взрослого");
        }

        System.out.println("\nTask 6\n");    // Шестое задание
        int seatPlace = 59;  // Присвоение занятых сидящих мест
        int stedingPlace = 62;  // Присвоение занятых стоящих мест
        int totalSeatPlace = 60 - seatPlace; // Присвоение (расчет) свободных сидящих мест
        int totalStedingPlase = 62 - stedingPlace; // Присвоение (расчет) свободных стоящих мест
        if (seatPlace < 60 && stedingPlace < 62) {  // Условный оператор if выполняется в случае если есть сидящие и стоящие свододные места
            System.out.println("В вагоне есть " + totalSeatPlace + " сидящих мест и " + totalStedingPlase + " стоящих мест.");
        }
        if (seatPlace >= 60 && stedingPlace < 62) { // Условный оператор if выполняется в случае если есть только стоящие свододные места
            System.out.println("В вагоне нет сидящих мест, осталось толко " + totalStedingPlase + " стоящих мест.");
        }
        if (seatPlace < 60 && stedingPlace >= 62) { // Условный оператор if выполняется в случае если есть только сидящие свододные места
            System.out.println("В вагоне есть " + totalSeatPlace + " сидящих мест, стоящих мест нет");
        }
        else { // Условный оператор else выполняется в случае если вагон полностью забит
            System.out.println("Вагон полон. Мест нет");
        }

        System.out.println("\nTask 7\n");    // Седьмое задание
        int one = 41; // Присвоение числа первому значению
        int two = 41; // Присвоение числа второму значению
        int three = 41;  // Присвоение числа третьему значению
        if (one > two && one > three) { // Условный оператор if выполняется в случае если первая цифра больше второй и третьей
            System.out.println("Самая большая цифра " + one);
        }
        if (two > one && two > three) { // Условный оператор if выполняется в случае если вторая цифра больше первой и третьей
            System.out.println("Самая большая цифра " + two);
        }
        if (three > one && three > two) { // Условный оператор if выполняется в случае если третья цифра больше первой и второй
            System.out.println("Самая большая цифра " + three);
        }
        else {  // Условный оператор else выполняется в случае если все цифры равны
            System.out.println("Все цифры равны и имеют значение" + one);
        }






    }
}