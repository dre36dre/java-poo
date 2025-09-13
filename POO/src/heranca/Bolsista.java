package heranca;

public class Bolsista extends Aluno {
	public Bolsista(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo, matricula, curso);
		// TODO Auto-generated constructor stub
	}

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de"+this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista!"+"pagamento efetuado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	
}
