package com.mshdabiola.naijaludo.model

data class LudoSetting(
    val level: Int = 0,
    val assist: Boolean = true,
    val style: Int = 0,
    val numberOfPawn: Int = 4,
    val rotateBoard: Boolean = true,
    val boardType: Int = 0,
    val names: Array<String> = emptyArray()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LudoSetting

        if (level != other.level) return false
        if (assist != other.assist) return false
        if (style != other.style) return false
        if (numberOfPawn != other.numberOfPawn) return false
        if (rotateBoard != other.rotateBoard) return false
        if (boardType != other.boardType) return false
        if (!names.contentEquals(other.names)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = level
        result = 31 * result + assist.hashCode()
        result = 31 * result + style
        result = 31 * result + numberOfPawn
        result = 31 * result + rotateBoard.hashCode()
        result = 31 * result + boardType
        result = 31 * result + names.contentHashCode()
        return result
    }
}
