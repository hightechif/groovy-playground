class Main {
    static void main(String[] args) {

        // 6. Bitwise and bit shift operators

        // 6.1. Bitwise operators
        /*
         * & bitwise "and"
         * | bitwise "or"
         * ^ bitwise "xor"
         * ~ bitwise negation
         */
        int x = 0b00101010
        assert x == 42
        int y = 0b00001000
        assert y == 8
        println(Integer.toBinaryString(42)) // 0010 1010
        println(Integer.toBinaryString(8))  // 0000 1000
        assert (x & x) == x                 // 0000 1000
        assert (x & y) == y                 // 0010 1010
        assert (x | x) == x                 // 0010 1010
        assert (x | y) == x                 // 0010 1010
        assert (x ^ y) == 0b00100010        // 0010 0010
        assert ~y == -9                     // -9

        // 6.2. Bit shift operators
        assert 12.equals(3 << 2)           
        assert 24L.equals(3L << 3)         
        assert 48G.equals(3G << 4)
        assert 4095 == -200 >>> 20
        assert -1 == -200 >> 20
        assert 2G == 5G >> 1
        assert -3G == -5G >> 1
    }
}