class GuestCustomer {
    var bill = 0
    var delcharg = 120
    fun GuestBill(amt: Int) {
        bill = amt + delcharg
        println("Bill: $bill Rs (Including Delivery Charges 120 Rs )")
    }
}
