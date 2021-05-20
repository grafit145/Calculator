package Calculator;

public class Main {
    public static void main(String[] args) {


        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // при равенстве аргументов, b принимает значение "0"
        int c = calc.devide.apply(a, b); // При делении на "0" выбрасывает исключение

        calc.println.accept(c);
    }
}
