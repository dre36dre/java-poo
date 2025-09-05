package composicao;

import java.util.Random;

public class Luta {

private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovada;

//Métodos
public void marcarLutar(Lutador l1, Lutador l2) {
	if(l1.getCategoria() .equals(l2.getCategoria()) && l1 !=l2) {
		this.aprovada=true;
		this.desafiado=l1;
		this.desafiante=l2;
	}else
	{
		this.aprovada=false;
		this.desafiado=null;
		this.desafiante=null;
	}
	
	
}

public void lutar() {
	if(this.aprovada) {
		System.out.println("###Desafiado");
		desafiado.apresentar();
		System.out.println("###Desafiante");
		desafiante.apresentar();
		
		Random aleatorio=new Random();
		int vencedor=aleatorio.nextInt(3);
		
		
		switch (vencedor) {
		
		case 0:  //Empate
		System.out.println("Empatou");
		this.desafiado.empatarLuta();
		this.desafiante.empatarLuta();
		break;
		
		case 1: //Desafiado vence
		System.out.println("Ganhou "+this.desafiado.getNome());
		this.desafiado.ganharLuta();
		this.desafiante.perderLuta();
		break;
		
		case 2: //Desafiante vence
		System.out.println("Venceu "+this.desafiante.getNome());
		this.desafiante.ganharLuta();
		this.desafiado.perderLuta();
		break;
		}
		}else {
			System.out.println("A luta não pode acontecer!");
		}
	
	}
//Métodos especiais
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


}
