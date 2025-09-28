package agregacao;

public class ProjetoYouTube {
 public static void main(String[] args) {
	Video v[]= new Video[3];
	v[0]=new Video("POO");
	v[1]=new Video("Estruturas de dados");
	v[2]=new Video("Algoritmos");
	
	Gafanhoto g[]= new Gafanhoto[3];
	g[0]=new Gafanhoto("Anderson", 46, "M", "dre");
	g[1]=new Gafanhoto("Hugo", 13, "M", "Victor");
	g[2]=new Gafanhoto("Maria", 10, "F", "malu");
	
	System.out.println("================Videos==================================");
	System.out.println(v[0].toString());
	System.out.println(v[1].toString());
	System.out.println(v[2].toString());
	
	System.out.println("\n====================Gafanhotos================================");
	System.out.println(g[0].toString());
	System.out.println(g[1].toString());
	System.out.println(g[2].toString());
	
	System.out.println("===========Visualizações===============================");
	
	Visualizacao vis[]= new Visualizacao[5];
	
	vis[0]=new Visualizacao(g[0],v[0]);
	vis[0].avaliar();//5
	System.out.println(vis[0].toString());
	
	vis[1]=new Visualizacao(g[0],v[1]);	
	vis[1].avaliar(87.0f);
	System.out.println(vis[1].toString());
	
	
}
}
