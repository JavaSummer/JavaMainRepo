package javasmmr.zoosome.services.factories;

public final class NameGenerator {
	private static final double secondNameChance = 0.45;
	private static final double secondNameSpecialConnector = 0.3;
	private static final double thirdNameChace = 0.1;
	private static final double titleChance = 0.05;
	
	public static String getUsualName() {
		String name = draftCommonName();
		
		if (roll(secondNameChance)) {
			if (roll(secondNameSpecialConnector)) {
				name += "-";
			} else {
				name += " ";
			}

			name += draftCommonName();
			
			if (roll(thirdNameChace)) {
				name += " " + draftCommonName();
			}
		}
		
		return name;
	}
	
	public static String getRandomName() {
		String name = getUsualName();
		
		name += " the ";
		
		if (roll(titleChance)) {
			name += draftTitle() + " ";
		}
		
		return name;
	}
	
	private static boolean roll(double chance) {
		return (Math.random() <= chance);
	}
	
	private static String draftCommonName() {
		final String[] commonNames = {"James", "John", "Robert", "Michael", 
				"William", "David", "Richard", "Joseph", "Charles", "Thomas", 
				"Christopher", "Daniel", "Matthew", "Donald", "Anthony", 
				"Mark", "Paul", "Steven", "George", "Kenneth", "Andrew", 
				"Edward", "Joshua", "Brian", "Kevin", "Ronald", "Timothy", 
				"Jason", "Jeffrey", "Ryan", "Gary", "Nicholas", "Eric", 
				"Jacob", "Stephen", "Jonathan", "Larry", "Frank", "Scott", 
				"Justin", "Brandon", "Raymond", "Gregory", "Samuel", "Benjamin",
				"Patrick", "Jack", "Dennis", "Alexander", "Jerry", "Tyler", 
				"Henry", "Douglas", "Aaron", "Peter", "Jose", "Walter", "Adam",
				"Zachary", "Nathan", "Harold", "Kyle", "Carl", "Arthur", 
				"Gerald", "Roger", "Keith", "Lawrence", "Jeremy", "Terry", 
				"Albert", "Joe", "Sean", "Willie", "Christian", "Jesse", 
				"Austin", "Billy", "Bruce", "Ralph", "Bryan", "Ethan", "Roy",
				"Eugene", "Jordan", "Louis", "Wayne", "Alan", "Harry", 
				"Russel", "Juan", "Dylan", "Randy", "Philip", "Vincent", 
				"Noah", "Bobby", "Howard", "Gabriel", "Johnny",
				"Bob", "Mario", "Altair", "Gordon", "Freeman", "Shepard", 
				"Roggan", "47", "Dendi", "Nico Bellic", "Forrest"};
		
		return new String(commonNames[(int) (Math.random() * commonNames.length)]);
	}
	
	private static String draftTitle() {
		final String[] titles = {"legend", "awesome", "rabid", "fantastic", 
				"conqueror", "manhunter", "supernatural", "venomous", "king", 
				"archmage", "long range", "renown", "alpha", "epic", "elder",
				"firelord", "funny", "MLG pro", "6k MMR", "mighty", 
				"dragonborn", "feared", "ferocious", "(o_O)"};
		
		return new String(titles[(int) (Math.random() * titles.length)]);
	}
}
