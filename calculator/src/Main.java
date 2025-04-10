import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        CalculatorOperations operations = new CalculatorOperations();

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
                        case 1 -> operations.setNumber_system(2);
                        case 2 -> operations.setNumber_system(8);
                        case 3 -> operations.setNumber_system(10);
                        case 4 -> operations.setNumber_system(16);
                        default -> System.out.println("неизвестная сист. счисления");
                    };
                    break;
                }
                case 2: {
                    operations.readAndApplyOper(sc, ch); //проводим сложение
                    break;
                }
                case 3: {
                    operations.readAndApplyOper(sc, ch); //проводим вычитание
                    break;
                }
                case 4:{
                    operations.readAndApplyOper(sc, ch); //проводим деление
                    break;}
                case 5: {
                    exit = true;
                    break;
                }
            }
        }
    }
}