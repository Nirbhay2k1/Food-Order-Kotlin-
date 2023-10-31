class PremiumCustomer {
    var bill = 0

    //int dis = 30;
    var points = 0
    fun PremiumBill(amt: Int) {
        bill = (amt * 0.7).toInt()
        points = (amt * 0.01).toInt()
        println("Premium Member")
        println("Free Delivery")
        println("Points: $points")
        println("Bill: $bill Rs (After 30% discount)")
    }
}
