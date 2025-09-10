package heranca;

public class ProjetoHeranca {

	public static void main(String[] args) {
		Pessoa p1=new Pessoa(null, 0, null);
		Aluno p2=new Aluno(null, 0, null, 0, null);
		Professor p3=new Professor(null, 0, null, null, false);
		Funcionario p4=new Funcionario(null, 0, null);
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Hugo");
		p4.setNome("Linda");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		p3.setSalario(20000);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
