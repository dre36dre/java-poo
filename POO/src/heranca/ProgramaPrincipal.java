package heranca;

public class ProgramaPrincipal {
public static void main(String[] args) {
//	Visitante v1= new Visitante("a",6,"F");
//	v1.setNome("Pedro");
//	v1.setIdade(5);
//	v1.setSexo("M");
	
//	Aluno a1=new Aluno(null, 0, null, 0, null);
//	a1.setNome("Anderson");
//	a1.setIdade(46);
//	a1.setSexo("M");
	
	
	Bolsista b1=new Bolsista(null, 0, null, 0, null);
	b1.setNome("Hugo");
	b1.setMatricula(1221);
	b1.setBolsa(2.5f);
	b1.setSexo("M");
	b1.pagarMensalidade();
	
	System.out.println(b1.toString());
}
}
