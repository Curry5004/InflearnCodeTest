package Chap01.Ex05;

import java.util.Scanner;

public class Main {
  public String solution(String str) {	  
	  
	  char[] charArr= str.toCharArray();
	  int lt = 0;
	  int rt = str.length()-1;
//	  System.out.println(rt);
//	  System.out.println(charArr[rt]);
	  while(rt!=0||lt!=str.length()-1){
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