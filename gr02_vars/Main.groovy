class  Main {
    static void main(String[] args) {
        def x = 3
        println(x)

        x = 4
        println(x)

        def name = 'Fadhil' // a plain string
        def greeting = "Hello ${name}"
        assert greeting.toString()
        println(greeting)

        // primitive types
        byte  byteValue = 1
        char  charValue = 2
        short shortValue = 3
        int   intValue = 4
        long  longValue = 5

        // infinite precision
        BigInteger bigIntegerValue =  6

        // primitive types
        float  floatValue = 1.234
        double doubleValue = 2.345

        // infinite precision
        BigDecimal bigDecimalValue =  3.456

        assert 1e3  ==  1_000.0
        assert 2E4  == 20_000.0
        assert 3e+1 ==     30.0
        assert 4E-2 ==      0.04
        assert 5e-1 ==      0.5
    }
}