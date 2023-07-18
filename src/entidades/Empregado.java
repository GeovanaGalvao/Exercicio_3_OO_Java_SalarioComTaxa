package entidades;

public class Empregado {

	public String nome;
	public double salarioBruto, imposto;
	
	public double salarioLiquido() { return salarioBruto - imposto; }
	public void aumentoSalarial(double porcentagem) { salarioBruto+=salarioBruto*(porcentagem*0.01); }
	public String toString() { return nome + ", R$: " + String.format("%.2f",salarioLiquido()); }
}
