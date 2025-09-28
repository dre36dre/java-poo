package composicao;

import agregacao.Pessoa;

public class Livro implements Publicacao {
private String titulo;
private String autor;
private int totalPaginas;
private boolean aberto;
private int paginaAtual;
private Pessoa leitor;


public String detalhes() {
	System.out.println("==================================================");
	return "  Titulo=" + titulo
			+ "\n  Autor=" + autor 
			+ "\n  TotalPaginas=" + totalPaginas 
			+ "\n  Aberto=" + aberto
			+ "\n  PaginaAtual=" + paginaAtual 
			+ "\n  Leitor=" + leitor.getNome()  
			+ "\n  Idade=" + leitor.getIdade() 
			+ "\n  Sexo=" + leitor.getSexo() ;
}

	

public Livro(String titulo, String autor, int totalPaginas,  Pessoa leitor) {
	this.titulo = titulo;
	this.autor = autor;
	this.totalPaginas = totalPaginas;
	this.leitor=leitor;
	this.paginaAtual=0;
	this.aberto=false;
}


public int getPaginaAtual() {
	return paginaAtual;
}

public void setPaginaAtual(int paginaAtual) {
	this.paginaAtual = paginaAtual;
}

public Pessoa getLeitor() {
	return leitor;
}

public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getTotalPaginas() {
	return totalPaginas;
}
public void setTotalPaginas(int totalPaginas) {
	this.totalPaginas = totalPaginas;
}
public boolean isAberto() {
	return aberto;
}
public void setAberto(boolean aberto) {
	this.aberto = aberto;
}

@Override
public void abrir() {
	this.aberto=true;
}

@Override
public void fechar() {
	this.aberto=false;
}

@Override
public void folhear(int p) {
	if(p > this.totalPaginas ) {
		this.paginaAtual=0;
	}else {
	this.paginaAtual=p;	
}
}
	

@Override
public void avancarPagina() {
	this.paginaAtual++;
}

@Override
public void voltarPagina() {
	this.paginaAtual--;
}
}
