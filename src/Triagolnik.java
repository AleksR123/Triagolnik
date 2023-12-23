	import java.util.Scanner;

	public class Triagolnik {

		public static void main(String[] args) {
			
			double a,b,c;
			
			Scanner tastatura = new Scanner(System.in);
			
			System.out.println("Vnesete vrednost na hipotenuzata c: ");
			c=tastatura.nextDouble();
			
			System.out.println("Vnesete vrednost na prvata kateta a: ");
			a=tastatura.nextDouble();
			
			System.out.println("Vnesete vrednost na drugata kateta b: ");
			b=tastatura.nextDouble();

			if (a+b>c&&a+c>b&&c+b>a) {
				System.out.println("So ovie dolzini moze da se napravi triagolnik ");
			} else {
				System.out.println("Ova ne e triagolnik ");
				System.exit(0);		}
				if (c*c==a*a+b*b) {
					System.out.println("Ova e pravoagolen triagolnik ");
				}  else if (c*c>a*a+b*b) {
					System.out.println("Ova e tapoagolen triagolnik ");
				}
				else if (c*c<a*a+b*b) {
					System.out.println("Ova e ostroagolen triagolnik ");
				}
			
		}


}
