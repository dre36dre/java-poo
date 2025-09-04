package encapsulamento;

public class ProgramaControle {

	public static void main(String[] args) {
		ControleRemoto c= new ControleRemoto();
		c.ligar();
		c.abrirMenu();
		c.maisVolume();
		c.play();
		c.fecharMenu();
		c.abrirMenu();
	}

}
