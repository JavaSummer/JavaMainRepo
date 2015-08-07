package javasmmr.zoosome.services.factories;

import org.omg.CORBA.MARSHAL;

public final class Constants {
	
	public static final class Species {
		public static final String MAMMAL = "Mammal";
		public static final String REPTILE = "Reptile";
		public static final String BIRD = "Bird";
		public static final String AQUATIC = "Aquatic";
		public static final String INSECT = "Insect";
		public static final String SIEGE = "Siege";
		
		public static final String[] SPECIES = {MAMMAL, REPTILE, BIRD, AQUATIC, INSECT, SIEGE};
		public static final int getCode(String species) {
			
			for (int i = 0; i < SPECIES.length; i++) {
				if (SPECIES[i].equals(species)) {
					return i;
				}
			}
			
			return -1;
		}
	}
	
	public static final class Animals {
		
		public static final class Mammal {
			public static final String BEAR = "BEAR";
			public static final String KANGAROO = "KANGAROO";
			public static final String WHALE = "WHALE";
			public static final String RHINOCEROS = "RHINOCEROS";
			
			public static final String[] MAMMAL = {BEAR, KANGAROO, WHALE, RHINOCEROS};
		}
		
		public static final class Reptile {
			public static final String LIZARD = "LIZARD";
			public static final String TURTLE = "TURTLE";
			public static final String CROCODILE = "CROCODILE";
			public static final String DRAGON = "DRAGON";
			
			public static final String[] REPTILE = {LIZARD, TURTLE, CROCODILE, DRAGON};
		}
		
		public static final class Bird {
			public static final String DOVE = "DOVE";
			public static final String OSTRICH = "OSTRICH";
			public static final String EAGLE = "EAGLE";
			public static final String HUMMINGBIRD = "HUMMINGBIRD";
			
			public static final String[] BIRD = {DOVE, OSTRICH, EAGLE, HUMMINGBIRD};
		}
		
		public static final class Aquatic {
			public static final String BASS = "BASS";
			public static final String CLOWNFISH = "CLOWNFISH";
			public static final String SURGEONFISH = "SURGEONFISH";
			public static final String LIONFISH = "LIONFISH";
			
			public static final String[] AQUATIC = {BASS, CLOWNFISH, SURGEONFISH, LIONFISH};
		}
		
		public static final class Insect {
			public static final String BEETLE = "BEETLE";
			public static final String SCORPION = "SCORPION";
			public static final String MANTIS = "MANTIS";
			public static final String DRAGONFLY = "DRAGONFLY";
			
			public static final String[] INSECT = {BEETLE, SCORPION, MANTIS, DRAGONFLY};
		}
		
		public static final class Siege {
			public static final String RAM = "RAM";
			public static final String MANGONEL = "MANGONEL";
			public static final String BALLISTA = "BALLISTA";
			public static final String TREBUCHET = "TREBUCHET";
			
			public static final String[] SIEGE = {RAM, MANGONEL, BALLISTA, TREBUCHET};
		}
		
		public static final String[][] SPECIES_TYPE = {Mammal.MAMMAL, Reptile.REPTILE, 
				Bird.BIRD, Aquatic.AQUATIC, Insect.INSECT, Siege.SIEGE};
	}
}
