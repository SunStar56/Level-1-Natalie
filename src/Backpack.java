public class Backpack {
	
	private Pencil pencil;
	private Ruler ruler;
	private Textbook textbook;

	Backpack(){
		System.out.println("Nice Backpack");
	}
	
	public static void main (String[] args){
		/* Your mission is to get to school, but first you need to get all of your supplies into your backpack. */
		Backpack bp = new Backpack();
		Textbook textbook = new Textbook();
		textbook.read();
		textbook.putIn(bp);
		Pencil pencil = new Pencil();
		pencil.write("This is a message that my pencil wrote.");
		pencil.putIn(bp);
		Ruler ruler = new Ruler();
		ruler.measure();
		ruler.putIn(bp);
		bp.goToSchool();
	}
	

	
	public void goToSchool(){
		if(pencil == null || ruler == null || textbook == null){
			System.err.println("You are not ready for school");
		}else{
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply {
	protected String name;
	public void putIn(Backpack bp){
		System.out.println(this.name + " was put into your backpack.");
	}
}

class Pencil extends Supply {
	
	Pencil(){
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}
	
	public void write(String writing){
		System.out.println(writing);
	}
}


class Ruler extends Supply {

	Ruler(){
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}
	
	public void measure(){
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply{

	Textbook(){
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}
	
	public void read(){
		System.out.println("The history of Iceland is long and interesting");
	}
}