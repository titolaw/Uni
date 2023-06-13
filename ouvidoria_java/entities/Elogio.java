package entities;

public class Elogio extends Manifestacao {
	private String texto;
	private String tipo;

	public Elogio(Pessoa pessoa, String data, String texto) {
		super(pessoa, data);
		this.texto = texto;
		this.tipo = "elogio";
	}
	
	public String getTipo() {
		return tipo;
	}

	public String getAssunto() {
		return texto;
	}

	public void setAssunto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Elogio: " + texto + " | " +  "Data: " + this.getData() +  " | " + "Autor: " + this.getPessoa().getNome();
	}


	
	
}
