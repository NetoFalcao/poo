package Questão3;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pontos pontos = new Pontos();
		pontos.alteraCordenadaX(2);
		pontos.alteraCordenadaY(5);
		
		Pontos pontos2 = new Pontos();
		pontos.alteraCordenadaX(3);
		pontos.alteraCordenadaY(5);
		
		System.out.println(pontos.toString());
		System.out.println(pontos.equals(pontos2));
		
		/**List<Integer> listaTeste = new ArrayList<Integer>();
		Pontos pontos2 = new Pontos(4, 5, listaTeste);
		
		listaTeste.remove(1);
		System.out.println(listaTeste.toString());
		**/
	}

}
