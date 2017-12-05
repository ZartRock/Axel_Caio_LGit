package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getNome() {
		return this.animal.getNome();
	}
	
	public String getTipo() {
		return this.animal.getTipo();
	}
	
	public int getIdade() {
		return this.animal.getIdade();
	}
	
	public String toString() {
		return this.getNome() + ", " + this.getTipo() + ", " + this.getDias() + " dias com o preço de R$ " + this.valor;
	}
}
