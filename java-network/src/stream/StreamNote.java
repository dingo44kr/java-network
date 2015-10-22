package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @file_name  : StreamNote.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 8.
 * @story      : 스트림 문법
 */
public class StreamNote {
	/**
	 * 모든 스트림(데이터의 흐름: 강줄기, 수돗물) 2가지 종류가 있다.
	 * 1. 바이트 스트림(1byte 튜브의 지름이 작고, 작지만 빠르고)
	 * 2. 문자 스트림(2byte 튜브의 지름이 바이트 두배 크다, 적재량이 크다.)
	 * 
	 * 바이트 스트림은 InputStream => IS 로 끝나고
	 * 
	 * 기본형 타입(primitive) => P 타입  바쇼인롱, 폴더, 카
	 * 객체형 타입(reference) => R 타입
	 * DataIs(OS) : P 타입
	 * ObjectIS(OS) : R 타입
	 * BufferedIS(OS) : 바이트를 버퍼에 저장했다가 한꺼번에 입출력
	 * 문자 스트림은 Reader(Writer) => getter, setter 를 클래스화 한 형상.
	 */
	public static void main(String[] args) {
		String fileName = "C:\\Users\\HB\\Desktop\\test.txt", buffer="";
		BufferedWriter bw;
		BufferedReader br;
		try {
			bw = new BufferedWriter(new FileWriter(new File(fileName)));
			bw.write("안녕");
			bw.newLine();
			bw.write("반갑다 자바야..!");
			bw.newLine();
			bw.write("난 이성한이라고 해");
			bw.close(); // 항상 달아 주어야 저장이 됨.. 카톡에서 문자를 작성하고 엔터를 누르는 것과 동일
			
			br = new BufferedReader(new FileReader(new File(fileName)));
			while ((buffer = br.readLine()) != null) { // 읽어들인 내용 끝까지
				System.out.println(buffer);
			}
			br.close();// 밸브를 잠그는것과 같은 행동 (마찬가지로 꼭 닫아야 됨, 튜브 닫듯이)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
