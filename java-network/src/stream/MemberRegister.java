package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @file_name : MemberRegister.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 8.
 * @story : 회원 등록 프로그램
 */
public class MemberRegister {
	/**
	 * 신규 회원가입 프로그램입니다. 저장은 외부 바탕화면에 member 라는 폴더에 아이디.txt로 저장해주시고 만약, 아이디.txt 가
	 * 기존에 등록된 회원이라면 이미 등록된 회원입니다. 라고 띄워주세요. 존재하지 않다면 해당아이디.txt파일을 생성합니다.
	 * hong.txt 홍길동 인적정보파일 lee.txt 이순신 인적정보파일 해당 회원이 가입한 날짜시간까지 저장시켜주세요.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" === 회원가입 === ");
		System.out.println("ID를 입력하세요");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		String pass = scanner.next();
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		// 파일이 존재하는지 여부를 체크해서, 없으면 만들고
		// 있으면 스캐너가 입력받은 정보를 txt 파일에 기재한다.

		String list = "";
		BufferedWriter joinIn;
		BufferedReader joinInfor;
		String fileName = "C:\\Users\\HB\\Desktop\\member\\" + id + ".txt"; // 파일생성
		File file = new File(fileName);
		if (!file.exists()) { // 존재하지 않으면!
			Date today = new Date();
			SimpleDateFormat asd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
			try {
				joinIn = new BufferedWriter(new FileWriter(new File(fileName)));
				joinIn.write("아이디: " + id);
				joinIn.newLine();
				joinIn.write("비밀번호: " + pass);
				joinIn.newLine();
				joinIn.write("이름 :" + name);
				joinIn.newLine();
				joinIn.write(asd.format(today));
				joinIn.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일 이름 :" + file.getName());
			System.out.println("상대 경로 :" + file.getPath());
			System.out.println("절대 경로 :" + file.getAbsolutePath());
			System.out.println("쓰기 가능 :" + file.canWrite());
			System.out.println("읽기 가능 :" + file.canRead());
			System.out.println("파일 길이 :" + file.length() + "바이트");
			System.out.println("[해당 파일은 이와같이 이미 존재합니다]");
		}

		class Member implements Serializable {
			private static final long serialVersionUID = 1L; // 내부에 어떤값이 생김
			private String id, pass, name;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPass() {
				return pass;
			}

			public void setPass(String pass) {
				this.pass = pass;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}
}
