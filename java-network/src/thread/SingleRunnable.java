package thread;

public class SingleRunnable implements Runnable{

	private int [] temp;
	public SingleRunnable() {
		temp = new int[3];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run(){
		for (int start : temp) {
			try {
				Thread.sleep(2000); // 1/1000초만큼 쉬어라, 여기서는 2초
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s," , Thread.currentThread().getName());
			//printf 는 prinln과 다르다. %s 문자열, %d 10진수가 그 자리에 와야 함을 뜻함)
			System.out.printf("임시값 :%d %n",start);
		}
	}

}
