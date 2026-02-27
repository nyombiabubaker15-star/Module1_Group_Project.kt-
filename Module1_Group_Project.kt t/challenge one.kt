/**
 * Challenge 1: Advanced MoMo Agent (Control Flow)
 * Calculates the Mobile Money transaction fee based on amount.
 * Then checks if the user has enough balance (amount + fee).
 */
 fun calculateMoMoFee(amount: Int, balance: Int) {

// Determine the fee based on the amount using 'when'
val fee = when {
amount <= 5000 -> 500 // If amount <= 5,000 → fee is 500
amount <= 60000 -> 1000 // If amount <= 60,000 → fee is 1,000
else -> 2000 // If amount > 60,000 → fee is 2,000
}

// Total money to deduct (amount + MoMo fee)
val total = amount + fee

// Check if the user has enough balance
if (total <= balance) {
println("Transaction Successful")
println("Amount: $amount") // Print the sent amount
println("MoMo Fee: $fee") // Print the fee charged
println("Total Deducted: $total") // Print total deducted
println("Remaining Balance: ${balance - total}") // Remaining balance after transaction
} else {
// Not enough money to cover amount + fee
println("Insufficient Funds")
}
}

// Main function — program execution starts here
fun main() {
// Example: Sending 10,000 with a balance of 15,000
calculateMoMoFee(10000, 15000)
}