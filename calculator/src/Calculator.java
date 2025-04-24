import java.util.Scanner;

public abstract class Calculator {
    private int number_system = 10;
    private int num_one;
    private int num_two;

    //region геттеры и сеттеры для приватных полей
    public int getNumber_system(){
        return number_system;
    }
    public void setNumber_system(int number_system){
        this.number_system = number_system;
    }

    public int getNum_one() {
        return num_one;
    }
    public void setNum_one(int num_one) {
        this.num_one = num_one;
    }

    public int getNum_two() {
        return num_two;
    }
    public void setNum_two(int num_two) {
        this.num_two = num_two;
    }
    //endregion


    public abstract int sum(int a, int b);
    public abstract int sub(int a, int b);
    public abstract int min(int a, int b);
    public abstract int div(int a, int b);

    public void readAndApplyOper(Scanner sc, int operation) {
        int a = readNumberWithBase(sc, "введите первое число: ");
        int b = readNumberWithBase(sc, "введите второе число: ");

        int res = switch (operation){
            case 2 -> sum(a, b);
            case 3 -> min(a, b);
            case 4 -> div(a, b);
            case 5 -> sub(a, b);
            default -> throw new IllegalArgumentException("неизвестная операция");
        };
        AnswConverter answ = new AnswConverter(res);
        answ.printAnswer();
    }

    public int readNumberWithBase(Scanner sc, String message) {
        System.out.print(message);
        String input = sc.nextLine();

        try {
            return Integer.parseInt(input, number_system);
        } catch (NumberFormatException e) {
            System.out.println("ошибка: введено число, выходящее за пределы системы счисления " + number_system);
            System.out.println("установлена система счисления: десятичная");
            number_system = 10;
            return Integer.parseInt(input, number_system);
        }
    }
}
