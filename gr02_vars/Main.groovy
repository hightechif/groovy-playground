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
    }
}