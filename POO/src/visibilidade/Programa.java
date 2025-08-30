package visibilidade;

public class Programa {
	public static void main(String[] args) {
		Caneta c1= new Caneta();
		c1.modelo="Bic crystal";
		c1.cor="preta";
//		c1.ponta=1.0f;
		c1.carga=80;
		c1.tampada=true;
		c1.rasbicar();
		c1.destampar();
		c1.status();
	}
}
