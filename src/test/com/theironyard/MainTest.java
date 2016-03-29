package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by MacLap on 3/29/16.
 */
public class MainTest {

    @Test
    public void testCreateRooms(){
        ArrayList<ArrayList<Room>> rooms = Main.createRooms();

        Assert.assertTrue(rooms.size() == 10);
    }

    @Test
    public void testPossiblyNeighbors(){
        ArrayList<ArrayList<Room>> rooms = Main.createRooms();

        ArrayList<Room> neighbors = Main.possiblyNeighbors(rooms, 0, 0);

        Assert.assertTrue(neighbors.size() == 2);
    }

    @Test
    public void testRandomNeighbor () {
        ArrayList<ArrayList<Room>> rooms = Main.createRooms();


        Room neighbor = Main.randomNeighbors(rooms, 0, 0);

        Assert.assertTrue(neighbor == rooms.get(0).get(1) || neighbor == rooms.get(1).get(0));
    }

    @Test
    public void testTearDownWalls() {
        ArrayList<ArrayList<Room>> rooms = Main.createRooms();

        Main.tearDownWall(rooms.get(0).get(0), rooms.get(1).get(0));

        Assert.assertTrue(rooms.get(0).get(0).hasBottom == false);
    }

    @Test
    public void testCreateMaze() {
        ArrayList<ArrayList<Room>> rooms = Main.createRooms();

        Main.createMaze(rooms, rooms.get(0).get(0));

        Assert.assertTrue(rooms.size() == 10);
    }

}