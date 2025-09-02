package composicao;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float peso;
	private float altura;
	private String categoria;
	private int vitoria;
	private int derrota;
	private int empate;
		
	public Lutador(String nome, String nacionalidade, int idade, float peso, float altura,  int vitoria,
			int derrota, int empate) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
	}
	
	public void apresentar() {
	System.out.println("========================================");	
	System.out.println("Apresentamos o lutador "+getNome());
	System.out.println("Diretamente de "+getNacionalidade());
	System.out.println("com "+getIdade());
	System.out.println("pesando "+getPeso());
	System.out.println(getVitoria()+ "vitórias");
	System.out.println(getDerrota()+ "derrotas e ");
	System.out.println(getEmpate()+ "empates");
	}
	public void status() {
		System.out.println(getNome() +"é um peso"+getCategoria());
		System.out.println("Ganhou "+getVitoria()+ "vezes");
		System.out.println("Perdeu "+getDerrota()+ "vezes");
		System.out.println("Empatou "+getEmpate()+ "vezes");
	}
	public void ganharLuta() {
		this.setVitoria(getVitoria() +1);
	}
	public void perderLuta() {
		this.setDerrota(getDerrota() +1 );
		
	}
	public void empatarLuta() {
		this.setEmpate(getEmpate() +1);
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if(this.peso <=52.2) {
			this.categoria = "Inválido";
		}
		else if(this.peso <=70.3) {
			this.categoria="Leve";
		}
		else if(this.peso <=83.9) {
			this.categoria="Médio";
		}else if(this.peso <120.2) {
			this.categoria="Pesado";
		}else {
			this.categoria="Inválido";
		}
			
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getDerrota() {
		return derrota;
	}
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	
	
}
