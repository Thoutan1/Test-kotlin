package module.main
import java.util.Scanner

fun hello(){
    println("Before print Hello please enter your name: ")
    val input = Scanner(System.`in`)
    val name = input.next()
    println("Hello welcome back $name \n")
}