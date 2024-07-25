package main.java.ru.lkodos;

import java.util.Objects;

public class Coordinates {

    public final File file; // горизонталь
    public final Integer rank; // вертикаль

    public Coordinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return file == that.file && Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
