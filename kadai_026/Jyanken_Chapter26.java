package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょ");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
				scanner.close();
				return input;
			} else {
				System.out.println("rかsかpを入力してください");
			}
		}
	}

	public String getRandom() {
		String[] opponent = { "r", "s", "p" };

		int opponentJyanken = (int) Math.floor(Math.random() * opponent.length);
		return opponent[opponentJyanken];
	}

	public void playGame(String me, String you) {
		HashMap<String, String> choice = new HashMap<String, String>();

		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");

		System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you));

		if (me.equals(you)) {
			System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
				|| (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
