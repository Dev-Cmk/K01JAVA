

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class {

	public static void main(String[] args) throws IOException{
		// text 파일 읽어보자.
		// 이스케이프 문자 역슬래쉬 (\)
		// 그냥 쓰면 에러가나는데 try ~ catch 문으로 처리해서 오류쪽 부분
		// 명시해주어야 에러가 사라짐.
		try {
		File text = new File("C:\\Users\\kosmo321\\Desktop\\testtxt.txt"); 
		FileReader textRead = new FileReader(text);
		BufferedReader bfReader = new BufferedReader(textRead);
		String line = "";
		List<String> lineArray = new ArrayList<String>();
		// null 이 아닐때까지 반복한다.
		while ( (line = bfReader.readLine()) != null ) {
		// System.out.println(line); 출력
		// 리스트 배열에 line 한줄한줄씩 추가.
		lineArray.add(line);
		}
		String numRead[] = new String[23];
		for(int i=0; i<lineArray.size(); i++) {
		System.out.println(lineArray.get(i));
		numRead[i]=lineArray.get(i).replaceAll("[^0-9]", "");
		}
		/////////////////////// 개행기준출력
		
		int num2Read[] = new int[23];
		for(int i=0; i<lineArray.size(); i++) {
			num2Read[i] = Integer.parseInt(numRead[i]);
		}
		System.out.println();
		int sum=0;
		for(int i=0; i<lineArray.size(); i++) {
			sum+=num2Read[i];
			System.out.print(num2Read[i]+" ");
			}
			System.out.println();
			System.out.println(sum);
		////////////////////////// 배열에 저장된 숫자, 숫자의 합 출력
			String num3Read[] = new String[23];
			for(int i=0; i<lineArray.size(); i++) {
				num3Read[i]=lineArray.get(i).replaceAll("[^a-zA-Z]", "");
				}
			for(int i=0; i<lineArray.size(); i++) {
				System.out.print(num3Read[i]+" ");
				}
		////////////////////////////// 리스트원소에 있는 문자열을 배열원소에 저장후 출력
			char num4Read[] = new char[23];
			for(int i=0; i<lineArray.size(); i++) {
				num4Read[i]=num3Read[i].charAt(0);
				}
			for(int i=0; i<lineArray.size(); i++) {
				System.out.print(num4Read[i]+" ");
				}
			////////////////////////////////
		} catch (FileNotFoundException e) {
		// 파일 없거나 이름 안맞으면 여기걸림.
		e.printStackTrace();
		System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
		} catch (IOException e) {
		e.printStackTrace();
		}
		
//		File text = new File("C:\\Users\\Kosmo_06\\Desktop\\testtxt.txt"); 
//		FileReader textRead = new FileReader(text);
//		BufferedReader bfReader = new BufferedReader(textRead);
//		int numRead[] = new int[23];
//		for(int i=0 ; i<24 ; i++) {
//			numRead[i] = Integer.parseInt(bfReader.readLine());
//			System.out.printf("%d",numRead[i]);
//		}	
		
		}//end of main
	}//end of class
