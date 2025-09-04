package visibilidade;

public class Caneta {
<<<<<<< HEAD
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
=======
 private  String modelo, cor;
 protected int  carga;
 private  float ponta;
 private boolean tampada;
 
 public  Caneta(String modelo, String cor, float ponta) {
	 this.modelo=modelo;
	 this.cor=cor;
	 this.ponta=ponta;
	 this.tampar();
 }
 
 public String getModelo() {
	return modelo;
}
 public void setModelo(String modelo) {
	this.modelo = modelo;
 }
 public String getCor() {
	return cor;
 }
 public void setCor(String cor) {
	this.cor = cor;
 }
 public int getCarga() {
	return carga;
 }
 public void setCarga(int carga) {
	this.carga = carga;
 }
 public float getPonta() {
	return ponta;
 }
 public void setPonta(float ponta) {
	this.ponta = ponta;
 }
 public boolean isTampada() {
	return tampada;
 }
 public void setTampada(boolean tampada) {
	this.tampada = tampada;
 }
 
 void status() {
	 System.out.println("Modelo: "+this.modelo);
	 System.out.println("Uma caneta " +this.cor);
	 System.out.println("Ponta: "+this.ponta);
	 System.out.println("Carga: "+this.carga);
	 System.out.println("Esta tampada? "+this.tampada);
 }
public void rabiscar() {
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
 
>>>>>>> refs/remotes/origin/master
}
