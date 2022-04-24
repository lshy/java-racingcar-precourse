package racingcar;

public class ValidUtils {

    public static boolean isNumber(String input){
        return input.matches("[+-]?\\d*(\\.\\d+)?");
    }
}
