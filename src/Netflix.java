public class Netflix {
	public static void main(String[] args) {
		Movie tw = new Movie("Twilight", 2);
		Movie hp = new Movie("Harry Potter", 5);
		Movie lotr = new Movie("Lord of the Rings", 4);
		Movie doc = new Movie("Water - A Documentary", 3);
		Movie rhf = new Movie("Random Horror Film", 1);
		System.out.println(tw.getTicketPrice());
		System.out.println(hp.getTicketPrice());
		System.out.println(lotr.getTicketPrice());
		System.out.println(doc.getTicketPrice());
		System.out.println(rhf.getTicketPrice());

		NetflixQueue nq = new NetflixQueue();
		nq.addMovie(tw);
		nq.addMovie(hp);
		nq.addMovie(lotr);
		nq.addMovie(doc);
		nq.addMovie(rhf);
		nq.sortMoviesByRating();
		nq.printMovies();
		System.out.println("The best movie is " + nq.getBestMovie() + ".");
		System.out.println("The second best movie is " + nq.getMovie(1) + ".");
		System.out.println("The third best movie is " + nq.getMovie(2) + ".");
		System.out.println("The fourth best movie is " + nq.getMovie(3) + ".");
		System.out.println("The WORST movie is " + nq.getMovie(4) + ".");
	}
}
