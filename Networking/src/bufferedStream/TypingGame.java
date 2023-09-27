package bufferedStream;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader
					(new FileReader("word.txt"));
			//전체 데이터 읽기
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) {
				word = data.split(" ");
			}
			
			Scanner sc = new Scanner(System.in);
			int n = 1; //문제 번호
			double start, end;
			System.out.println("타바 연습 게임 - 준비되면 [Enter] ");
			sc.nextLine();
			
			start = System.currentTimeMillis();
			while(n <= 10) {
				System.out.println("문제 " + n);
				int rnd = (int)(Math.random()*word.length);
				String question = word[rnd];
				System.out.println(question);  //문제 출제
				
				String answer = sc.nextLine();  //사용자 단어 입력
				if(answer.equals(question)) {
					System.out.println("통과!");
					n++;
				}else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();
			System.out.printf("게임 소요 시간: %.2f초", (double)(end-start)/1000);
			sc.close();		
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
