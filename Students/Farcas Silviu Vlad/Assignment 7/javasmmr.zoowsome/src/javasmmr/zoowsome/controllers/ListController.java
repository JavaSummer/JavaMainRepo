package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.*;

public class ListController extends AbstractController{
	
	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);
		listFrame.getRepository(aniRep, animal, empRep, emp);
	}
}
