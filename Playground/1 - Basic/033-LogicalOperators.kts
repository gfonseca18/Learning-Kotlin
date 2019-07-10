/*

033 Logical Operators AND OR NOT

|| - OR  --> Only one of side needs to be true, for the whole expression
&& - AND --> Both have to be TRUE in order for us to get a True expression
!  - NOT

*/

var a = 21
var b = 2
var c = 21

if (a >= b || b <= a) {
    println("A: is $a")
} else {
    println("B: is $b")
}

if (a == b && b == a && c == a && c == b) {
    println("A: $a, B: $b, C: $c - Have same value")
}
