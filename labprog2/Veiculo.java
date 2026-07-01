package labprog2;

public class Veiculo {
	private String placa;
	private String modelo;
	private int horas;
	private float valorh;
	
	public Veiculo(String placa, String modelo, int horas, float valorh) {
		this.placa = placa;
		this.modelo = modelo;
		this.horas = horas;
		this.valorh = valorh;
	}
	public Veiculo() {
		this.placa = "Indefinido";
		this.modelo = "Indefinido";
		this.horas = 0;
		this.valorh = 0;
		
	}
	
	 public String getPlaca() {
	        return placa;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public int getHoras() {
	        return horas;
	    }

	    public float getValorh() {
	        return valorh;
	    }

	    
	    public void setPlaca(String placa) {
	        this.placa = placa;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public void setHoras(int horas) {
	        this.horas = horas;
	    }

	    public void setValorh(float valorh) {
	        this.valorh = valorh;
	    }
	    
	
	    public void exibirDados() {
	        System.out.println("Placa: " + placa);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Horas estacionado: " + horas);
	        System.out.println("Valor por hora: R$ " + valorh);
	    }

	  
	    public double calcularValorEstadia() {
	        return horas * valorh;
	    }  

}
