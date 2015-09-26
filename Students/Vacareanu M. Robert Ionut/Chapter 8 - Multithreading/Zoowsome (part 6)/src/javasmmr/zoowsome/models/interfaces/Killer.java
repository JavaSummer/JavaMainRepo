package javasmmr.zoowsome.models.interfaces;

public interface Killer {
	 // Because it's an interface, is already public
	boolean kill() throws Exception;

	double getPredisposition() throws Exception;
}
