import java.util.Scanner;
public class DongulerOrnek8 {

	public static void main(String[] args) {
		// Java'da d�ng�ler kullan�larak y�ld�zlar ile ��gen yap�yoruz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Say� giriniz : ");
		int sayi = scan.nextInt();
		
		for(int i=1; i<=sayi; i++) { // sat�r say�s�
			
			for(int k=1; k <= (sayi-i); k++) { // bo�luk say�s�
				System.out.print(" ");
			}
			
			for(int j=1; j<= (2*i) -1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}

	}

}
