package javasmmr.zoowsome.services.factories;

public final class Constants {

	public static final class Species {

		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
		
		public static final String[] getAllConstants(){
			String constants[] = {Aquatics,Birds,Insects,Mammals,Reptiles};
			return constants;
		}
	}

	public static final class Animals {
		public static final class Mammals {
			public static final String Cow = "Cow";
			public static final String Monkey = "Monkey";
			public static final String Tiger = "Tiger";
		}

		public static final class Reptiles {
			public static final String Crocodiles = "Crocodiles";
			public static final String Lizard = "Lizard";
			public static final String Turtle = "Turtle";
		}

		public static final class Birds {
			public static final String Duck = "Duck";
			public static final String Pigeon = "Pigeon";
			public static final String Sparrow = "Sparrow";
		}

		public static final class Aquatics {

			public static final String Catfish = "Catfish";
			public static final String Dolphin = "Dolphin";
			public static final String Shark = "Shark";
		}

		public static final class Insects {

			public static final String Butterfly = "Butterfly";
			public static final String Cockroach = "Cockroach";
			public static final String Spider = "Spider";
		}
	}

	public static final class EmployeesType {

		public static final String Caretakers = "Caretaker";

		public static final String[] getAllConstants(){
			String constants[] = {Caretakers};
			return constants;
		}
	}

	public static final class Employees {
		
		public static final class Caretakers {
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}
	}
	
	public static final class XML_TAGS {

		public static final String DISCRIMINANT = "DISCRIMINANT";
		public static final String ANIMAL = "ANIMAL";
		public static final String EMPLOYEE = "EMPLOYEE";
	}
	
	public static final class Frames{

		public static final int HEIGHT = 500;
		public static final int WIDTH = 700;
	}
}
