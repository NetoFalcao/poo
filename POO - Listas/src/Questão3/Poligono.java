package Questão3;

import java.util.List;
import java.util.ArrayList;

public class Poligono {
	
	private Pontos pontos;
	private ArrayList<Pontos> conjuntoPontos;
	
	
	public Poligono(){
	}
	
	public Poligono(Pontos ponto,ArrayList<Pontos>conjuntoPontos1){
		pontos = ponto;
		conjuntoPontos = conjuntoPontos1;
	}
	
	public String mostrarCordendas(ArrayList<Pontos> conjuntoPontos){
		String mostrar = conjuntoPontos.toString();
		return mostrar;
	}
	
	public List<Pontos> adcionaPontos(Pontos ponto, ArrayList<Pontos> conjuntoPontos) throws IllegalArgumentException{
		if (conjuntoPontos.contains(ponto)){
			throw new IllegalArgumentException("Esse ponto já existe");
		}else{
			conjuntoPontos.add(ponto);
		}
		return conjuntoPontos;
	}
	
	public Pontos alteraCordenadas(Pontos pontos, int x, int y){
		pontos.alteraCordenadaX(x);
		pontos.alteraCordenadaY(y);
		return pontos;
	}
	
	public List<Pontos> removeCordenada(ArrayList<Pontos> conjuntoPontos){
		conjuntoPontos.remove(pontos);
		return conjuntoPontos;
	}
	
	public int calculaArea(ArrayList<Pontos> conjuntoPontos){
		int soma = 0;
		for (int i = 0; i < conjuntoPontos.size()-1; i++){
			soma += conjuntoPontos.get(i+1).mostrarX()*conjuntoPontos.get(i).mostrarY() - conjuntoPontos.get(i).mostrarX()*conjuntoPontos.get(i+1).mostrarY();
		}
		soma /= 2;
		return soma;
	}
	
	
}
