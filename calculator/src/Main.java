import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

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
                    break;
                }
                case 2: break;
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