package visibilidade;

public class Programa {
	public static void main(String[] args) {
		Caneta c1= new Caneta("Bik","vermelha",0.7f);
		c1.modelo="Bic crystal";
		c1.cor="preta";
//		c1.ponta=1.0f;
		c1.carga=80;
//		c1.tampada=true;
//		c1.rasbicar();
		c1.destampar();
		c1.status();
		c1.status();
		Caneta c2= new Caneta("abc","amarela", 1.5f);
		c2.status();
		
	}
}
