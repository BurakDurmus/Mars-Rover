package com.burak.rover;

public interface Position {

	public static final class Coordinate {
		int coordinate = 0;

		public Coordinate(int coordinate) {
			this.coordinate = coordinate;
		}
		//These methods will run (they are increment and decrement) when rover move. 
		protected void increment() {
			coordinate++;
		}

		protected void decrement() {
			coordinate--;
		}

		public int getCoordinate() {
			return coordinate;
		}
	}
	
	// Describe how to behave rover
	public enum Direction {
		
		NORTH {
			@Override
			public Direction right() {
				return EAST;
			}

			@Override
			public Direction left() {
				return WEST;
			}
		},

		EAST {
			@Override
			public Direction right() {
				return SOUTH;
			}

			@Override
			public Direction left() {
				return NORTH;
			}
		},

		SOUTH {
			@Override
			public Direction right() {
				return WEST;
			}

			@Override
			public Direction left() {
				return EAST;
			}
		},

		WEST {
			@Override
			public Direction right() {
				return NORTH;
			}

			@Override
			public Direction left() {
				return SOUTH;
			}
		};

		public abstract Direction right();

		public abstract Direction left();
	}

	public Coordinate getX();
	
	public Coordinate getY();

	public Direction getDirection();

	@Override
	public String toString();

}