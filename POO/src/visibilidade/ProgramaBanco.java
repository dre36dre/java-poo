package visibilidade;

public class ProgramaBanco {

	public static void main(String[] args) {
		ContaBanco p1= new ContaBanco(222, "CC", "Anderson", 1000, false);
		p1.abrirConta("CC");
		
		
		ContaBanco p2=new ContaBanco(2000, null, null, 0, false);
		p2.abrirConta("CP");
		p2.setDono("Andre");
		
		p1.depositar(500);
		p2.depositar(510);
		
		p1.sacar(550);
		p2.sacar(550);
		
		p1.fecharConta();
		
		p1.EstadoAtual();
		p2.EstadoAtual();
	}

}
