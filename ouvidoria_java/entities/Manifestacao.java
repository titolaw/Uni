package entities;

public class Manifestacao {
	private Pessoa pessoa;
	private String data;
	private int contador;
	private static Manifestacao[] manifestacao = new Manifestacao[5];

	public Manifestacao() {

	}

	public Manifestacao(Pessoa pessoa, String data) {
		this.pessoa = pessoa;
		this.data = data;
	}

	public void inserir(Manifestacao item) {
		manifestacao[contador] = item;
	}

	public int getContador() {
		return contador;
	}

	public void incrementaContador() {
		contador++;
	}

	public int getNumNull() {
		int contadorNull = 0;
		for (int j = 0; j < manifestacao.length; j++) {
			if (manifestacao[j] == null) {
				contadorNull++;
			}
		}
		return contadorNull;
	}

	public void listar() {
		for (int x = 0; x < manifestacao.length; x++) {
			if (manifestacao[x] != null) {
				System.out.println((x + 1) + " - " + manifestacao[x]);
			}
		}
	}

	public int getSize() {
		return manifestacao.length;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Manifestacao [pessoa=" + pessoa + ", data=" + data + "]";
	}

}
