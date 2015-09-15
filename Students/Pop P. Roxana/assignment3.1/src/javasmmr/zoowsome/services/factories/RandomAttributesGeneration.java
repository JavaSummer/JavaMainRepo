package javasmmr.zoowsome.services.factories;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Water;

public class RandomAttributesGeneration {

	public String getRandomName(String type) throws Exception {
		Random generator = new Random();
		String[][] Names = { { "James", "John", "Robert", "Michael", "William", "David", "Richard", "Paul" },
				{ "Karen", "Bethy", "Amy", "Lucy", "Anna", "Amanda", "Rose", "Kathy" } };

		int maleOrFemale = generator.nextInt(1);
		String name = ((maleOrFemale == 0) ? "Sir " : "Lady ") + Names[maleOrFemale][generator.nextInt(8)]
				+ " of the house ";

		if (Constants.Animals.Aquatics.Catfish.equals(type)) {

			String[] house = { "Loricariidae", "Callichthyidae", "Pimelodidae", "Mochokidae", "Doradidae", "Bagridae",
					"Auchenipteridae", "Pseudopimelodidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {

			String[] house = { "Delphinidae", "Iniidae", "Lipotidae", "Platanistidae", "Pontoporidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {

			String[] house = { "Lamnidae", "Alopias", "Odontaspididae", "Mitsukurina", "Megachasmidae",
					"Pseudocarcharias" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Birds.Duck.equals(type)) {

			name = name + "Anatidae";

		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {

			name = name + "Columbidae ";

		} else if (Constants.Animals.Birds.Sparrow.equals(type)) {

			name = name + "Passeridae";

		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {

			String[] house = { "Hesperiidae", "Papilionidae", "Pieridae", "Lycaenidae", "Riodinidae", "Nymphalidae",
					"Hedylidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {

			String[] house = { "Blaberidae", "Blattellidae", "Blattidae", "Cryptocercidae", "Polyphagidae",
					"Nocticolidae", "Tryonicidae", "Lamproblattidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Insects.Spider.equals(type)) {

			String[] house = { "Liphistiidae", "Mecicobothriidae", "Microstigmatidae", "Hexathelidae", "Dipluridae",
					"Nemesiidae", "Theraphosidae", "Paratropididae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Mammals.Cow.equals(type)) {

			name = name + "Bovidae";

		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {

			String[] house = { "Lemuridae", "Daubentoniidae", "Tarsiidae", "Cebidae", "Aotidae", "Pitheciidae",
					"Atelidae", "Cercopithecidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {

			name = name + "Felidae";

		} else if (Constants.Animals.Reptiles.Crocodiles.equals(type)) {

			name = name + "Crocodylidae";

		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {

			String[] house = { "Amphisbaenidae", "Bipedidae", "Rhineuridae", "Anguidae", "Anniellidae", "Cordylidae",
					"Gerrhosauridae", "Gymnophthalmidae" };
			name = name + house[generator.nextInt(house.length)];

		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {

			String[] house = { "Carettochelyidae", "Cheloniidae", "Chelydridae", "Dermatemydidae", "Dermochelyidae",
					"Emydidae", "Geoemydidae", "Kinosternidae" };
			name = name + house[generator.nextInt(house.length)];
		} else {
			throw new Exception("Invalid anuimal exception");
		}

		return name;
	}

	public Integer getRandomNrOfLegs(int infLim, int supLim) throws Exception {

		Random generator = new Random();
		return new Integer(infLim + generator.nextInt(supLim + 1));

	}

	// specific attributes for the aquatics are being generated
	public Integer getRandomSwimDepth() {

		Random generator = new Random();
		return generator.nextInt(500);
	}

	public Water getRandomWaterType() {

		Random generator = new Random();
		return (generator.nextInt(1) == 1) ? Water.FRESHWATER : Water.SALTWATER;
	}

	// specific attributes for the birds are being generated
	public Integer getRandomFlightAltitude() {

		Random generator = new Random();
		return generator.nextInt(2000);
	}

	public Boolean getRandomMigrates() {

		Random generator = new Random();
		return (generator.nextInt(1) == 1) ? true : false;
	}

	// specific attributes for the insects are being generated

	public Boolean getRandomCanFly() {

		Random generator = new Random();
		return (generator.nextInt(1) == 1) ? true : false;
	}

	public Boolean getRandomIsDangerous() {

		Random generator = new Random();
		return (generator.nextInt(1) == 1) ? true : false;
	}

	// specific attributes for the mammals are being generated

	public Integer getRandomBodyTemp() {

		Random generator = new Random();
		return generator.nextInt(7) + 35;
	}

	public Integer getRandomHairPercentage() {

		Random generator = new Random();
		return generator.nextInt(100);
	}

	// specific attributes for the reptiles are being generated

	public Boolean getRandomLaysEggs() {

		Random generator = new Random();
		return (generator.nextInt(1) == 1) ? true : false;
	}
}
