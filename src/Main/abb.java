package Main;

	/**
	 * Representa uma árvore formada por nós com, no máximo, dois filhos.
	 * Possui apenas a referência para a raiz, de onde partem todos as 
	 * buscas.
	 * 
	 * As árvores de busca binária têm uma propriedade em todos os nós:
	 * os valores menores ficam na sub-árvore à esquerda e os valores 
	 * maiores ficam na sub-árvore à direita.  
	 *
	 */
public class abb {

	/**
	 * Raiz da árvore
	 */
	private No raiz;

	/**
	 * Adiciona um valor na árvore de busca binária mantendo
	 * as propriedades da busca nos nós.
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
	 * Tenta adicionar um valor como filho do nós atual.
	 * Se o espaço já estiver ocupado, caminha recursivamente
	 * nos nós filhos.
	 * 
	 * @param cpf Valor a ser adicionado na árvore.
	 * @param atual Nó que está sendo analisado
	 */
	protected void addRecursivo(long cpf, No atual) {
		if (cpf == atual.getValor()) {
			//throw new RuntimeException("Já tem " + cpf);
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
	 * Verifica se um valor está presente na árvore atual.
	 * @param ccliente Valor a ser procurado
	 * @return -1 se o valor não existir ou a quantidade de níveis buscados para
	 * encontrar o valor
	 */
	public int contains(Long ccliente) {
		return containsRecursivo(ccliente, raiz, 0);
	}

	/**
	 * Caminha recursivamente na árvore, em busca de um valor
	 * @param ccliente Valor a ser procurado
	 * @param atual Nó que está sendo analisado agora
	 * @param nivel Nível do pai do nó atual
	 * @return -1 se o valor não existir ou a quantidade de níveis buscados para
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
 * Representa um nó de uma árvore de busca binária.
 * Possui referências para os dois filhos possíveis (esquerda e direita), 
 * para o nó pai e o valor armazenado.
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

