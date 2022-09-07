import com.fasterxml.jackson.databind.util.JSONPObject
import com.kurtlehnardt.anagram.AnagramService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("checkAnagram")
// Omitted @Autowired annotation as per section 5 https://www.baeldung.com/kotlin/spring-boot-kotlin
class AnagramController(val anagramService: AnagramService) {
    @PostMapping
    @ResponseBody
    fun checkAnagramPost(@PathVariable words: String): Boolean {
        var word1: String = words.split(',')[0]
        var word2: String = words.split(',')[1]
        return anagramService.isAnagram(word1, word2)
    }
}