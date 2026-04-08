import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lionsNumber;

        while (true) {
            System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");
            lionsNumber = scanner.nextInt();

            if (lionsNumber < 5) {
                System.out.println("❗ [오류] 5 이상 입력해주세요.");
                continue;
            }
            break;
        }

        scanner.nextLine(); // 숫자 입력 후 개행 제거
        String[] lions = new String[lionsNumber];

        System.out.println("✏️ 아기사자 이름을 입력해주세요.");

        for (int i = 0; i < lionsNumber; i++) {
            String name = scanner.nextLine();
            lions[i] = name;
        }

        System.out.println("\n📋 아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < lionsNumber; i++) {
            System.out.println("🦁 " + (i + 1) + ". " + lions[i]);
        }
    }
}
