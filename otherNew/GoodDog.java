class GoodDog {
	private int size;
	
	public void setSize(int s){
		size=s;
		
	}

	public int getSize(){
		return size;
	}
	
	void bark(){
		if(size>60){
			System.out.println("Wooff! Wooff");
		}
		else if (size>14) {
			System.out.println("Ruff! Ruff");
		}
		else {
			System.out.println("Yip! Yip");
		}
	
	}
		
}	
	class GoodDogTestDrive{
		public static void main(String[]args){
		GoodDog one=new GoodDog();
		one.setSize(70);
		GoodDog two=new GoodDog();
		two.setSize(8);
		System.out.println("Dog one: "+one.getSize());
		System.out.println("Dog two: "+two.getSize());
		one.bark();
		two.bark();
		
		}
	
	}
