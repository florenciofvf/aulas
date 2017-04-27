
public class Declarativo {

	public static int pa(int n) {
		if(n == 0) {
			return 0;
		}
		
		return n + pa(n - 1);
	}
	
}
