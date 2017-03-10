package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Dossiers")
public class ListDossier {
    
	
	private  List<Dossier> listDossier = new ArrayList<Dossier>();
	
	
    @XmlElement(name="dossier")
	public List<Dossier> getListDossier() {
		return listDossier;
	}

	public void setListDossier(List<Dossier> listDossier) {
		this.listDossier = listDossier;
	}

	@Override
	public String toString() {
		return "ListDossier [listDossier=" + listDossier + "]";
	}
	
	
	
	
	
	
	
}
