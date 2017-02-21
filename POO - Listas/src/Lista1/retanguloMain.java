package Lista1;

public class retanguloMain {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(2,2);
		Retangulo r2 = new Retangulo(2,2);
		
		System.out.println(r.toString());
		
		System.out.println(r.equals(r2));
		
		r.alteraAltura(3);
		r.alteraLargura(5);
		
		System.out.println(r.toString());
		
		System.out.println(r.mostraAltura());
		System.out.println(r.mostraLargura());
		
		System.out.println(r.perimetroRetangulo());
		System.out.println(r.areaRetangulo());
	}

}
