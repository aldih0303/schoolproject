import java.io.*;
import java.util.Random;

class Jyangken{
 public static void main(String args[]){
  int iInput = 0;
  int iValue = 0;
  String s;

 //入力できるように準備
 BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
 //案内文言を表示
 System.out.println("1～3を入力￥n 1: 石 (=ぐう), 2: はさみ (=ちょき), 3: 紙 (=ばあ)");
 try{
 	s = new String(in.readLine());
 	iInput = Integer.parseInt(s);
 	if(1 == iInput){
 		System.out.println("あなた 1: 石 (=ぐう) です。");
 	}
 	else if(2 == iInput){
 		System.out.println("あなた 2: はさみ (=ちょき) です。");
 	}
 	else{
 		System.out.println("あなた 3: 紙 (=ばあ) です。");
    }
 	Random rnd = new Random();
 	iValue = rnd.nextInt (3) + 1;
 	if(1 == iValue){
 		System.out.println("コンピューターは 1: 石 (=ぐう) です。");
 	}
 	else if(2 == iValue){
 		System.out.println("コンピューターは 2: はさみ (=ちょき) です。");
 	}
 	else{
 		System.out.println("コンピューターは 3: 紙 (=ばあ) です。");
 	}
 	if(iInput == iValue){
 		System.out.println("結果:引き分け(Draw)です。");
 	}
 	else if(3 > iInput){
 	if(3 == iValue){
 		System.out.println("結果:負け(You Lose)です。");
 	}
 	else{
 		System.out.println("結果:勝ち(You Win)です。");
 	}
 }
 	else{
 		System.out.println("結果:勝ち(You Win)です。");
 	}
 }
 catch(Exception ex){
 //例外の場合
 	System.out.println("数字1～3!!!!!!");
 }
}
}
