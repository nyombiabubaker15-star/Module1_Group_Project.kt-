/**
 * Challenge 3: Safe University Portal (Null Safety)
 * Prints a welcome message or error if student details are incomplete.
 * Uses safe calls (?.) and Elvis operator (?:) for null handling.
 */
 // Function to print student details
// The parameters are nullable (can contain a value or null)
fun printStudentDetails(name: String?, studentNumber: String?) {

// Converts name to uppercase if it is not null
// If name is null, studentName becomes null
val studentName = name?.uppercase()

// Converts student number to uppercase if not null
val studentNo = studentNumber?.uppercase()

// Checks if BOTH values are available (not null)
if (studentName != null && studentNo != null) {

// Prints welcome message with student details
println("Welcome $studentName. Your student number is $studentNo.")

} else {

// Executes if any value is missing
println("Incomplete record")
}
}

// Main function — program execution starts here
fun main() {

// Calling function with complete student details
printStudentDetails("John", "s23b13")

// Calling function with missing name
printStudentDetails(null, "s23b14")

// Calling function with missing student number
printStudentDetails("Mary", null)
}