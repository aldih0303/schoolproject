import java.io.*;
import java.util.Random;

class Jyangken{
 public static void main(String args[]){
  int iInput = 0;
  int iValue = 0;
  String s;

 //���͂ł���悤�ɏ���
 BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
 //�ē�������\��
 System.out.println("1�`3����́�n 1: �� (=����), 2: �͂��� (=���傫), 3: �� (=�΂�)");
 try{
 	s = new String(in.readLine());
 	iInput = Integer.parseInt(s);
 	if(1 == iInput){
 		System.out.println("���Ȃ� 1: �� (=����) �ł��B");
 	}
 	else if(2 == iInput){
 		System.out.println("���Ȃ� 2: �͂��� (=���傫) �ł��B");
 	}
 	else{
 		System.out.println("���Ȃ� 3: �� (=�΂�) �ł��B");
    }
 	Random rnd = new Random();
 	iValue = rnd.nextInt (3) + 1;
 	if(1 == iValue){
 		System.out.println("�R���s���[�^�[�� 1: �� (=����) �ł��B");
 	}
 	else if(2 == iValue){
 		System.out.println("�R���s���[�^�[�� 2: �͂��� (=���傫) �ł��B");
 	}
 	else{
 		System.out.println("�R���s���[�^�[�� 3: �� (=�΂�) �ł��B");
 	}
 	if(iInput == iValue){
 		System.out.println("����:��������(Draw)�ł��B");
 	}
 	else if(3 > iInput){
 	if(3 == iValue){
 		System.out.println("����:����(You Lose)�ł��B");
 	}
 	else{
 		System.out.println("����:����(You Win)�ł��B");
 	}
 }
 	else{
 		System.out.println("����:����(You Win)�ł��B");
 	}
 }
 catch(Exception ex){
 //��O�̏ꍇ
 	System.out.println("����1�`3!!!!!!");
 }
}
}
