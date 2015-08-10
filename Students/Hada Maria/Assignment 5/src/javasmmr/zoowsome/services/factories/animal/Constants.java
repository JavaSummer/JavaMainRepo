package javasmmr.zoowsome.services.factories.animal;

public class Constants {

	public static final class Species {
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
	}

	public static final class Animals {
		public static final class Mammals {
			public static final String Cow = "COW";
			public static final String Monkey = "MONKEY";
			public static final String Tiger = "TIGER";
		}

		public static final class Reptiles {
			public static final String Iguana = "IGUANA";
			public static final String Turtle = "TURTLE";
			public static final String Viper = "VIPER";
		}

		public static final class Birds {
			public static final String Flamingo = "FLAMINGO";
			public static final String Hummingbird = "HUMMINGBIRD";
			public static final String Owl = "OWL";
		}

		public static final class Aquatics {
			public static final String Dolphin = "DOLPHIN";
			public static final String Jellyfish = "JELLYFISH";
			public static final String Swordfish = "SWORDFISH";
		}

		public static final class Insects {
			public static final String Bee = "BEE";
			public static final String Beetle = "BEETLE";
			public static final String Butterfly = "BUTTERFLY";
		}
	}

	public static final class Employees {
		public static final String Caretaker = "CARETAKER";

		public static final class Caretakers {
			public static final String TCO_SUCCES = "Mission complete. The animal has been taken care of. Now run!";
			public static final String TCO_KILLED = "Mission failed. The caretaker has been killed!";
			public static final String TCO_NO_TIME = "Oops. There is no time to take care of the animal.";
		}
	}

	public static final class XML_TAGS {
		public static final String DISCRIMINANT = "DISCRIMINANT";
		public static final String ANIMAL = "ANIMAL";
	}

}
