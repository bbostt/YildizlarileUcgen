import java.util.Scanner;
public class DongulerOrnek8 {

	public static void main(String[] args) {
		// Java'da döngüler kullanýlarak yýldýzlar ile üçgen yapýyoruz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý giriniz : ");
		int sayi = scan.nextInt();
		
		for(int i=1; i<=sayi; i++) { // satýr sayýsý
			
			for(int k=1; k <= (sayi-i); k++) { // boþluk sayýsý
				System.out.print(" ");
			}
			
			for(int j=1; j<= (2*i) -1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}

	}

}
