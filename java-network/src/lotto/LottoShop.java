package lotto;

import java.util.Scanner;

/**
 * @file_name  : SBS.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 7.
 * @story      : 로또 추첨(스윙)
 */
public class LottoShop {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner scanner = new Scanner(System.in);
		System.out.println("행운의 로또");
		System.out.println("얼마를 넣으시겠습니까?");
		lotto.inputMoney(scanner.nextInt());
		lotto.extractNum();
		System.out.println(lotto.printLotto());
		
	}
}
