class Main {
    static void main(String[] args) {

        // 7. Conditional Operators
        // 7.1. Not operator
        assert (!true) == false
        assert (!'foo') == false
        assert (!'') == true

        // 7.2. Ternary operator
        def x = (byte) 8
        def isEven = (x % 2 == 0) ? "x is even" : "x is odd"
        println(isEven)

        // 7.3. Elvis operator
        def username
        def displayName = username ?: 'Anonymous'
        println(displayName)
    }
}