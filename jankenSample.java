package poly.kansai.janken;
import java.util.Random;
import java.util.Scanner;
public class jankenSample {

	static final String[] HAND = { "グー", "チョキ", "パー" };
	public static void main(String[] args) {



	        // コンピュータの手をランダムに取得
	        int comp = getHandAtRandom(); // コンピュータの手

	        // ユーザーの手を、標準入力から入手
	        System.out.println("じゃんけんの手を入力してください。");
	        int user = getHandBySystemIn(); // ユーザーの手

	        // 表示
	        System.out.println("コンピュータ: " + HAND[comp]);
	        System.out.println("ユーザー: " + HAND[user]);

	        // 判定
	        judge(comp, user);

	    }

	    // ランダムな手（0～2）を返す。
	    private static int getHandAtRandom() {
	        Random r = new Random();
	        int hand = r.nextInt(3);
	        return hand;
	    }

	    // 標準入力で手（0～2）を取得し返す。
	    private static int getHandBySystemIn() {
	        Scanner stdin = new Scanner(System.in);
	        int hand = -1;
	        do {
	        	System.out.print("[0:グー, 1:チョキ, 2:パー]? ");
	            if (stdin.hasNextInt()) {
	            	hand = stdin.nextInt();
	            } else {

	                stdin.nextLine();
	            }
	        } while (hand < 0 || 2 < hand);
	        stdin.close(); // クローズ処理（標準入力では省略可）

	        return hand;
	    }

	    // コンピュータとユーザーの手（0～2）をそれぞれ引数で渡し、
	    // 判定結果を表示する。
	    private static void judge(int comp, int user) {
	        int sub = comp - user; // 判定用の計算
	        if (sub == 0) {
	            System.out.println("<<<引き分け>>>");
	        } else if (sub == 1 || sub == -2) {
	            System.out.println("<<<勝利>>>\n");
	        } else if (sub == -1 || sub == 2) {
	            System.out.println("<<<敗北>>>\n");
	        } else {
	            System.out.println("---判定失敗---\n");
	        }
	    }
	}