package Questão3;

import java.util.List;
import java.util.ArrayList;

public class Poligono {
	
	private Pontos pontos;
	private List<Pontos> conjuntoPontos;
	
	
	public Poligono(){
		pontos = null;
		List<Pontos> conjuntoPontos = new ArrayList<Pontos>();
	}
	
	public Poligono(Pontos pontos1,List<Pontos>conjuntoPontos1){
		pontos = pontos1;
		conjuntoPontos = conjuntoPontos1;
	}
	
	public Pontos alteraCordenadas(Pontos pontos, int x, int y){
		pontos.alteraCordenadaX(x);
		pontos.alteraCordenadaY(y);
		return pontos;
	}
	
}
