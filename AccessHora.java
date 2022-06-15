public class AccessHora {

	public static void main(String[] args) {
		System.out.println("Horário da aula?");
		Hora aula = new Hora();
		Hora aula2 = new Hora(21, 15, 00);
		
		System.out.println(getHora1(aula));
		System.out.println(getHora2(aula2));
		System.out.println(getSegs(aula));
		System.out.println(getSegs(aula2));
}
}
