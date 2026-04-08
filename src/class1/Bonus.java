package class1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int lionsNumber;

            while (true) {
                System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");

                try {
                    lionsNumber = scanner.nextInt();

                    if (lionsNumber < 5) {
                        System.out.println("[오류] 5 이상의 숫자를 입력해주세요.");
                        continue;
                    }

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("[오류] 숫자만 입력할 수 있습니다.");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();

            String[] lions = new String[lionsNumber];

            System.out.println("아기사자 이름을 입력해주세요.");

            for (int i = 0; i < lionsNumber; i++) {
                String name = scanner.nextLine();

                if (name.trim().isEmpty()) {
                    System.out.println("이름이 비어있습니다. 다시 입력해주세요.");
                    i--;
                    continue;
                }

                boolean isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (lions[j].equals(name)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("이미 등록된 이름입니다. 다시 입력해주세요.");
                    i--;
                    continue;
                }
                lions[i] = name;
            }

            System.out.println("\n📋 아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < lionsNumber; i++) {
                System.out.println((i + 1) + ". " + lions[i]);
            }

            while (true) {
                System.out.println("""
            ===================
            프로그램을 종료하려면 'exit'를 입력하세요.
            계속 아기사자를 등록하려면 'restart'를 입력하세요.
            """);

                String command = scanner.nextLine();

                switch (command) {
                    case "exit":
                        System.out.println("아기사자 명단 관리 프로그램을 종료합니다.");
                        return;

                    case "restart":
                        System.out.println("""
                                초기 화면으로 돌아갑니다.
                                ===================
                                """);
                        break;

                    default:
                        System.out.println("알 수 없는 명령입니다. 다시 입력해주세요.");
                        continue;
                }
                break;
            }
        }
    }
}