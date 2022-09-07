package com.kurtlehnardt.app.anagram

import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.web.bind.annotation.*

@RestController
// Omitted @Autowired annotation as per section 5 https://www.baeldung.com/kotlin/spring-boot-kotlin
class AnagramController(val anagramService: AnagramService) {
    @GetMapping("/")
    fun index() = "Hello World"
    @PostMapping("/checkAnagram")
    @ResponseBody
    fun checkAnagramPost(@RequestBody words: String): Boolean {
        if (words == null || words.isEmpty()) { return false}
        var word1: String = words.split(",")[0]
        var word2: String = words.split(",")[1]
        return anagramService.isAnagram(word1, word2)
    }
}