package com.kurtlehnardt.app

import com.kurtlehnardt.app.anagram.AnagramService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class AnagramServiceTest {
    private val anagramService: AnagramService = AnagramService()
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

    @Test
    fun shouldReturnFalseWhenRepeatingCharsBreakAnagram() {
        var result = anagramService.isAnagram("dessert","stressed")
        assertNotNull(result)
        assertFalse(result)
    }
}
