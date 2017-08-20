import javax.swing.JOptionPane;

public class MethodWorksheets {

public static void main(String[] args) {
	int eggsInt;
	whichPresent(JOptionPane.showInputDialog("METHOD 1 - What is your friend's name?"));
	getMyLuckyNumber(JOptionPane.showInputDialog("METHOD 2 - What is your name?"));
	doPigsEat(JOptionPane.showInputDialog("What are you trying to feed this pig?"));
	eggsMomWants(JOptionPane.showInputDialog("How many eggs does Mom want?"));
}
 static String whichPresent(String friendName) {
 if (friendName.equals("")) {
	 System.out.println("You do not have a friend.  Therefore, you cannot tell what they would like.");
	 return "none";
}else if(friendName.length() > 5) {
	System.out.println(friendName + " wants Toy1");
	return "toy1";
}else if (friendName.length() < 5) {
	System.out.println(friendName + " wants Toy2");
	return "toy2";
}else {
	System.out.println(friendName + " wants Toy3");
	return "toy3";
}
}

//2. Use this method to find out if pigs can eat bananas.
static boolean doPigsEat(String food) {
	if(food.equals("roots")) {
		System.out.println("Yes, he'll eat it.");
		return true;}
	
	else {
		System.out.println("No, the pig will not eat that.  Quit trying to feed it " + food + ".");
		return false;	
	}
	
}

//3. Finish this method.
static int getMyLuckyNumber(String name) {
	System.out.println("Your lucky number is " + name.length() + ".");
	return name.length();

}

//4. Use these methods to figure out how many eggs you need to buy for your family.
static int eggsMomWants(String eggs) {
	System.out.println("Mom wants " + eggs + " eggs.");

	return 12;
	
}
int eggsDadWants(String eggs) {
	System.out.println("Dad wants " + eggs + " eggs.");
	return 12;
}
int eggsBabyWants(String eggs) {
	System.out.println("The baby wants no eggs, as he can't eat them or have the thought process to want them.");
	return 12;
}


//5. Use this method to print out the average height for a person who is your age.
int getAverageHeight(int age) {
	if (age > 100)
		return 34;
if (age > 50)
return 30;
if (age < 10) 
return 20;
}

}
