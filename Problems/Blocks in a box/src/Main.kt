data class Block(val color: String) {
    object BlockProperties {
        var length = 6
        var width = 4

        fun blocksInBox(lengthBox: Int, widthBox: Int): Int {
            return lengthBox / length * (widthBox / width)
        }
    }
}