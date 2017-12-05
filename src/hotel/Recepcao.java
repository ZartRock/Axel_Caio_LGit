package hotel;

import java.util.ArrayList;

public class Recepcao {
	private ArrayList<Estadia> estadias;
	
	
	public Recepcao() {
		this.estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia novaEstadia = new Estadia(nome, tipo, idade, dias, valor);
		this.estadias.add(novaEstadia);
	}
	
	public void checkOut(String nome) {
		for (int i = 0; i < this.estadias.size(); i++) {
			String nomeAnimal = this.estadias.get(i).getNome();
			if (nomeAnimal.equals(nome)) {
				this.estadias.remove(i);
				break;
			}
		}
		
	}
	
	public int getNumDeHospedes() {
		return this.estadias.size();
	}
	
}
