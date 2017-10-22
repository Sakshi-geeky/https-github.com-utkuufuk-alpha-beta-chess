package com.example.chess.core.model;

public class Board
{
    public static final int LENGTH = 8;

    private Square[][] squares;
    private Army whiteArmy;
    private Army blackArmy;

    public Board(Army whiteArmy, Army blackArmy)
    {
        this.whiteArmy = whiteArmy;
        this.blackArmy = blackArmy;
        squares = new Square[LENGTH][LENGTH];

        for (int r = 0; r < LENGTH; r++)
        {
            for (int c = 0; c < LENGTH; c++)
            {
                squares[r][c] = new Square(this, r, c);
            }   
        }
    }

    public Army getArmy(Side side)
    {
        return side == Side.WHITE ? whiteArmy : blackArmy;
    }

    public Square getSquare(int row, int col)
    {
        return squares[row][col];
    }
}
