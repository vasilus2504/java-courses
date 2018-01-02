/**
*	Class realizare Calculator
*/
public class Calculator{
	/**
	*	Rezultatul calcularii
	*/
	private int result;
	
	/**
	* Sumare argumentelor
	* @param args Argumentii sumei
	*/
	public void add(int ... args){
		for(Integer arg : args){
			this.result += arg;
		}
	}
	
	/**
	* Returneaza rezultatul
	* @return rezultatul calcularii
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
	*	Curatirea rezultatului
	*/
	public void cleanResult(){
		this.result = 0;
	}
}