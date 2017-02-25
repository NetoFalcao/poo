package Questão3;

import java.util.List;
import java.util.ArrayList;

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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Pontos other = (Pontos) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString(){
		return "[" + x + "," + y + "]";
	}
	
	
}
