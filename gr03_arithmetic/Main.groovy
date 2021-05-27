class Main {
    static void main(String[] args) {
        
        // 3. Arithmetic operators
        
        // 3.1. Normal arithmetic Operators
        assert  1 + 2 == 3
        assert  4 - 3 == 1
        assert  3 * 5 == 15
        assert  3 / 2 == 1.5
        assert 10 % 3 == 1
        assert 2 ** 3 == 8
        assert 9.intdiv(5) == 1
        assert 2.2.plus(1.1) == 3.3
        
        // 3.2. Unary operators
        assert    +3 == 3
        assert    -4 == 0-4
        assert -(-1) == 1

        // Increment (++) and Decrement (--)
        int i = 10
        println(i++) // 10
        println(i)   // 11
        int j = 10
        println(++j) // 11
        println(j)   // 11
        int k = 10
        println(k--) // 10
        println(k)   // 9
        int l = 10
        println(--l) // 9
        println(l)   // 9

        // 3.3. Assignment arithmetic operators
        def a = 4
        a += 3        // a = a + 3
        assert a == 7 // 7
        def b = 5
        b -= 3        // b = b - 3
        assert b == 2 // 2
    }
}