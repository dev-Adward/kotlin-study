val pet = 1
// top-level
// 코틀린은 탑 레벨에서 변수를 선언 및 사용이 가능하다.

fun main(args: Array<String>) {
    var a : Int= 123
    var b = "adsfda";
    // b처럼 타입이 없어도 코틀린은 자동으로 타입을 추론해준다.

    println(b)

    //val(value) : 불변(Immutable)
    //var(variable) : 가변(Mutable)


    // 코틀린의 기본적인 함수 선언 스타일, 리턴타입은 생략할 수 없다.
    fun sum(a: Int, b: Int) : Int {
        return a + b
    }

    // 표현식 스타일, 리턴타입은 생략 가능하다.
    fun sum2(a: Int, b: Int) : Int = a + b

    // 디폴트 파라미터
    fun greeting(message: String = "안녕하세요!!") {
        println(message)
    }
    // 코틀린 문법. 마치 js에 백틱과 비슷한거같음
    fun log(level: String = "INFO", message: String) {
        println("[$level]$message")
    }

    fun main2( ) {
        log(message = "인포 로그")
        log(level = "DEBUG", "디버그 로그")
        log("WARN", "워닝 로그")
        log(level = "ERROR", message = "에러 로그")
    }

    main2()
}
