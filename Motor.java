public class Motor {,
		
	public void berjalan (){
		System.out.println("Motor berjalan dengan kecepatan 40Km/jam");
	}
	public void berhenti (){
		System.out.println("Motor berhenti mendadak");
	}
	public void berbelok (){
		System.out.println("Motor berbelok ke kiri dan ke kanan");
	}
}


class Metik extends Motor {
	public void berjalan(){
	System.out.println("Motor Metik berjalan dengan kecepatan 40Km/jam");
	}
	
	public void berhenti (){
		System.out.println("Motor Metik berhenti mendadak");
	}
	public void berbelok (){
		System.out.println("Motor Metik berbelok ke kiri dan ke kanan");
	}
	
	public void tampilkan() {
			super.berjalan();
			super.berhenti();
			super.berbelok();
	}
	
	public static void main (String [] args){
	Metik m = new Metik();
	m.tampilkan();
	m.berjalan();
	m.berhenti();
	m.berbelok();
	}	
}

class Bebek extends Motor {
	public void berjalan(){
	System.out.println("Motor Bebek berjalan dengan kecepatan 40Km/jam");
	}
	
	public void berhenti (){
		System.out.println("Motor Bebek berhenti mendadak");
	}
	public void berbelok (){
		System.out.println("Motor Bebek berbelok ke kiri dan ke kanan");
	}
	
	public void tampilkan() {
			super.berjalan();
			super.berhenti();
			super.berbelok();
	}
	
	public static void main (String [] args){
	Bebek b = new Bebek();
	b.tampilkan();
	b.berjalan();
	b.berhenti();
	b.berbelok();
	}	
}
