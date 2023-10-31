class RegularCustomer {
    var bill = 0

    //int dis = 20;
    fun RegularBill(amt: Int) {
        bill = (amt * 0.8).toInt()
        println("Free Delivery")
        println("Bill: $bill Rs (After 20% discount)")
    }
}
