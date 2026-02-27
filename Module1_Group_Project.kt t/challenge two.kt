
    /**
 * Challenge 2: Ndejje University Grading System
 * This function returns the GPA (as Double) based on the score using 'when'.
 */
fun getGPA(score: Int): Double {
    // 'when' is Kotlin's version of switch-case
    // Checks the range in which the score falls and returns corresponding GPA
    return when (score) {
        in 80..100 -> 5.0   // Scores 80 to 100 → GPA 5.0
        in 75..79  -> 4.5   // Scores 75 to 79 → GPA 4.5
        in 70..74  -> 4.0   // Scores 70 to 74 → GPA 4.0
        in 65..69  -> 3.5   // Scores 65 to 69 → GPA 3.5
        in 60..64  -> 3.0   // Scores 60 to 64 → GPA 3.0
        else       -> 0.0   // All other scores (below 60 or above 100) → GPA 0.0
    }
}

// Main function — execution starts here
fun main() {
    println("=== Challenge 2: Ndejje GPA Tests ===")
    println("sample results and their corresponding gpa")
    // Test scores to check the GPA function
    val testScores = listOf(85, 77, 72, 67, 61, 59, 100, 79, 64, 55, 101, -3)

    // Loop through each score in the testScores list
    for (score in testScores) {
        val gpa = getGPA(score) // Call the getGPA function
    
        println("Score: $score → GPA: $gpa") // Print the score and corresponding GPA
    }
}