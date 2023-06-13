package entities;

public class Sugestao extends Manifestacao{
	private String texto;
	private String tipo;

	public Sugestao(Pessoa pessoa, String data, String texto) {
		super(pessoa, data);
		this.texto = texto;
		this.tipo = "sugestao";
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
		return "Sugestão: " + texto + " | " +  "Data: " + this.getData()  +  " | " + "Autor: " + this.getPessoa().getNome();
	}
	
	
}
