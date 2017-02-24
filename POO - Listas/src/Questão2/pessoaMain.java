package Questão2;

public class pessoaMain {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Neto", 20, 1.75, 90, "Masculino");
		Pessoa pessoa2 = new Pessoa();
		pessoa2.alteraAltura(1.80);
		pessoa2.alteraIdade(13);
		pessoa2.alteraNome("joão");
		pessoa2.alteraPeso(120);
		pessoa2.alteraSexo("Masculino");
		
		pessoa1.alteraAltura(1.80);
		pessoa1.alteraIdade(23);
		pessoa1.alteraPeso(60);
		pessoa1.alteraNome("Marina");
		pessoa1.alteraSexo("Mulher");
		System.out.println(pessoa2.mostraAltura());
		System.out.println(pessoa2.mostraIdade());
		System.out.println(pessoa2.mostraNome());
		System.out.println(pessoa2.mostraPeso());
		System.out.println(pessoa2.mostraSexo());
		
		System.out.println(pessoa2.IMC());
		System.out.println(pessoa2.toString());
	}

}
