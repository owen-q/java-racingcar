package racingcar.winner.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import racingcar.winner.view.CarNameInput;

class CarFactoryTest {

    @ParameterizedTest
    @CsvSource(value = {"1,2,3:3", "A,b:2"}, delimiter = ':')
    void build_차를만든다(String input, int expected) {
        Assertions.assertThat(new CarFactory(new CarNameInput(input).parse()).build()).hasSize(expected);
    }
}