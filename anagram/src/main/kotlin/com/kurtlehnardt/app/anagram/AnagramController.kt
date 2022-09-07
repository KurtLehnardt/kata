package com.kurtlehnardt.app.anagram

import org.springframework.web.bind.annotation.*

@RestController
// Omitted @Autowired annotation as per section 5 https://www.baeldung.com/kotlin/spring-boot-kotlin
class AnagramController(val anagramService: AnagramService) {
    @GetMapping("/")
    fun yandex() = "yo"
    @PostMapping("/checkAnagram")
    fun index() = "hello"
//    @ResponseBody
//    fun checkAnagramPost(@PathVariable words: String): Boolean {
//        var word1: String = words.split(',')[0]
//        var word2: String = words.split(',')[1]
//        return anagramService.isAnagram(word1, word2)
//    }
}