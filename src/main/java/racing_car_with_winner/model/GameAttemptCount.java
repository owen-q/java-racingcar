package racing_car_with_winner.model;


import racing_car_with_winner.exception.InvalidInputException;

public class GameAttemptCount {
    private final int value;

    public GameAttemptCount(final int value) {
        if (value < 0) {
            throw new InvalidInputException("시도할 회수가 유효하지 않습니다");
        }

        this.value = value;
    }
}
