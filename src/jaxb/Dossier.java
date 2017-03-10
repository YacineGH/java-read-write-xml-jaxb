package jaxb;

import java.util.*;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="dossier")
public class Dossier {

	private int dossier_id;
	private String label;
	private Boolean est_cloture;
	
	
	
	public Dossier(){
		
	}
	
	
	
	public Dossier(int dossier_id, String label, Boolean est_cloture) {
		//super();
		this.dossier_id = dossier_id;
		this.label = label;
		this.est_cloture = est_cloture;
	}
	
	@XmlElement(name="dossier_id")
	public int getDossier_id() {
		return dossier_id;
	}
	
	
	public void setDossier_id(int dossier_id) {
		this.dossier_id = dossier_id;
	}
	
	@XmlElement(name="label")
	public String getLabel() {
		return label;
	}
	
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@XmlElement(name="est_cloture")
	public Boolean getEst_cloture() {
		return est_cloture;
	}
	
	public void setEst_cloture(Boolean est_cloture) {
		this.est_cloture = est_cloture;
	}
	
	@Override
	public String toString() {
		return "Dossier [dossier_id=" + dossier_id + ", label=" + label + ", est_cloture=" + est_cloture + "]";
	}
	
}
