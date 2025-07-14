import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int[] expenses1 = {60000, 50000, 55000, 65000, 60000};
        int expenseMonth1 = 0;
        for (int element : expenses1) {
            expenseMonth1 += element;
        }
        System.out.println("Сумма трат за месяц составила " + expenseMonth1 + " рублей.");;
        System.out.println("");

        System.out.println("Задача 2");
        int[] expenses2 = {60000, 50000, 55000, 65000, 60000};
        int expenseWeekMin = 0;
        int expenseWeekMax = 0;

        for (int element : expenses1) {
            if (element > expenseWeekMin);
            expenseWeekMin = element;
            if (element > expenseWeekMax);
                expenseWeekMax = element;
        }
        System.out.println("Минимальная сумма трат за месяц составила " + expenseWeekMin + " рублей. " +
                    "Максимальная сумма трат за неделю составила " + expenseWeekMax + " рублей.");
        System.out.println("");

        System.out.println("Задача 3");
        int[] expenses3 = {60000, 50000, 55000, 65000, 60000};
        int expenseMonth3 = 0;

        for (int element : expenses3) {
            expenseMonth3 += element;
        }
        float expenseAverage = expenseMonth3 / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + expenseAverage + " рублей.");
        System.out.println("");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (char element : reverseFullName) {
            System.out.print(element);
        }
    }
}