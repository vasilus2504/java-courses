/**
* Animal - clasa parinte pentru animale
* @author Ticau Vasile
* @since 02.01.2018
*/

public class Animal implements Pet{
	/**
	* Nume animal
	*/
	private String name;
	
	/**
	* Constructor
	* @param name Numele animalului
	*/
	public Animal(final String name){
		this.name = name;
	}
	
	/**
	* Scoate sunete
	*/
	@Override
	public void makeSound(){
		System.out.format("%s say: %s", this.name, "beep");
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void setName(final String name){
		this.name = name;
	}	
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getName(){
		return this.name;
	}

}