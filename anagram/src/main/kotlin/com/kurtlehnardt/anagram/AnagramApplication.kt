package com.kurtlehnardt.anagram

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AnagramApplication

fun main(args: Array<String>) {
    print("1 This should be true: " +  isAnagramV2("TomMarvoloRiddle","IAmLordVoldemort"))
    print("\n")
    print("2 This should be false: " + isAnagramV2("harrypotter","jarjarbinks"))
    print("\n")
    print("3 This should be true: " + "anagram, " + "nag a ram " + isAnagramV2("anagram","nag a ram"))
    print("\n")
    print("4 This should be true: " + "below, " + "elbow " + isAnagramV2("below","elbow"))
    print("\n")
    print("5 This should be true: " + "study, " + "dusty " + isAnagramV2("study","dusty"))
    print("\n")
    print("6 This should be true: " + "night, " + "thing " + isAnagramV2("night","thing"))
    print("\n")
    print("7 This should be true: " + "act, " + "cat " + isAnagramV2("act","cat"))
    print("\n")
    print("8 This should be false, s is repeated twice,  "+ "dessert, " + "stressed " + isAnagramV2("dessert","stressed"))
    print("\n")
    print("9 This should be true: " + "bad credit, " + "debit card " + isAnagramV2("bad credit","debit card"))
    print("\n")
    print("10 This should be true: " + "gainly, " + "laying " + isAnagramV2("gainly","laying"))
    print("\n")
    print("11 This should be true: " + "conversation, " + "voice rants on " + isAnagramV2("conversation","voice rants on"))
    print("\n")
    print("12 This should be true: " + "eleven plus two, " + "twelve plus one " + isAnagramV2("eleven plus two","twelve plus one"))
    print("\n")
    print("13 This should be true: " + "they see, " + "the eyes " + isAnagramV2("they see","the eyes"))
    print("\n")
    print("14 This should be true: " + "funeral, " + "real fun " + isAnagramV2("funeral","real fun"))
    print("\n")
    print("15 This should be true: " + "meteor, " + "remote " + isAnagramV2("meteor","remote"))
    print("\n")
    print("16 This should be true: " + "the classroom, " + "schoolmaster " + isAnagramV2("the classroom","schoolmaster"))
    print("\n")
    print("17 This should be true: " + "meal for one, " + "for me alone " + isAnagramV2("meal for one","for me alone"))
    print("\n")
    print("18 This should be true: " + "sweep the floor, " + "too few helpers " + isAnagramV2("sweep the floor","too few helpers"))
    print("\n")
    print("19 This should be true: " + "older and wiser, " + "I learned words " + isAnagramV2("older and wiser","I learned words"))
    print("\n")
    print("20 This should be true: " + "video game, " + "give a demo " + isAnagramV2("video game","give a demo"))
    print("\n")
    print("21 This should be true: " + "coins kept, " + "in pockets " + isAnagramV2("coins kept","in pockets"))
    print("\n")
    print("22 This should be false, y is repeated twice, " + "young lady, " + "an old guy " + isAnagramV2("young lady","an old guy"))
}

fun isAnagramV2(word1: String, word2: String): Boolean {
    val letters1: List<String> = word1.lowercase().replace("\\s+".toRegex(), "").split("").sorted()
    val letters2: List<String> = word2.lowercase().replace("\\s+".toRegex(), "").split("").sorted()
    var isAnagram: Boolean = false
    if (letters1.size != letters2.size) return isAnagram
    if (letters1.all { letters2.contains(it) && letters1.size == letters2.size }){
        isAnagram = true
    }
    return isAnagram
}

fun isAnagram(word1: String, word2: String): Boolean {
    var validAnagram: Boolean = false
    var word1LowerCase: String = word1.lowercase().replace("\\s+".toRegex(), "")
    // added .drop and .dropLast because .split("") is prepending and appending comma separators
    // turning a word of 5 length into a list of 7 size, not 5 size
    // very curious why the extra commas (and empty chars) are being added to list
    var letters: List<String> = word2.lowercase().replace("\\s+".toRegex(), "").split("").drop(1).dropLast(1)
    // early return, words in anagrams must be the same length
    if (word1LowerCase.length != letters.size) return validAnagram

    for (letter in letters) {
        if (word1LowerCase.contains(letter, ignoreCase = true)) {
            word1LowerCase = word1LowerCase.toString().replace(letter, "")
        }
    }

    if(word1LowerCase.length == 0) validAnagram = true
    return validAnagram
}
