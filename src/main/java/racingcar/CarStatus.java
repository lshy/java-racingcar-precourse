package racingcar;

public enum CarStatus {
    FOWARD, BACKWORD;

    public boolean isFoward(){
        return this == FOWARD;
    }

    public boolean isBACKWORD(){
        return this == BACKWORD;
    }
}
