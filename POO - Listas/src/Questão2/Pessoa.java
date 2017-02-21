package Questão2;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	
	public Pessoa(){
		nome = "";
		idade = 0;
		altura = 0;
		peso = 0;
		sexo = "";
	}
	
	public Pessoa(String nome, int idade, double altura, double peso, String sexo){
		nome = nome;
		idade = idade;
		altura = altura;
		peso = peso;
		sexo = sexo;
	}
	
	public void alteraNome(String novoNome){
		nome = novoNome;
	}
	
	public void alteraIdade(int novoIdade){
		idade = novoIdade;
	}
	
	public void alteraAltura(double novoAltura){
		altura = novoAltura;
	}
	
	public void alteraPeso(double novoPeso){
		peso = novoPeso;
	}
	
	public void alteraSexo(String novoSexo){
		sexo = novoSexo;
	}
	
	
	public String mostraNome(){
		return nome;
	}
	
	public int mostraIdade(){
		return idade;
	}
	
	public double mostraAltura(){
		return altura;
	}
	
	public double mostraPeso(){
		return peso;
	}
	
	public String mostraSexo(){
		return sexo;
	}
	
	public double IMC(){
		double resultado = peso/(altura*altura);
		return resultado;
	}
	
}
