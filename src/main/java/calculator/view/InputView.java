package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_STRING = "덧셈할 문자열을 입력해 주세요.";

    public static  String getInput(){
        System.out.println(INPUT_STRING);

        return Console.readLine();
    }
}
