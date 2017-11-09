
public class Questao_8 {
	
	public static void main(String[] args) {
		
		for (int i=1;i<=i*i;i++) {
			System.out.print(i + "\n");
		}
		
		for (int i=2;i<=i*i;i++) {
			if (i%2==0) {
				System.out.print(i +" ");
			}
			
		}
		for (int i=3;i<=i*i;i++) {
			if (i%3==0) {
				System.out.print("\n" +i );
			}
		}
	}
}
