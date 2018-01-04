/**
* Cat - clasa pisicii. Pisica poate mieuna si prinde soareci
* @author Ticau Vasile
* @since 02.01.2018
*/

public class Cat extends Animal{
	
	/**
	* Nume pisica
	*/
	private String name;

	/**
	* Constructor
	* @param name Nume pisica
	*/
	public Cat(final String name){
		super(name);
	}
	
	/**
	* Mieunatul pisicii
	*/
	@Override
	public void makeSound(){
		System.out.format("%s say : %s", this.getName(), "miau");
	}
	
	/**
	* Prinde soareci
	*/
	public void catchMouse(){
		
	}
	
	/**
	* Seteaza numele pisicii
	* @param name Numele pisicii
	*/
	@Override
	public void setName(final String name){
		this.name = name;
	}	
	
}