public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		HashMap<Integer,Double> pricesAndCode = new HashMap();
		pricesAndCode.put(1,0.5);
		pricesAndCode.put(2,1.0);
		pricesAndCode.put(3,4.0);
		pricesAndCode.put(5,7.0);
		pricesAndCode.put(9,8.0);


		
		int total = 0;
		
		while (true) {
			double preco = 0;
			System.out.println("Digite o código do produto:");
			int produtoCod = teclado.nextInt();
			if(produtoCod == 0) {
				break;
			}
			if(pricesAndCode.containsKey(produtoCod)) {
				preco = pricesAndCode.get(produtoCod);
			}
			System.out.println("Digite a quantidade:");
			int quantidade = teclado.nextInt();
			total += preco*quantidade;
		}
		
		System.out.println("O valor a ser pago será: R$ "+ total);
		
		

	}

}