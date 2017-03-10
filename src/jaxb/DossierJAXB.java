package jaxb;


import java.util.*;
import javax.xml.bind.*;
import java.io.*;

public class DossierJAXB {
	
	
	public void marshall(){
		
		try{
			
			Dossier dossier = new Dossier(20,"label 1",false);
			
			JAXBContext jc=
			JAXBContext.newInstance(Dossier.class);
			
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(dossier, System.out);
			ms.marshal(dossier, new File("src\\data\\dossier.XML") );
			
			
		}catch(JAXBException e){
			
			e.printStackTrace();
		}
		
	}
		
	public void unmarshal(){
		
		try {

			File file = new File("src\\data\\out.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Dossier.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Dossier dossier = (Dossier) jaxbUnmarshaller.unmarshal(file);
			System.out.println(dossier);

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
		
	}
		
		
		 
public void marshallList(){
		
		try{
			
			List<Dossier> listDossiers = new ArrayList<Dossier>();
			
			listDossiers.add(new Dossier(10,"label 1",false));
			listDossiers.add(new Dossier(20,"label 2",true));
			listDossiers.add(new Dossier(30,"label 3",false));
			listDossiers.add(new Dossier(40,"label 4",false));
			listDossiers.add(new Dossier(50,"label 5",true));
			listDossiers.add(new Dossier(60,"label 6",true));
			listDossiers.add(new Dossier(70,"label 7",false));
			listDossiers.add(new Dossier(80,"label 8",true));
			
			
			ListDossier ld = new ListDossier();
			ld.setListDossier(listDossiers);
			
			JAXBContext jc=
			JAXBContext.newInstance(ListDossier.class);
			
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(ld, System.out);
			ms.marshal(ld, new File("src\\data\\listDossier.XML") );
			
			
		}catch(JAXBException e){
			
			e.printStackTrace();
		}
		
	}


public void unmarshalList(){
	
	try {

		File file = new File("src\\data\\input_listDossier.XML");
		JAXBContext jaxbContext = JAXBContext.newInstance(ListDossier.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ListDossier listDossier = (ListDossier) jaxbUnmarshaller.unmarshal(file);
		System.out.println(listDossier);

	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
	
}
	
	
	

}
