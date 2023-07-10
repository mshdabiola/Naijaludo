package com.mshdabiola.ludo.screen.game.firework


/// - Parameters:
///  - pieceCount: amount of confetti
///  - colors: list of colors that is applied to the default shapes
///  - pieceSize: size that confetti and emojis are scaled to
///  - radius: explosion radius
///  - repetitions: number of repetitions of the explosion
///  - repetitionInterval: duration between the repetitions
data class FireworkUiState(
    val pieceCount: Int = 20,
    val pieceSize: Float = 5.0f,
    val radius: Float = 100f,
    val repetitions: Int = 100,
    val repetitionInterval: Double = 500.0,
    val explosionAnimDuration: Double = 1200.0,
    val launchAnimDuration: Double = 3000.0,
) {
    fun getAnimDuration(): Double {
        return explosionAnimDuration + launchAnimDuration
    }
}

