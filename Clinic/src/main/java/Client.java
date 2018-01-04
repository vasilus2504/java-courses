/**
* Client - clasa clientului.
* @author Ticau Vasile
* @since 02.01.2018
*/

public class Client{
	/**
	* Realizarea clientului
	*/
	private String id;
	
	/**
	* Realizarea animalului de companie
	*/
	private Pet pet;
	
	/**
	* Constructor
	* @param id ID clientului
	* @param pet Animalul de companie al clientului
	*/
	public Client(String id, Pet pet){
		this.id = id;
		this.pet = pet;
	}
	
	/**
	* Getter getId
	* @return Returneaza ID clientului
	*/
	public String getId(){
		return this.id;
	}
	
	/**
	* Setter setId
	* Set ID clientului
	* @param newId ID nou al clientului
	*/
	public void setId(String newId){
		this.id = newId;
	}
	
	/**
	* Getter getPet
	* @return Returneaza animalul de companie al clientului
	*/
	public Pet getPet(){
		return this.pet;
	}

	/**
	 * Setter setPet
	 * @param pet Client pet
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
