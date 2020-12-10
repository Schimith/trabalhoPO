package Main;

public class hash {

	private Registro[] registros = new Registro[10];

	public void put(Object chave, String valor) {
		int posicao = hash(chave);

		//Se ainda n�o existem registros nesta linha do hash
		if (registros[posicao] == null) { 
			registros[posicao] = novoRegistro(chave, valor);

		//Se se j� houver registros nesta linha do hash
		} else {
			//Pega o primeiro registro da linha
			Registro atual = registros[posicao]; 
			
			//Caminha at� o �ltimo registro
			while (atual.getProximo() != null) {
				
				//Se achar a mesma chave "no meio do caminho", 
				//troca o valor e acaba o m�todo
				if (atual.getChave().equals(chave)) {
					atual.setValor(valor);
					return;
				}
				
				atual = atual.getProximo();
			}
			
			//Se achar a mesma chave "no final do caminho", 
			//troca o valor e acaba o m�todo
			if (atual.getChave().equals(chave)) {
				atual.setValor(valor);
				return;
			}

			//Se chegar no final da lista desta linha, adiciona um 
			//novo registro com a chave, o valor, e colocando o pr�ximo como nulo
			atual.setProximo(novoRegistro(chave, valor));
		}

		
	}

	protected Registro novoRegistro(Object chave, String valor) {
		Registro novoRegistro = new Registro();
		novoRegistro.setChave(chave);
		novoRegistro.setValor(valor);
		novoRegistro.setProximo(null);
		return novoRegistro;
	}

	private int hash(Object chave) {
		return chave.hashCode() % 10;
	}

	public String get(Object chave) {
		//Mapeia a chave para uma posi��o de linha (no hash)
		int posicao = hash(chave);
		Registro atual = registros[posicao];
		
		//A linha da chave procurada est� nula
		if (atual == null) {
			throw new RuntimeException("Chave desconhecida: " + chave);
		}
		
		//Caminha na linha, procurando a chave
		while (!atual.getChave().equals(chave)) {
			
			//Se chegar no final da linha, n�o encontrou a chave
			if (atual.getProximo() == null) {
				throw new RuntimeException("Chave desconhecida: " + chave);
			}
			atual = atual.getProximo();
		}
		
		return atual.getValor();
	}

}

class Registro {

	private Object chave;
	private String valor;
	private Registro proximo;

	public Object getChave() {
		return chave;
	}

	public void setChave(Object chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Registro getProximo() {
		return proximo;
	}

	public void setProximo(Registro proximo) {
		this.proximo = proximo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		result = prime * result + ((proximo == null) ? 0 : proximo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		if (proximo == null) {
			if (other.proximo != null)
				return false;
		} else if (!proximo.equals(other.proximo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}


}
