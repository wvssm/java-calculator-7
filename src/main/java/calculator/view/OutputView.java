package calculator.view;

public class OutputView {
    private static final String RESULT = "결과 : ";

    public static void printResult(Number number){
        System.out.println(RESULT + number);
    }
}
