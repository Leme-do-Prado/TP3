public class AccessHora {

	public static void main(String[] args) {
		System.out.println("Horário da aula?");
		Hora aula = new Hora();
		Hora aula2 = new Hora(21, 15, 00);
		
		System.out.println(getHora1(aula));
		System.out.println(getHora2(aula2));
		System.out.println(getSegs(aula));
		System.out.println(getSegs(aula2));
		/* Continuo a receber os seguintes erros e não sei o que fazer. 
	The method getHora1(Hora) is undefined for the type AccessHora
	The method getHora2(Hora) is undefined for the type AccessHora
	The method getSegs(Hora) is undefined for the type AccessHora
	The method getSegs(Hora) is undefined for the type AccessHora */ 
}
}
