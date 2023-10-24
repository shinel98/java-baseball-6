package baseball.Model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BaseballComparator {
    public final int ballCount;
    public final int strikeCount;

    public BaseballComparator(int[] computer, int[] user) {
        this.ballCount = checkBall(computer, user);
        this.strikeCount = checkStrike(computer, user);
    }

    private int checkStrike(int[] computer, int[] user) {
        int strikeCount = 0;
        for (int i = 0; i < GameConstant.MAX_NUM; i++) {
            if (user[i] == computer[i]) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    private int checkBall(int[] computer, int[] user) {
        int ballCount = 0;
        for (int i = 0; i < GameConstant.MAX_NUM; i++) {
            final int userNum = user[i];
            if (user[i] != computer[i] && IntStream.of(computer).anyMatch(number -> number == userNum)) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public boolean checkThreeStrike() {
        return strikeCount == GameConstant.MAX_NUM;
    }
}
