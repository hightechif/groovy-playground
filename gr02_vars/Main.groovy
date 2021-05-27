class  Main {
    static void main(String[] args) {
        def simpleVariable = 3
        println(simpleVariable)

        // Groovy is a dynamic-typed language
        simpleVariable = "Three"
        println(simpleVariable)

        def (String a, int b, double c) = [30,40,50]
        println(a)
        println(b)
        println(c)

        def name = 'Fadhil' // a plain string
        def greeting = "Hello ${name}"
        println(greeting)

        // primitive types
        byte  byteValue = 1   // -128 ... 127
        short shortValue = 12  // -32768 ... 32767
        int   intValue = 1997    // -2145483648 ... 2145483647
        long  longValue = 10_000   // -9223372036854775808 ... 9223372036854775807
        char  charValue = 'a'   // 'a' '*' 'A' 'c'
        // infinite precision
        BigInteger bigIntegerValue = 6

        // Byte
        print(byteValue.getClass().getName())
        print("     ")
        print(Byte.MIN_VALUE)
        print(" ... ")
        println(Byte.MAX_VALUE)

        // Short
        print(shortValue.getClass().getName())
        print("    ")
        print(Short.MIN_VALUE)
        print(" ... ")
        println(Short.MAX_VALUE)

        // Integer
        print(intValue.getClass().getName())
        print("  ")
        print(Integer.MIN_VALUE)
        print(" ... ")
        println(Integer.MAX_VALUE)

        // Long
        print(longValue.getClass().getName())
        print("     ")
        print(Long.MIN_VALUE)
        print(" ... ")
        println(Long.MAX_VALUE)

        // Char
        println(charValue.getClass().getName())

        // Big Integer
        println(bigIntegerValue.getClass().getName())

        // primitive types
        float  floatValue = 1.234F // 1.4E-45 ... 3.4028235E38
        double doubleValue = 2.345 // 4.9E-324 ... 1.7976931348623157E308
        // infinite precision
        BigDecimal bigDecimalValue =  3.456 //

        // Float
        print(floatValue.getClass().getName())
        print("     ")
        print(Float.MIN_VALUE)
        print(" ... ")
        println(Float.MAX_VALUE)

        // Double
        print(doubleValue.getClass().getName())
        print("    ")
        print(Double.MIN_VALUE)
        print(" ... ")
        println(Double.MAX_VALUE)

        // Big Decimal
        println(bigDecimalValue.getClass().getName())

        // Boolean
        boolean flag = true
        println(flag.getClass().getName())

        // String
        String language = "Groovy"
        println(language.getClass().getName())
        
        // Another way to delcare data type
        def newByte = (byte) 10
    }
}