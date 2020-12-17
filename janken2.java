package poly.kansai.janken;

import java.util.Random;
import java.util.Scanner;

public class janken2 {

	public static void main(String[] args) {

		 System.out.println("じゃんけんの手を入力してください。");
		String[] userJanken  = {"グー", "チョキ", "パー"};
		 userJanken[0]="グー";
		 userJanken[1]="チョキ";
		 userJanken[2]="パー";
		int jankenUser = UserjankenResult();
		int jankenCp = cpGetRand();//CPのランダム



		System.out.println("USER:" + userJanken[jankenUser]);//userJanken[2]
		System.out.println("CPU:" +  userJanken[jankenCp]);

		resultJK(jankenUser,jankenCp);
		//resultJk(jankenUser , jankenCp);
	}


	public static int cpGetRand() {
		int jankenCp = 0;
		Random rand = new Random();
		jankenCp = rand.nextInt(3);

	return jankenCp;
	}

	public static int UserjankenResult() {

		Scanner scan = new Scanner(System.in);

		System.out.println("0=グー ,1=チョキ, 2=パーを入力してください");

		int jankenUser = -1;
        do {
            System.out.print("[0:グー, 1:チョキ, 2:パー]? ");
            if (scan.hasNextInt()) {
            	jankenUser = scan.nextInt();
            } else {
            	scan.next();
            }
        } while (jankenUser < 0 || 2 < jankenUser);
        scan.close(); // クローズ処理（標準入力では省略可）

        return jankenUser;

	}
		public static void resultJK(int jankenUser, int jankenCp) {
			int sub = jankenUser - jankenCp; // 判定用の計算
	        if (sub == 0) {
	            System.out.println("<<<引き分け>>>");
	        } else if (sub == -1 || sub == 2) {
	            System.out.println("<<<勝利>>>\n");
	        } else if (sub == -2 || sub == 1) {
	            System.out.println("<<<敗北>>>\n");
	        } else {
	            System.out.println("---判定失敗---\n");


		}
















	}

}
