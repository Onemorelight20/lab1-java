package ua.boretskyi.film;

public class Main {

	public static void main(String[] args) {

		Film notDefinedFilm = new Film();
		System.out.println(notDefinedFilm);
		
		Film joker = new Film("Joker", 160, 230);
		System.out.println(joker);
		
		Film platform = new Film("Platform", 135, 88, 2019, "Galder Gaztelu-Urrutiatxed", Genre.SCIENCE_FICTION);
		System.out.println(platform);
			
	}

}
