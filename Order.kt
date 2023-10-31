import java.time.LocalDateTime
import java.util.*

open class Order {
    var Order_no = 0
    var food_id = 0
    open var name: String? = null
    var price = 0
    var descrip: String? = null
    var qty = 0
    var amt = 0
    open var sc = Scanner(System.`in`)
    fun chooseitem() {
        println("Enter Food ID:")
        food_id = sc.nextInt()
        when (food_id) {
            1 -> {
                name = "A"
                price = 100
                descrip = "abcdefg"
            }

            2 -> {
                name = "B"
                price = 200
                descrip = "abcdefg"
            }

            3 -> {
                name = "C"
                price = 300
                descrip = "abcdefg"
            }

            4 -> {
                name = "D"
                price = 400
                descrip = "abcdefg"
            }

            5 -> {
                name = "E"
                price = 500
                descrip = "abcdefg"
            }

            else -> println("Error")
        }
    }

    fun getQty() {
        Order_no += 1
        println("Enter Quantity:")
        qty = sc.nextInt()
        amt = price * qty
    }

    fun order_display() {
        println("Order No. $Order_no")
        println("Item Name: $name Amount: $amt Rs Description: $descrip")
        val dateTime = LocalDateTime.now()
        println("Order Date and Time: $dateTime")
    }
}
