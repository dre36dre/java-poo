package composicao;

public class ProgramaLutador {
public static void main(String[] args) {
	Lutador l[]= new Lutador[6];
	 l[0]=new Lutador("Dre", "Italiana", 46, 75, 1.75f, 7, 1, 3);
	 l[1]=new Lutador("jose", "Israel", 25, 62, 1.70f, 8, 1, 3);
	 l[2]=new Lutador("Marcos", "México", 26, 73, 1.75f, 7, 4, 4);
	 l[3]=new Lutador("Ale", "EUA", 22, 80, 1.75f, 7, 1, 3);
	 l[4]=new Lutador("Maiki", "Argentina", 21, 68, 1.75f, 7, 1, 3);
	 l[5]=new Lutador("Rafael", "Brasil", 20, 65, 1.75f, 7, 1, 3);
	
	 l[5].apresentar();
	 l[5].status();
	 
	
	Luta uec01=new Luta();
}
}
