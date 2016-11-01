class Dog {
	String name;
	public static void main(String[]args){
	//make a Dog object and access it
	Dog dog1=new Dog();
	dog1.name="Tasha";
	
	//now make a Dog array
	Dog[]myDogs=new Dog[3];
	//and put some dogs in it
	myDogs[0]=new Dog();
	myDogs[1]=new Dog();
	myDogs[2]=dog1;
	
	//now access the Dogs using the array references
	myDogs[0].name="Fredo";
	myDogs[1].name="Kaka";
	
	System.out.println("last dog's name is "+myDogs[2].name);
	
	//looping the array and telling all dogs to bark
	
		int x=0;
		while(x<myDogs.length){
		myDogs[x].bark();
		x=x+1;
		}
	}
	public void bark(){
	System.out.println(name+" says RUFF!");
	
	}
	
}