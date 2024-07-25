package main.java.ru.lkodos.piece;

import main.java.ru.lkodos.Color;
import main.java.ru.lkodos.Coordinates;

public abstract class Piece {
    public final Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
