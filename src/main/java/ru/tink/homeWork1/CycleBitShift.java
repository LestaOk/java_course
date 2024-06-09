package ru.tink.homeWork1;

public class CycleBitShift {
    public static int rotateRight(int num, int shift){
        int bits = shiftDefinition(shift);
        return (num >>> shift) | (num << (bits - shift));
    }

    public static int rotateLeft(int num, int shift) {
        int bits = shiftDefinition(shift);
        return (num << shift) | (num >>> (bits - shift));
    }

    private static int shiftDefinition (int shift) {
        int bits = Integer.SIZE;
        return shift % bits;
    }
}
