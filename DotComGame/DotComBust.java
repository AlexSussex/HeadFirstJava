import java.util.*;

public class DotComBust{
	//declare and instantiate the variables we need
	private GameHelper helper=new GameHelper();
	//make an ArrayList of DotCom objects 
	private ArrayList<DotCom> dotComList=new ArrayList<DotCom>();
	private int numOfGuesses=0;
	
		private void setUpGame(){
			//make three DotCom objects, give them names and stick them in the ArrayList
			DotCom one=new DotCom();
			one.setName("Pets.com");
			DotCom two=new DotCom();
			two.setName("eToys.com");
			DotCom three=new DotCom();
			three.setName("Go2.com");
			
			dotComList.add(one);
			dotComList.add(two);
			dotComList.add(three);
			//print brief instructions for the user
			System.out.println("Your goal is to sing three dot coms.");
			System.out.println("Pets.com, eToys.com, Go2.com");
			System.out.println("Try to sink them all in the fewest number of guesses");
			//repeat with each DotCom in the list
			for(DotCom dotComToSet:dotComList){
				//ask the helper for a DotCom location
				ArrayList<String> newLocation = helper.placeDotCom(3);
				//call the setter method on this DotCom to give it the location we just got from the helper
				dotComToSet.setLocationCells(newLocation);
			}
		}
		
		private void startPlaying(){
			//as long as the DotCom list is NOT empty
			while(!dotComList.isEmpty()){
			//get user Input
			String userGuess=helper.getUserInput("Enter a guess ");
				//calls our own checkUserGuess method
				checkUserGuess(userGuess);
			}
			//call our own finishGame method
			finishGame();
		}
		
		private void checkUserGuess(String userGuess){
				//increment the number of guesses the user has made
				numOfGuesses++;
				//assume its a miss, unless told otherwise
				String result="miss";
			//repeat with all DotComs in the list
			for(DotCom dotComToTest:dotComList){
				//ask the DotCom to check the user guess, looking for a hit(or kill)
				result=dotComToTest.checkYourself(userGuess);
				if(result.equals("hit")) {
				//get out of the loop early, no point in testing the others
				break;
				}
				if(result.equals("kill")){
					//this guy's dead so take him out of the DotComs list then get out of the loop
					dotComList.remove(dotComToTest);
					break;
				}
				
				}
				System.out.println(result);
			}
			
		
		
		private void finishGame(){
			System.out.println("All Dot Coms are dead! Your stock is now worthless.");
			
			if (numOfGuesses<=18){
				System.out.println("It only took you "+numOfGuesses+ " guesses.");
			}
			else {
				System.out.println("Took you long enough. "+numOfGuesses+" guesses.");
				System.out.println("You finished...but even my granny could've done better :P");
			}
			
		}
		
		public static void main (String[]args){
			//create the game object
			DotComBust game=new DotComBust();
			//tells the game object to set up the game
			game.setUpGame();
			//tell the game object to start the main game play loop (keeps asking for user input and checks the guesses)
			game.startPlaying();
		}
}