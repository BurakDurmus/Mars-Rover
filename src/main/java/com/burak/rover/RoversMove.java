package com.burak.rover;

import com.burak.rover.Position.Coordinate;
import com.burak.rover.Position.Direction;

public class RoversMove {
	private GetCurrent position = null;

	// Describe how to behave rover when became commands
	public enum Command {
		RIGHT, LEFT, MOVE; // Describe our command here
		private void change(GetCurrent position) {
			switch (this) {
			case RIGHT:
				position.setDirectionRight();
				break;
			case LEFT:
				position.setDirectionLeft();
				break;
			case MOVE:
				switch (position.getDirection()) {
				case NORTH:
					position.getY().increment();//if command became when we on N we must be increment y coordinate
					break;
				case EAST:
					position.getX().increment();//if command became when we on E we must be increment x coordinate
					break;
				case SOUTH:
					position.getY().decrement();//if command became when we on S we must be decrement y coordinate
					break;
				case WEST:
					position.getX().decrement();//if command became when we on W we must be decrement x coordinate
				}
			}
		}
	};

	public RoversMove(Coordinate x, Coordinate y, Direction direction) {
		this.position = new GetCurrent(x, y, direction);
	}

	public void Commands(Command[] commands) {
		for (int i = 0; i < commands.length; i++) {
			commands[i].change(position);		}
	}

	public Position getPosition() {
		return position; 
	}
}