package visibilidade;

public class Caneta {
 public  String modelo, cor;
 protected int  carga;
 private  float ponta;
 private boolean tampada;
 
 void status() {
	 System.out.println("Modelo: "+this.modelo);
	 System.out.println("Uma caneta " +this.cor);
	 System.out.println("Ponta: "+this.ponta);
	 System.out.println("Carga: "+this.carga);
	 System.out.println("Esta tampada? "+this.tampada);
 }
private void rabiscar() {
	 if(this.tampada == true) {
		 System.out.println("ERRO! Não posso rabiscar");
	 } else {
		 System.out.println("Estou rabiscando");
	 }
 }
 protected void tampar() {
	 this.tampada=true;
 }
 protected void destampar() {
	 this.tampada=false;
 }
}
