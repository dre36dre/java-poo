package composicao;

public class ProgramaLivro {
	public static void main(String[] args) {
		
	Pessoa[] p=new Pessoa[3];
	Livro[] l=new Livro[3];
	
	p[0]= new Pessoa("Pedro",5,"M");
	p[1]= new Pessoa("Maria",10, "F");
	p[2]=new Pessoa("Victor",13,"M");
	
	l[0]=new Livro("Uma partida de futebol","Victor Hugo", 1000, p[0]);
	l[1]=new Livro("A menina do sonho","Maria Luiza", 80, p[1]);
	l[2]=new Livro("Corrida de carros","Victor Hugo", 150, p[2]);
	
	l[0].abrir();
	l[0].folhear(998);
	l[0].avancarPagina();
	System.out.println(l[0].detalhes());
	System.out.println(l[1].detalhes());
	System.out.println(l[2].detalhes());
	
}
}