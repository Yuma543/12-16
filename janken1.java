package poly.kansai.janken;

import java.util.Random;

public class janken1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int janken = 0;

		janken = getrand();//乱数を作るメソッド
		String result = "";
		setResult(janken);
		result = setResult(janken);
		showResult(result);
	}

	public static int getrand() {
		int janken = 0;
		Random rand = new Random();
		janken = rand.nextInt(3);
		return janken;
	}

	public static String setResult(int janken) {
		String result = "";
		if(janken == 0) {
			result = "グー";
		} else if (janken == 1) {
			result = "チョキ";
		} else if (janken == 2) {
			result = "パー";
		}
		return result;
	}
	public static void showResult(String result) {
		System.out.println(result);
		
					
		}

	}


