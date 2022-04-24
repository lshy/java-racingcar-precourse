package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarResults {

    private static final int END_GAME = 0;
    private final List<CarResult> carResults;
    private int gameRound;

    public CarResults(int count, int gameRound){
        this.carResults = makeCarResults(count);
        this.gameRound = gameRound;
    }

    public List<CarResult> getCarResults() {
        return carResults;
    }

    private static List<CarResult> makeCarResults(int count){
        List<CarResult> carResultList = new ArrayList<>();
        for (int i=0; i<count; ++i){
            carResultList.add(new CarResult());
        }

        return carResultList;
    }

    public boolean isGameEnd(){
        return gameRound == END_GAME;
    }

    public void playMove(List<CarStatus> moveCommandList) {

        for(int i=0; i<moveCommandList.size(); ++i){
            CarStatus status = moveCommandList.get(i);
            carResults.get(i).move(status);
        }

        reduceGameRound();
    }

    private void reduceGameRound() {
        gameRound -= 1;
    }

    public CarResult getIndexOfResult(int index){
        return carResults.get(index);
    }

    public List<Boolean> getWinnerIndex() {
        List<Boolean> winnerist = new ArrayList<>();

        int maxMove = getMaxMove();
        for(CarResult carResult : carResults){
            winnerist.add(carResult.isWinner(maxMove));
        }

        return winnerist;
    }

    private int getMaxMove() {

        int max = 0;
        for(CarResult carResult : carResults){
            max = Math.max(max, carResult.getLocation());
        }

        return max;
    }
}
