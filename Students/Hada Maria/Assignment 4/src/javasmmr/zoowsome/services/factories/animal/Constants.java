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
			public static final String Cow = "Milka";
			public static final String Monkey = "Chewy";
			public static final String Tiger = "Wally";
		}

		public static final class Reptiles {
			public static final String Iguana = "Stan";
			public static final String Turtle = "Forrest G";
			public static final String Viper = "Nagini";
		}

		public static final class Birds {
			public static final String Flamingo = "Pink Flame";
			public static final String Hummingbird = "Hummy";
			public static final String Owl = "Hedwig";
		}

		public static final class Aquatics {
			public static final String Dolphin = "Flipper";
			public static final String Jellyfish = "Sting";
			public static final String Swordfish = "Needle";
		}

		public static final class Insects {
			public static final String Bee = "Beedrill";
			public static final String Beetle = "Heracross";
			public static final String Butterfly = "Butterfree";
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

}
