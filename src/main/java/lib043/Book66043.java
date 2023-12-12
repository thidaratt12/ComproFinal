package lib043;

import util66043.U66043;

import java.util.Objects;

public class Book66043 {
    private final long isbn043;
    private final String title043;
    private final double price043;

    public Book66043(String title043, double price043) {
        if (title043 == null || title043.isBlank() || price043 <= 0.0) {
            throw new IllegalArgumentException("Invalid Initialization");
        }
        this.title043 = title043;
        this.price043 = price043;
        var temp = U66043.unique043();
        var digit = U66043.checkDigit043(temp);
        isbn043 = temp * 10 + digit;
    }

    public long getIsbn043() {
        return isbn043;
    }

    public String getTitle043() {
        return title043;
    }

    public double getPrice043() {
        return price043;
    }

    @Override
    public String toString() {
        return String.format("Book(%02d-%05d-%04d-%1d,%s,%.2f)",
                isbn043 / 1_00000_0000_0L % 1_00,
                isbn043 / 1_0000_0 % 1_00000,
                isbn043 / 10 % 1_0000,
                isbn043 % 1_0,
                title043,
                price043);
    }
    @Override
    public int hashCode() {
      return (int) isbn043;
    }
    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }
}