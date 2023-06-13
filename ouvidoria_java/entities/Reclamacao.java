package entities;

public class Reclamacao extends Manifestacao{
	private String texto;
	private String tipo;

	public Reclamacao(Pessoa pessoa, String data, String texto) {
		super(pessoa, data);
		this.texto = texto;
		this.tipo = "reclamacao";
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
		return "Reclamação: " + texto + " | " +  "Data: " + this.getData()  +  " | " + "Autor: " + this.getPessoa().getNome();
	}
	
	
}
