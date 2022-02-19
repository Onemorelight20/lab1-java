package ua.boretskyi.film;

public record Film(String name, int durationInMinutes, int numberOfReviewsOnIMDB, int year, String produсer,
		Genre genre) {

	private static final String MAIN_AWARD = "Oscar";

	public Film() {
		this("Not defined", 0, 0);
	}

	public Film(String name, int durationInMinutes, int numberOfReviewsOnIMDB) {
		this(name, durationInMinutes, numberOfReviewsOnIMDB, 0, "Not defined", Genre.NONE);
	}

	@Override
	public String toString() {
		return String.format(
				"Film: name - %s, duration in minutes - %d, number of revieves on IMDB - %d,"
						+ "year - %d, producer - %s, genre - %s",
				name, durationInMinutes, numberOfReviewsOnIMDB, year, produсer, genre);
	}

	public static String getMainAwardName() {
		return MAIN_AWARD;
	}
}

enum Genre {
	NONE, COMEDY, HORROR, SCIENCE_FICTION, THRILLER
}
