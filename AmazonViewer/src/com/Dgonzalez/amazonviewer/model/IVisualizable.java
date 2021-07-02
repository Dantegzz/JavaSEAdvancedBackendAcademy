package com.Dgonzalez.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method captures the time it takes to view media
	 * 
	 * @param dateI It is an object {@code Date} containing the exact time.
	 * @return Retutns captured date and time.
	 * */
	Date startToSee(Date dateI);
	
	
	/**
	 * This method caputres initial and final date and time.
	 * 
	 * @param dateI It is an object {@code Date} with initial time.
	 * @param dateF It is an object {@code Date} with the final time.
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
