package racingcar;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String carNames = scanner.nextLine();
        String counts = scanner.nextLine();
        Game.gameRun(carNames, counts);
    }

}
