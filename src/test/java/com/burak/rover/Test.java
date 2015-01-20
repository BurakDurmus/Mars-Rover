package com.burak.rover;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.burak.rover.Position;
import com.burak.rover.RoversMove;
import com.burak.rover.Position.Direction;
import com.burak.rover.RoversMove.Command;

public class Test extends TestCase {

	public Test() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void testRover1() {

		RoversMove rMove = new RoversMove(new Position.Coordinate(1),
				new Position.Coordinate(2), Direction.NORTH);
		rMove.Commands(new Command[] { Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.MOVE });
		RoversMove rr = new RoversMove(new Position.Coordinate(1),
				new Position.Coordinate(3), Direction.NORTH);
		
		assertEquals(rr.getPosition().toString(), rMove.getPosition()
				.toString());
	}

	public void testRover2() {

		RoversMove rMove = new RoversMove(new Position.Coordinate(3),
				new Position.Coordinate(3), Direction.EAST);
		RoversMove rr = new RoversMove(new Position.Coordinate(5),
				new Position.Coordinate(1), Direction.EAST);
		rMove.Commands(new Command[] { Command.MOVE, Command.MOVE,
				Command.RIGHT, Command.MOVE, Command.MOVE, Command.RIGHT,
				Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE });
		assertEquals(rr.getPosition().toString(), rMove.getPosition()
				.toString());
	}

}
