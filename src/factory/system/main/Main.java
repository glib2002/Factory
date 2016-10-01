package factory.system.main;

import factory.system.workers.Boss;
import factory.system.workers.Cleaner;
import factory.system.workers.Manager;
import factory.system.workers.Mechanic;

public class Main {
	// Created by Glib
	// Version 1.5
	public static void main(String[] args) {
		Corporation c = new Corporation("G.co", 8, "I", "Viena", "Austria");
		c.start();
	}
}
