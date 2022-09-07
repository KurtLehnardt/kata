package com.kurtlehnardt.anagram

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AnagramApplicationTests(private val anagramService: AnagramService){

    @Test
    fun shouldBeTrueForActualAnagram() {
        var result = anagramService.isAnagram("TomMarvoloRiddle", "IAmLordVoldemort")
        assertNotNull(result)
        assertTrue(result)
    }

    @Test
    fun shouldBeFalseForBadAnagram() {
        var result = anagramService.isAnagram("jarjarbinks", "harrypotter")
        assertNotNull(result)
        assertFalse(result)
    }

    @Test @Disabled
    fun shouldReturnErrorWithBadInputs() {

    }

    @Test @Disabled
    fun postRequestShouldReturnWithData() {
        // todo test endpoint w/ POST
    }

    // Tests
//    print("1 This should be true: " +  isAnagram("TomMarvoloRiddle","IAmLordVoldemort"))
//    print("\n")
//    print("2 This should be false: " + isAnagram("harrypotter","jarjarbinks"))
//    print("\n")
//    print("3 This should be true: " + "anagram, " + "nag a ram " + isAnagram("anagram","nag a ram"))
//    print("\n")
//    print("4 This should be true: " + "below, " + "elbow " + isAnagram("below","elbow"))
//    print("\n")
//    print("5 This should be true: " + "study, " + "dusty " + isAnagram("study","dusty"))
//    print("\n")
//    print("6 This should be true: " + "night, " + "thing " + isAnagram("night","thing"))
//    print("\n")
//    print("7 This should be true: " + "act, " + "cat " + isAnagram("act","cat"))
//    print("\n")
//    print("8 This should be false, s is repeated twice,  "+ "dessert, " + "stressed " + isAnagram("dessert","stressed"))
//    print("\n")
//    print("9 This should be true: " + "bad credit, " + "debit card " + isAnagram("bad credit","debit card"))
//    print("\n")
//    print("10 This should be true: " + "gainly, " + "laying " + isAnagram("gainly","laying"))
//    print("\n")
//    print("11 This should be true: " + "conversation, " + "voice rants on " + isAnagram("conversation","voice rants on"))
//    print("\n")
//    print("12 This should be true: " + "eleven plus two, " + "twelve plus one " + isAnagram("eleven plus two","twelve plus one"))
//    print("\n")
//    print("13 This should be true: " + "they see, " + "the eyes " + isAnagram("they see","the eyes"))
//    print("\n")
//    print("14 This should be true: " + "funeral, " + "real fun " + isAnagram("funeral","real fun"))
//    print("\n")
//    print("15 This should be true: " + "meteor, " + "remote " + isAnagram("meteor","remote"))
//    print("\n")
//    print("16 This should be true: " + "the classroom, " + "schoolmaster " + isAnagram("the classroom","schoolmaster"))
//    print("\n")
//    print("17 This should be true: " + "meal for one, " + "for me alone " + isAnagram("meal for one","for me alone"))
//    print("\n")
//    print("18 This should be true: " + "sweep the floor, " + "too few helpers " + isAnagram("sweep the floor","too few helpers"))
//    print("\n")
//    print("19 This should be true: " + "older and wiser, " + "I learned words " + isAnagram("older and wiser","I learned words"))
//    print("\n")
//    print("20 This should be true: " + "video game, " + "give a demo " + isAnagram("video game","give a demo"))
//    print("\n")
//    print("21 This should be true: " + "coins kept, " + "in pockets " + isAnagram("coins kept","in pockets"))
//    print("\n")
//    print("22 This should be false, y is repeated twice, " + "young lady, " + "an old guy " + isAnagram("young lady","an old guy"))

}
