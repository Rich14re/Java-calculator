import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Calculator calc = new CalculatorOperations();

        int num_system = 10;
        int num2;
        int num1;
        int answer = 0;

        while(!exit){
            System.out.println("Выберите действие... ");
            System.out.println("1. Изменить сис. счисления");
            System.out.println("2. Сложение");
            System.out.println("3. Вычитание");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch){
                case 1: {
                    System.out.println("Выберите систему счисления: \n1. bin\n 2. oct\n 3. dec \n 4. hex");
                    int numer_system = sc.nextInt();
                    sc.nextLine();

                    //меняем систму счисления
                    switch (numer_system){
                        case 1 -> num_system = 2;
                        case 2 -> num_system = 8;
                        case 3 -> num_system = 10;
                        case 4 -> num_system = 16;
                        default -> System.out.println("неизвестная сист. счисления");
                    };
                    break;
                }
                case 2: {
                    System.out.print("Введите первое число: ");
                    num1 = sc.nextInt();
                    System.out.print("Введите второе число: ");
                    num2 = sc.nextInt();
                    answer = calc.sum(num1, num2);
                    AnswConverter answ = new AnswConverter(answer);
                    answ.printAnswer();
                    break;
                }
                case 3: break;
                case 4: break;
                case 5: {
                    exit = true;
                    break;
                }
            }
        }
    }
}