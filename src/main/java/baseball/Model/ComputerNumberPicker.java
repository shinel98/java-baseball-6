package baseball.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.stream.Stream;

public class ComputerNumberPicker {
    public final int[] computer;
    public ComputerNumberPicker() {
        int[] computer = Stream.generate(() -> Randoms.pickNumberInRange(1, 9))
                .distinct()
                .limit(3)
                .mapToInt(Integer::intValue)
                .toArray();
        this.computer = computer;
    };
}