import java.util.Scanner; 

public class Hora {
    Scanner read = new Scanner(System.in);
	private int hora;
	private int min;
	private int seg;
	
	public Hora() {
		setHor();
		while(hora >= 24 || hora < 0){
			System.out.println("Insira hora válida: ");
			setHor();
		}
		setMin();
		while(min >= 60 || min < 0){
			System.out.println("Insira minuto válido: ");
			setMin();
		}
		setSeg();
		while(seg >= 60 || seg < 0){
			System.out.println("Insira segundo válido: ");
			setSeg();
		}
	}
	
	public Hora(int h, int m, int s) {
		this.hora = h;
		this.min = m;
		this.seg = s;
	}
	
	public void setHor(int h) {
		this.hora = h;
	}
	
	public void setMin(int m) {
		this.min = m;
	}
	
	public void setSeg(int s) {
		this.seg = s;
	}
	
	public void setHor() {
		int h = read.nextInt();
		setHor(h);
	}
	
	public void setMin() {
		int m = read.nextInt();
		setMin(m);
	}
	
	public void setSeg() {
		int s = read.nextInt();
		setSeg(s);
	}
	
	public int getHor() {
		return hora;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getSeg() {
		return seg;
	}
	
	public String getHora1() {
		String hora1 = hora + ":" + min + ":" + seg ;
		return hora1;
	}
	
	public String getHora2() {
		String hora2;
		if(hora<=12) {
			hora2 = hora + ":" + min + ":" + seg + "AM";
			return hora2;
		}
		else if(hora>12) {
			hora2 = hora + ":" + min + ":" + seg + "AM";
			hora = hora - 12;
			return hora2;
		}
		else{
			return null;
		}
	}
	
	public int getSegundos() {
		int qtsegs = 0;
		for(int i=0;i<hora;i++) {
			for(int j=0;j<min;j++) {
				qtsegs += 60;
			}
		}
		qtsegs =+ seg;
		return qtsegs;
	}
	}
