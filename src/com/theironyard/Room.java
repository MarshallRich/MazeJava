package com.theironyard;

/**
 * Created by MacLap on 3/29/16.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean isStart = false;
    boolean isEnd = false;


    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
