package Main;

public class pesbin {

	public static int BuscaBinaria(Long[] c, long cpfcliente) {
		return PesquisaBinaria(c, 0, c.length - 1, cpfcliente);
	}
	
	public static int PesquisaBinaria(Long[] c, int menor, int maior, long cpfcliente) {
		int meio = (menor+maior)/2;
		
		if	(menor > maior) {
			return -1;
		}

		if	(c[meio] == cpfcliente) {
			return meio;
		}
		
		if	(c[meio] < cpfcliente) {
			return PesquisaBinaria(c, meio+1, maior, cpfcliente);
		}
			else
		{
			return PesquisaBinaria(c, menor, meio-1, cpfcliente);
		}
	}
	
}
