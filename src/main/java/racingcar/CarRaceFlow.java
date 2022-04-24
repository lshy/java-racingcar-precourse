package racingcar;

import java.util.List;

public class CarRaceFlow {

    private CarRaceInputController carRaceInputController;
    private CarRaceOutputController carRaceOutputController;
    private CarStatusGenerator carStatusGenerator;
    private CarResults carResults;
    private Cars cars;

    public CarRaceFlow(){
        carRaceInputController = new CarRaceInputController();
        carRaceOutputController = new CarRaceOutputController();
        carStatusGenerator = new CarStatusGenerator();
    }

    public void excuteCarRace(){

        initGameData();
        simulateRacingGame();
        showGameResult();

    }

    private void showGameResult() {

        List<Boolean> winnerIndexList = carResults.getWinnerIndex();
        List<String> winnerNameList = cars.getWinnerName(winnerIndexList);
        carRaceOutputController.printWinner(winnerNameList);
    }

    private void initGameData(){

        try {

            cars = new Cars(carRaceInputController.carNamesInput());
            carResults = new CarResults(cars.getCarCount(), carRaceInputController.carRaceRoundInput());

        }catch (IllegalArgumentException e){
            carRaceOutputController.printException(e);
            cars = new Cars(carRaceInputController.carNamesInput());
        }catch (IllegalStateException e){
            carRaceOutputController.printException(e);
            carResults = new CarResults(cars.getCarCount(), carRaceInputController.carRaceRoundInput());
        }

    }

    private void simulateRacingGame(){
        carRaceOutputController.printRoundResultTitle();
        while(!carResults.isGameEnd()){
            List<CarStatus> carStatusList = carStatusGenerator.generateRandomStatus(cars.getCarCount());
            carResults.playMove(carStatusList);
            carRaceOutputController.printRoundResult(cars, carResults);
        }
    }

}
