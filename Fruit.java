package Exe4_6;

public abstract class Fruit {

	private String name;
	private String size;
    
    	public Fruit(String name, String size){//constructor with 2 arguments 	
    	this.name = name;
    	this.size = size;
    }
    	
    	public String getName(){
    	    return this.name;
    	}
    	
    	public String getSize(){
    	    return this.size;
    	}
    	
    	public void printData(){
    	    System.out.println("");;
    	}
    	
    	
    	public abstract double total();
    	public abstract double mass();
    	public abstract String toString();
}
