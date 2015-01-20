package com.burak.rover;

public class GetCurrent implements Position {

	private Coordinate x = null;
	private Coordinate y = null;
	private Direction direction = null;

	public GetCurrent(Coordinate x, Coordinate y, Direction direction) {
		if (x == null || y == null || direction == null) {
			throw new IllegalArgumentException(
					"Position's values can't be null");
		}
		this.direction = direction;
		this.x = x;
		this.y = y;
	}

	protected void setDirectionRight() {
		direction = direction.right();
	}

	protected void setDirectionLeft() {
		direction = direction.left();
	}

	public Coordinate getX() {
		return x;
	}

	public Coordinate getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	// This method will get curren location
	public String toString() {
		return getX().getCoordinate() + " " + getY().getCoordinate() + " "
				+ getDirection().name();//here get enum's name
	}

}