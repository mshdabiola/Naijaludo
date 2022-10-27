package com.mshdabiola.ludo.model

data class Point(val x: Float, val y: Float) {
    operator fun plus(point: Point) = Point(x + point.x, y + point.y)
    operator fun minus(point: Point) = Point(x - point.x, y - point.y)
    operator fun times(point: Point) = Point(x * point.x, y * point.y)
    operator fun div(point: Point) = Point(x / point.x, y / point.y)

    companion object {
        val zero = Point(0f, 0f)
    }
}
