package Chap01.Ex05;

import java.util.Scanner;

public class Main {
  public String solution(String str) {	  
//	  개념 포인트.
//	  좌우에서 헤더가 움직이고 그 헤더를 바탕으로 단어가 스왑되도록 하는것
//	  그 헤더가 서로의 영역을 넘어가는 순간 이걸 끊어줘서 바뀌는걸 막음
	  char[] charArr= str.toCharArray();
	  int lt = 0;
	  int rt = str.length()-1;
//	  System.out.println(rt);
//	  System.out.println(charArr[rt]);
	  while(lt<rt){
		  if(Character.isAlphabetic(charArr[lt])&&Character.isAlphabetic(charArr[rt])){
//			  System.out.println("현제 lt="+lt);
				 char a = ' ';
				 a=charArr[rt];
//				 System.out.println("짬통"+a);
				 charArr[rt] = charArr[lt];
//				 System.out.println("뒤쪽 배열"+charArr[rt]);
				 charArr[lt] = a;
//				 System.out.println("앞쪽 배열"+charArr[lt]);
				 lt = lt+1;
				 rt = rt-1;
			  } else if(!Character.isAlphabetic(charArr[lt])){
				  lt =lt+1;
			  } else if(!Character.isAlphabetic(charArr[rt])){
				  rt=rt-1;
			  }
//		  System.out.println(lt+"="+rt);
	  }
//	  System.out.println("while 종료");
	  return String.valueOf(charArr);
	  

  }
	public static void main(String[] args){
	Main t = new Main();
    Scanner in=new Scanner(System.in);
    String str1 = in.nextLine();
    System.out.println(t.solution(str1)); 
    }
  
}