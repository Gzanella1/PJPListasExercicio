package listaPOO.listaPoo_3;

import java.util.Arrays;

public class Agenda {
	private String nome;
	private Contato[] contato;
	private int index = 0;

    public Agenda(String nome, int idex) {
        this.nome = nome;
        this.contato = new Contato[idex]; // agenda com 3 posições
        this.index = 0;
    }
	

	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Agenda: ").append(nome).append("\n");
	    for (int i = 0; i < index; i++) {
	        sb.append(contato[i].toString()).append("\n");
	    }
	    return sb.toString();
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contato;
	}

	public void setContato(Contato[] contato) {
		this.contato = contato;
	}

	public boolean addcontato(Contato c) {
		if (index < contato.length) {
			contato[index] = c;
			index++;
			return true; // sucesso
		} else {
			System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
			return false; // falha
		}

	}

	public static void main(String[] args) {
		Agenda a = new Agenda("teste",3);
		a.nome = "teste";

		Contato c1 = new Contato("giovani", "e", 4799);
		Contato c2 = new Contato("aaaa", "e", 4799);
		Contato c3 = new Contato("bbb", "e", 4799);

		a.addcontato(c3);
		a.addcontato(c1);
		a.addcontato(c2);

		System.out.println(a.toString());

	}

}
