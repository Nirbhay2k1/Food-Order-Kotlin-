object FoodOrderApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val cust = Customer()
        val menu = Menu()
        val ord = Order()
        menu.display()
        ord.chooseitem()
        ord.getQty()
        ord.order_display()
        cust.getdata()
        cust.paybill(ord.amt)
    }
}
