package lotto;

public class Lotto {
	//횟수별 6개의 로또 번호 저장을 위한 2차원 배열 선언
	private int[][] lottos; // 5000원이면 x행 6열 발급
	private int money; // 로또샵에 주는 돈
	
	public void inputMoney(int money) {
		this.money = money;
		 //x행 6열 발급
	}

	public void extractNum() { //번호 생성
		lottos = new int [this.money/1000][6];
		int [] ranNum = new int[6];
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] = this.vote(); // i라는 공간에 6개의 랜덤 숫자를담음. 
		}

//		lottos[]
//		
		
		int count = 0; // 로또 횟수
		int i = 0; // 로또 횟수별 로또 번호 저장 위치
		
		
		
		
		for (count = 0; count<lottos.length; count++) {
			while (true) {
				
				// 추출된 랜덤 숫자를 담는다.
				// 중복 여부를 체크한다.
				// 중복 로직을 통과했다면 (=중복되지 않는 숫자라면)
				lottos[count][i] = 0; // 그 숫자를 담는다.
				i++;

				if (i == lottos[count].length) { // 입력된 돈의 값만큼 추출되었다면
					i = 0;
					break; // 종료한다.

				}
			}
		}

	}

	public String printLotto() {
		System.out.println("************부자되세요**************");
		for (int i = 0; i < lottos.length; i++) {
			this.sort(null);
			for (int j = 0; j < lottos.length; j++) {
				System.out.println(lottos[i][j]+"\n");
			}
		}
		String a ="";
		return a;
	}
	
	private int vote(){
		
		return (int) (Math.random()*45+1); // 랜덤숫자 발생 1부터 45까지
				
/*		int ranNum[] = new int[6]; // 배열인덱스는 상관없고 공간 갯수를 써준다.
		int result = 0;
		for (int j = 1; j <= ranNum.length; j++) {
			int i = (int) (Math.random()*45+1);
			if (ranNum[j-1] == i) {
				break;
			}
			else {
			ranNum[j] = i;
			}	
		}
		for (int j = 0; j < ranNum.length; j++) {
			result = ranNum[j];
		}
		
		return result; */
	}
	
	/**
	 * 앞에서 추출된 숫자가 뒤에서 다시 추출되는 것을 막기 위해서
	 * 숫자 중복 여부를 체크해야 함
	 * count => money/1000 개념으로 돈에 따른 로또 횟수(줄생성)
	 */
	private boolean isDupl(int count, int randomNum) { // 1~5 까지 줄에서 각 줄을 받아내서 중복된 숫자여부 체크.

		for (int i = 0; i < lottos[count].length; i++) {
			if (true) { // lottos[1][i] == randomNum
				return true; // 중복
			}
		}
		return false;
	}

	/**
	 * 카운트 별로 로또번호 오름차순 정렬 
	 */
	private void sort(int[] arr){
		
	}
}

