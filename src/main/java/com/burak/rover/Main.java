package com.burak.rover;

import com.burak.rover.Position;
import com.burak.rover.RoversMove;
import com.burak.rover.Position.Direction;
import com.burak.rover.RoversMove.Command;
import org.apache.log4j.Logger;


public class Main {
	private static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		// Test 1,2,N LMLMLMLMM
		RoversMove rover1 = new RoversMove(new Position.Coordinate(1),
				new Position.Coordinate(2), Direction.NORTH);
		rover1.Commands(new Command[] { Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.MOVE });
		System.out.println(rover1.getPosition());
		//logger.error("Rover1 Error Message");
		
		
		// Test 3,3,E MMRMMRMRRM
		RoversMove rover2 = new RoversMove(new Position.Coordinate(3),
				new Position.Coordinate(3), Direction.EAST);
		rover2.Commands(new Command[] { Command.MOVE, Command.MOVE,
				Command.RIGHT, Command.MOVE, Command.MOVE, Command.RIGHT,
				Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE });
		System.out.println(rover2.getPosition());
		//logger.error("Rover2 Error Message");
	}

}