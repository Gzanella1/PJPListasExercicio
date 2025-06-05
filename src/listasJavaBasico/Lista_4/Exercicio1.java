package listasJavaBasico.Lista_4;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=1;
		int produto = 1;
		int soma=0;
		
		while(num > 0) {
			System.out.println("digite o dumero: ");
			num=in.nextInt();
		
			if(num%2 ==0) {
				soma+=num;
			}
			else {
				produto*=num;
			}
		}
		System.out.println("produto: "+produto);
	}

}
	