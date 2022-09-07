package com.kurtlehnardt.anagram

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AnagramApplication

fun main(args: Array<String>) {
    print("1 This should be true: " +  isAnagram("TomMarvoloRiddle","IAmLordVoldemort"))
    print("\n")
    print("2 This should be false: " + isAnagram("harrypotter","jarjarbinks"))
    print("\n")
    print("3 This should be true: " + "anagram, " + "nag a ram " + isAnagram("anagram","nag a ram"))
    print("\n")
    print("4 This should be true: " + "below, " + "elbow " + isAnagram("below","elbow"))
    print("\n")
    print("5 This should be true: " + "study, " + "dusty " + isAnagram("study","dusty"))
    print("\n")
    print("6 This should be true: " + "night, " + "thing " + isAnagram("night","thing"))
    print("\n")
    print("7 This should be true: " + "act, " + "cat " + isAnagram("act","cat"))
    print("\n")
    print("8 This should be false, s is repeated twice,  "+ "dessert, " + "stressed " + isAnagram("dessert","stressed"))
    print("\n")
    print("9 This should be true: " + "bad credit, " + "debit card " + isAnagram("bad credit","debit card"))
    print("\n")
    print("10 This should be true: " + "gainly, " + "laying " + isAnagram("gainly","laying"))
    print("\n")
    print("11 This should be true: " + "conversation, " + "voice rants on " + isAnagram("conversation","voice rants on"))
    print("\n")
    print("12 This should be true: " + "eleven plus two, " + "twelve plus one " + isAnagram("eleven plus two","twelve plus one"))
    print("\n")
    print("13 This should be true: " + "they see, " + "the eyes " + isAnagram("they see","the eyes"))
    print("\n")
    print("14 This should be true: " + "funeral, " + "real fun " + isAnagram("funeral","real fun"))
    print("\n")
    print("15 This should be true: " + "meteor, " + "remote " + isAnagram("meteor","remote"))
    print("\n")
    print("16 This should be true: " + "the classroom, " + "schoolmaster " + isAnagram("the classroom","schoolmaster"))
    print("\n")
    print("17 This should be true: " + "meal for one, " + "for me alone " + isAnagram("meal for one","for me alone"))
    print("\n")
    print("18 This should be true: " + "sweep the floor, " + "too few helpers " + isAnagram("sweep the floor","too few helpers"))
    print("\n")
    print("19 This should be true: " + "older and wiser, " + "I learned words " + isAnagram("older and wiser","I learned words"))
    print("\n")
    print("20 This should be true: " + "video game, " + "give a demo " + isAnagram("video game","give a demo"))
    print("\n")
    print("21 This should be true: " + "coins kept, " + "in pockets " + isAnagram("coins kept","in pockets"))
    print("\n")
    print("22 This should be false, y is repeated twice, " + "young lady, " + "an old guy " + isAnagram("young lady","an old guy"))
}

/*
 * javascript reference
  const isAnagramV2 = (word1, word2) => {
  let isAnagram = false
  let word1LowerCase = word1.toLowerCase().replace(/\s/g, '')
  const letters = word2.toLowerCase().replace(/\s/g, '').split('')
  if (word1LowerCase.length !== letters.length) return isAnagram
  letters.map(letter => {
    if (word1LowerCase.includes(letter)){
      word1LowerCase = word1LowerCase.replace(letter, '')
  })
  if (word1LowerCase.length === 0){
    isAnagram = true
  }
  return isAnagram

  // I like this verison best
 const isAnagramv3 = (word1, word2) => {
  const arr1 = word1.toLowerCase().replace(/\s/g, '').split('').sort()
  const arr2 = word2.toLowerCase().replace(/\s/g, '').split('').sort()
  let isAnagram = false
  if (arr1.length !== arr2.length) return isAnagram
  if (arr1.every(char => arr2.includes(char)) && arr1.length === arr2.length) isAnagram =  true
  return isAnagram
}
  */

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
