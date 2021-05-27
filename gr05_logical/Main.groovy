class Main {
    static void main(String[] args) {

        // 5. Logical operators
        // Basic logical operator
        assert !false
        assert true && true
        assert true || false

        // 5.1. Precedence
        assert (!false && false) == false
        assert true || true && false
    }
}