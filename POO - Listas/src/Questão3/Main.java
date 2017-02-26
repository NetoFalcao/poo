package Questão3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IOException {
		
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));
		
		int i=0;
		System.out.print("Numero de Pontos do Poligono: ");
		i = Integer.parseInt(dados.readLine());
		Poligono poligono = new Poligono();
		ArrayList<Pontos> conjuntoPontos = new ArrayList<Pontos>();
		for (int k=0; k < i; k++){
			System.out.println("Digite as cordenadas do ponto");
			int cordenadaX = Integer.parseInt(dados.readLine());
			int cordenadaY = Integer.parseInt(dados.readLine());
			Pontos ponto = new Pontos(cordenadaX,cordenadaY);
			poligono.adcionaPontos(ponto, conjuntoPontos);
		}
		System.out.println(poligono.calculaArea(conjuntoPontos));
		
}}
