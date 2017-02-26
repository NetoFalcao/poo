package Questão3;

public class Pontos {
	
	private int x;
	private int y;

	public Pontos(){
		x = 0;
		y = 0;
	}
	
	public Pontos(int cordenadaX, int cordenadaY){
		x = cordenadaX;
		y = cordenadaY;
	}
	
	public void alteraCordenadaX(int novaCordenadaX){
		x = novaCordenadaX;
	}
	
	public void alteraCordenadaY(int novaCordenadaY){
		y = novaCordenadaY;
	}
	
	public int mostrarX(){
		return x;
	}
	
	public int mostrarY(){
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		Pontos outro = (Pontos) obj;
		if (x != outro.x)
			return false;
		if (y != outro.y)
			return false;
		return true;
	}

	@Override
	public String toString(){
		return "[" + x + "," + y + "]";
	}
	
	
}
