package exemplos;

//6
//Erro
//Fim
public strictfp final class Main01 {
	
	public static void main(String[] args) {
		try {
			System.out.println( dividir(30, 5)  );
			System.out.println( dividir(10, 0)  );
			System.out.println( dividir(20, 2)  );
		} catch(Exception e) {
			System.out.println("Erro");
		}
		
		System.out.println("Fim");
	}

	private static int dividir(int x, int y) throws Exception {
		assert x > 0;
		
		if(y == 0) {
			throw new Exception("Não existe divisão por zero.");
		}
		
		return x / y;
	}
}