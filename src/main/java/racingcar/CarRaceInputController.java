package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class CarRaceInputController {

    public String carNamesInput(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        return Console.readLine();
    }

    public int carRaceRoundInput(){
        System.out.println("시도할 회수는 몇회인가요?");
        String gameRound = Console.readLine();
        validRaceRoundInput(gameRound);
        return Integer.valueOf(gameRound);
    }

    private void validRaceRoundInput(String gameRound) {

        if(!ValidUtils.isNumber(gameRound)) {
            throw new IllegalStateException("[ERROR] 숫자만 입력 가능합니다.");
        }
    }
}
