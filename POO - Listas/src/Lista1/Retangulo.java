package Lista1;

public class Retangulo {

	private int largura;
	private int altura;
	
	public Retangulo(){
		largura = 0;
		altura = 0;
	}
	
	public Retangulo(int larguraR, int alturaR){
		largura = larguraR;
		altura = alturaR;
	}
	
	@Override
	public String toString(){
		String mensagem = "Largura: " + largura + "Altura: " + altura;
		return mensagem;
	}

	@Override
	public boolean equals(Object o){
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Retangulo retangulo = (Retangulo) o;
		if (altura != retangulo.altura && largura != retangulo.largura)
			return false;
		return true;
	}
	
	public void alteraAltura(int novoAltura){
		altura = novoAltura;
	}
	
	public void alteraLargura(int novoLargura){
		largura = novoLargura;
	}
	
	public int mostraLargura(){
		return largura;
	}
	
	public int mostraAltura(){
		return altura;
	}
	
	public int perimetroRetangulo(int largura, int altura){
		int resultado = 2*(altura+largura);
		return resultado;
	}
	
	public int areaRetangulo(int largura, int altura){
		int resultado = altura*largura;
		return resultado;
	}
}
