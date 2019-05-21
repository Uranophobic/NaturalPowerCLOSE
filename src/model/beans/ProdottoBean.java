package model.beans;

public class ProdottoBean {

	public ProdottoBean() {}
	
	public String getIdProdotto() {
		return idProdotto;
	}
	
	public void setIdProdotto(String idProdotto) {
		this.idProdotto = idProdotto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getTipoProdotto() {
		return tipoProdotto;
	}
	
	public void setTipoProdotto(String tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public int getSconto() {
		return sconto;
	}
	
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	public String getImmaginePath(){
		return immaginePath;
	}
	
	public void setImmaginePath(String immaginePath){
		immaginePath = immaginePath;
	}

	public String toString() {
		return "PRODOTTO [IDProdotto=" + idProdotto + ", Nome=" + nome + ", Descrizione=" + descrizione
				+ ", TipoDiProdotto=" + tipoProdotto + ", Prezzo=" + prezzo + ", IVA=" + iva + ", Sconto=" + sconto+ ", PathImmagine=" + immaginePath + "]";
	}

	private String idProdotto, nome, descrizione, tipoProdotto, immaginePath;
	private double prezzo, iva;
	private int sconto;

}