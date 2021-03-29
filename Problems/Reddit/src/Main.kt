data class Site(val address: String, val foundationYear: Int)

fun makeReddit(): Site = Site("reddit.com", 2005)