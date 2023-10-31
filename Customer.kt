import java.time.LocalDateTime
import java.util.*

class Customer : Order() {
    override var name: String? = null
    var add: String? = null
    var ph = 0
    var emid: String? = null
    var loc: String? = null
    var type: String? = null
    var points = 0
    override var sc = Scanner(System.`in`)
    var res: Restaurant = Restaurant()
    fun getdata() {
        println("Delivery Information: ")
        println("Enter Name")
        name = sc.next()
        println("Enter address")
        add = sc.next()
        println("Enter phone number")
        ph = sc.nextInt()
        println("Enter email id")
        emid = sc.next()
        println("Enter location")
        loc = sc.next()
        println("Enter type of customer")
        type = sc.next()
    }

    fun display() {
        println(name)
        println(add)
        println(ph)
        println(emid)
        println(loc)
        println(type)
    }

    fun paybill(amt: Int) {

        //int amt = price * qty;
        val dateTime = LocalDateTime.now()
        println("--------Bill-------")
        System.out.println(("        " + res.name).toString() + "    ")
        println(dateTime)
        System.out.println(("Add." + res.add).toString() + "  Ph." + res.ph)
        println("-------------------")
        println("Customer Nmae: $name")
        println("Delivery Address: $add")
        println("Customer Ph. $ph")
        println("Amount: " + amt + "Rs")
        val gc = GuestCustomer()
        val rc = RegularCustomer()
        val pc = PremiumCustomer()
        when (type) {
            "Guest" -> gc.GuestBill(amt)
            "Regular" -> rc.RegularBill(amt)
            "Premium" -> pc.PremiumBill(amt)
            else -> println("Wrong Input")
        }
    }
}
