package racingcar;

import java.util.Scanner;

public class InputCarName {

    static Scanner scan = new Scanner(System.in);

    public static String[] inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        return scan.nextLine().split(",");
    }

    public static int inputCount() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 합니다.");
            return inputCount();
        }
    }
}
