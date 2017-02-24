package Questão2;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	
	public Pessoa(){
		nome = "Nulo";
		idade = 0;
		altura = 0;
		peso = 0;
		sexo = "";
	}
	
	public Pessoa(String nome1, int idade1, double altura1, double peso1, String sexo1){
		nome = nome1;
		idade = idade1;
		altura = altura1;
		peso = peso1;
		sexo = sexo1;
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
	
	public String toString(){
		if (this.IMC() <= 18.5){
			return this.nome + " || Abaixo do Peso normal.";
		} else if (this.IMC() > 18.5 && this.IMC() <= 25){
			return this.nome + " || Peso normal";
		} else if (this.IMC()> 25 && this.IMC() <= 30){
			return this.nome + " || Acima do Peso normal";
		} else{
			return this.nome  + " || Obesidade";
		}
	}
	
	
	
}
