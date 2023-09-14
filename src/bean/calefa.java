package bean;

import java.io.Serializable;
import java.util.Objects;

public class calefa implements Serializable {
	
	private String nom;
	private int tempe;
	private boolean encendido;
	
	public calefa(){
		nom="CALEFACCION";
		tempe=0;
		encendido=false;
	}
	
	//Kopia eraikitzailea
	calefa(calefa a){
		nom=a.nom;
		tempe=a.tempe;
		encendido=a.encendido;
		
	}
	//Eraikitzaile pertsonalizatua
	public calefa(String n,int t,boolean e){
		nom=n;
		tempe=t;
		encendido=e;
	}
	public calefa(String n){
		nom=n;

	}
	public calefa(boolean en) {
		encendido=en;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTempe() {
		return tempe;
	}

	public void setTempe(int tempe) {
		this.tempe = tempe;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		calefa other = (calefa) obj;
		return Objects.equals(nom, other.nom);
	}
	
}
