package composicao;

import java.util.Random;

public class Luta {

private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovada;




public Lutador getDesafiado() {
	return desafiado;
}
public void setDesafiado(Lutador desafiado) {
	this.desafiado = desafiado;
}
public Lutador getDesafiante() {
	return desafiante;
}
public void setDesafiante(Lutador desafiante) {
	this.desafiante = desafiante;
}
public int getRounds() {
	return rounds;
}
public void setRounds(int rounds) {
	this.rounds = rounds;
}
public boolean isAprovada() {
	return aprovada;
}
public void setAprovada(boolean aprovada) {
	this.aprovada = aprovada;
}

public void marcarLutar(Lutador l1, Lutador l2) {
	if(l1.getCategoria() == l2.getCategoria()) && ()
	
}
public void lutar() {
	if(aprovada) {
		desafiado.apresentar();
		desafiante.apresentar();
		vencedor=Random(2);
		sw
		
	}else {
		System.out.println("Luta não pode acontecer");
	}
}

}
