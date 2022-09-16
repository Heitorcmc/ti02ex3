package model;

public class Carro {
	private int ano;
	private String modelo;
	private String marca;
	private double preco;
	
	public Carro() {
		ano = 00;
		modelo = "";
		marca = "";
		preco = 0.00F;
	}

	public Carro(int ano, String modelo, String marca, double preco) {
		setAno(ano);
		setModelo(modelo);
		setMarca(marca);
		setPreco(preco);
	}		
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Carro: " + modelo + "    Marca: " + marca + "   Ano: " + ano + "   Preço: R$ "
				+ preco ;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getModelo() == ((Carro) obj).getModelo());
	}	
}