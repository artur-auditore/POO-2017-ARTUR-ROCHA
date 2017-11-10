
public class Questao_6 {
	
	public static void main(String[] args) {
		int x=0, y=1;
		
		for(int i=0; i<13; y+=x, x=y-x, i++) {
			
			System.out.println(x);
		}
	}

}
