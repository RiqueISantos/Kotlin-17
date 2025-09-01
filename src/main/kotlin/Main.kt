package org.example

fun main() {
    print("Informe a quantidade de cigarros fumados por dia: ");
    val cigarette = readlnOrNull()?.toIntOrNull();

    print("Informe a quantidade de anos que você fuma: ");
    val year = readlnOrNull()?.toIntOrNull();

    if(cigarette!=null && year!=null){
        val cigarettePerYear = cigarette * (year*365);
        val lostMinutes = cigarettePerYear * 10;
        val daysOfLife = lostMinutes / 1440

        println("Você perdeu aproximadamente $daysOfLife dias de vida.");
    }
}