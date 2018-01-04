import java.util.ArrayList;
import java.util.List;

/**
* Clinic - clasa clinicii. Clinica are clienti
* @author Ticau Vasile
* @since 02.01.2018
*/

public class Clinic{
	/**
	* Lista clientilor
	*/
	private List<Client> clients;
	
	/**
	* Constructor
	*/
	public Clinic(){
		this.clients = new ArrayList<Client>();
	}
	
	/**
	* Afiseaza lista clientilor
	*/
	public void showDataBase(){
		System.out.println("List of clients:");
		for( Client client : this.clients){
			if(client != null){
				System.out.println("Client "+client.getId()+" has "+client.getPet().getClass().getName()+" "+client.getPet().getName());
			}
		}
	}

	/**
	* Adaugam client
	* @param position Pozitie client
	* @param client Clientul
	*/
	public void addClient(final int position, final Client client){
		this.clients.add(client);
	}
	
	/**
	* Cauta client dupa numele anumalului de companie
	* @param petName Numele animalului de companie
	*/
	public List findClientByPetName(final String petName){
		int cont = 0; // numarul de clienti gasiti dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getPet().getName().equals(petName)){
				cont++;
			}			
		}
		List<Client>foundedClients = new ArrayList<Client>();
		if(cont > 0){
			System.out.println("Founded clients:");
			cont = 0;
			for( Client client : this.clients){
				if(client != null && client.getPet().getName().equals(petName)){
					System.out.println("Pet " + client.getPet().getName() + " belongs " + client.getId());
					foundedClients.add(client);
					cont++;
				}			
			}
		}else{
			System.out.println("Asa animal de companie nu este inregistrat");
		}
		return foundedClients;
	}
	
	/**
	* Cauta animalul de companie dupa numele clientului
	* @param clientId Numele clientului
	*/
	public List findPetByClientId(final String clientId){
		int cont = 0; // numarul de animale de companie gasite dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getId().equals(clientId)){
				cont++;
			}			
		}
		List<Pet> foundedPets = new ArrayList<Pet>();
		if(cont > 0){
			System.out.println("Founded pets:");
			cont = 0;
			for( Client client : this.clients){
				if(client != null && client.getId().equals(clientId)){
					System.out.println("Client " + client.getId() + " has a pet " + client.getPet().getName());
					foundedPets.add(client.getPet());
					cont++;
				}			
			}
		}else{
			System.out.println("Asa client nu este inregistrat");
		}
		return foundedPets;
	}
	
	/**
	* Redactarea numelui clientului cautandul dupa numele anumalului de companie
	* @param petName Nume animal de companie
	* @param newClientId Noul ID al clientului
	*/
	public void editClientName(final String petName, final String newClientId){
		int cont = 0; // numarul de clienti gasiti dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getPet().getName().equals(petName)){
				client.setId(newClientId);
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa animal de companie nu este inregistrat");
		}
	}

	/**
	* Redactarea numelui animalului de companie cautand-ul dupa nume client
	* @param clientId ID client
	* @param newPetName Noul nume al animalului de companie
	*/
	public void editPetName(final String clientId, final String newPetName){
		int cont = 0; // numarul de animale de companie gasite dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getId().equals(clientId)){
				client.getPet().setName(newPetName);
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa client nu este inregistrat");
		}
	}
	
	/**
	* Stergerea clientului cautandul dupa numele anumalului de companie
	* @param petName Numele animalului de companie
	*/
	public void deleteClientByPetName(final String petName){
		int cont = 0; // numarul de clienti gasiti dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getPet().getName().equals(petName)){
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa animal de companie nu este inregistrat");
		}
		for( Client client : this.clients){
			if(client != null && client.getPet().getName().equals(petName)){
				clients.remove(client);
				break;
			}
		}
	}

	/**
	* Stergerea animalului de companie cautand-ul dupa nume client
	* @param clientId ID clientului
	*/
	public void deletePetByClientName(final String clientId){
		int cont = 0; // numarul de animale de companie gasite dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getId().equals(clientId)){
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa client nu este inregistrat");
		}
		List<Client> afterDelListClients = clients;
		for( Client client : this.clients){
			if(client != null && client.getId().equals(clientId)){
				this.clients.remove(client);
				break;
			}
		}
	}
	
	/**
	* Validarea datelor referitor la animalul de companie
	*/
	public void validateByClientId(final String clientId){
		int cont = 0; // numarul de clienti gasiti dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getId().equals(clientId)){
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa client nu este inregistrat");
		}else{
			System.out.println("Asa client este inregistrat");
		}
	}
	
	/**
	* Validarea datelor referitor la animalul de companie
	* @param petName Numele animalului de companie
	*/
	public void validateByPetName(final String petName){
		int cont = 0; // numarul de clienti gasiti dupa acelasi criteriu
		for( Client client : this.clients){
			if(client != null && client.getPet().getName().equals(petName)){
				cont++;
			}			
		}
		if(cont == 0){
			System.out.println("Asa animal de companie nu este inregistrat");
		}else{
			System.out.println("Asa animal de companie este inregistrat");
		}
		
	}
	
	
}
