package Main;

	/**
	 * Representa uma �rvore formada por n�s com, no m�ximo, dois filhos.
	 * Possui apenas a refer�ncia para a raiz, de onde partem todos as 
	 * buscas.
	 * 
	 * As �rvores de busca bin�ria t�m uma propriedade em todos os n�s:
	 * os valores menores ficam na sub-�rvore � esquerda e os valores 
	 * maiores ficam na sub-�rvore � direita.  
	 *
	 */
public class abb {

	/**
	 * Raiz da �rvore
	 */
	private No raiz;

	/**
	 * Adiciona um valor na �rvore de busca bin�ria mantendo
	 * as propriedades da busca nos n�s.
	 */
	public void add(long cpf) {
		
		if (raiz == null) {
			raiz = new No();
			raiz.setValor(cpf);
			return;
		}
		
		No atual = raiz;
		
		addRecursivo(cpf, atual);

	}

	/**
	 * Tenta adicionar um valor como filho do n�s atual.
	 * Se o espa�o j� estiver ocupado, caminha recursivamente
	 * nos n�s filhos.
	 * 
	 * @param cpf Valor a ser adicionado na �rvore.
	 * @param atual N� que est� sendo analisado
	 */
	protected void addRecursivo(long cpf, No atual) {
		if (cpf == atual.getValor()) {
			//throw new RuntimeException("J� tem " + cpf);
			return;
		}
		
		if (cpf < atual.getValor()) {
			addEsquerda(cpf, atual);
			
		} else {
			addDireita(cpf, atual);
		}
	}

	protected void addEsquerda(long cpf, No atual) {
		No esquerda = atual.getEsquerda();
		if (esquerda == null) {
			No novo = new No();
			novo.setValor(cpf);
			novo.setPai(atual);
			atual.setEsquerda(novo);
		} else {
			addRecursivo(cpf, esquerda);
		}
	}

	protected void addDireita(long cpf, No atual) {
		No direita = atual.getDireita();
		
		if (direita == null) {
			No novo = new No();
			novo.setValor(cpf);
			novo.setPai(atual);
			atual.setDireita(novo);
		} else {
			addRecursivo(cpf, direita);
		}
	}

	/**
	 * Verifica se um valor est� presente na �rvore atual.
	 * @param ccliente Valor a ser procurado
	 * @return -1 se o valor n�o existir ou a quantidade de n�veis buscados para
	 * encontrar o valor
	 */
	public int contains(Long ccliente) {
		return containsRecursivo(ccliente, raiz, 0);
	}

	/**
	 * Caminha recursivamente na �rvore, em busca de um valor
	 * @param ccliente Valor a ser procurado
	 * @param atual N� que est� sendo analisado agora
	 * @param nivel N�vel do pai do n� atual
	 * @return -1 se o valor n�o existir ou a quantidade de n�veis buscados para
	 * encontrar o valor
	 */
	private int containsRecursivo(Long ccliente, No atual, int nivel) {
		if (atual == null) {
			return -1;
		}
		
		if (atual.getValor() == ccliente) {
			return nivel + 1;
		}
		
		if (ccliente < atual.getValor()) {
			return containsRecursivo(ccliente, atual.getEsquerda(), ++nivel);
		} else {
			return containsRecursivo(ccliente, atual.getDireita(), ++nivel);
		}
	}

}

/**
 * Representa um n� de uma �rvore de busca bin�ria.
 * Possui refer�ncias para os dois filhos poss�veis (esquerda e direita), 
 * para o n� pai e o valor armazenado.
 *
 */
class No {

	private long valor;
	private No direita, esquerda, pai;

	public long getValor() {
		return valor;
	}

	public void setValor(long cpf) {
		this.valor = cpf;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

}

