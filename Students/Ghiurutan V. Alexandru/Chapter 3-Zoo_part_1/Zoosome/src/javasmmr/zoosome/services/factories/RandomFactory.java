package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.*;

public class RandomFactory extends SpeciesFactory {
	private String getSpecies(int species) throws Exception {
		String s = null;
		switch (species) {
		case 1:
			s = "Mammal";
			break;
		case 2:
			s = "Insect";
			break;
		case 3:
			s = "Aquatic";
			break;
		case 4:
			s = "Bird";
			break;
		case 5:
			s = "Reptile";
			break;
		default:
			throw new Exception("Invalid species!");
		}
		return s;
	}

	private Animal getMammal(int anim) throws Exception {
		switch (anim) {
		case 1:
			return new Tiger();
		case 2:
			return new Cow();
		case 3:
			return new Monkey();
		default:
			throw new Exception("Invalid animal!");
		}
	}

	private Animal getReptile(int anim) throws Exception {
		switch (anim) {
		case 1:
			return new Snake();
		case 2:
			return new Crocodile();
		case 3:
			return new Turtle();
		default:
			throw new Exception("Invalid animal!");
		}
	}

	private Animal getInsect(int anim) throws Exception {
		switch (anim) {
		case 1:
			return new Butterfly();
		case 2:
			return new Cockroach();
		case 3:
			return new Spider();
		default:
			throw new Exception("Invalid animal!");
		}
	}

	private Animal getBird(int anim) throws Exception {
		switch (anim) {
		case 1:
			return new Sparrow();
		case 2:
			return new Penguin();
		case 3:
			return new Vulture();
		default:
			throw new Exception("Invalid animal!");
		}
	}

	private Animal getAquatic(int anim) throws Exception {
		switch (anim) {
		case 1:
			return new Seal();
		case 2:
			return new Dolphin();
		case 3:
			return new Frog();
		default:
			throw new Exception("Invalid animal!");
		}
	}

	private Animal getAnim(int species, int anim) throws Exception {
		switch (getSpecies(species)) {
		case "Mammal":
			return getMammal(anim);
		case "Reptile":
			return getReptile(anim);
		case "Insect":
			return getInsect(anim);
		case "Bird":
			return getBird(anim);
		case "Aquatic":
			return getAquatic(anim);
		default:
			throw new Exception("Invalid species!");
		}
	}

	public Animal getAnimal(String type) throws Exception {
		int species = (int) (Math.random() * 5) + 1;
		int anim = (int) (Math.random() * 3) + 1;
		return getAnim(species, anim);
	}
}
