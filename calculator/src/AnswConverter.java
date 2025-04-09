public class AnswConverter {
    int value;

    public AnswConverter(int value) {
        this.value = value;
    }

    public String toBinary() {
        return Integer.toBinaryString(value);
    }

    public String toOctal() {
        return Integer.toOctalString(value);
    }

    public String toHex() {
        return Integer.toHexString(value);
    }

    public String toDecimal() {
        return Integer.toString(value);
    }

    public void printAnswer() {
        System.out.println("Результат операции:");
        System.out.println("  Двоичная     (bin): " + toBinary());
        System.out.println("  Восьмеричная (oct): " + toOctal());
        System.out.println("  Десятичная   (dec): " + toDecimal());
        System.out.println("  Шестнадцат.  (hex): " + toHex());
    }
}
