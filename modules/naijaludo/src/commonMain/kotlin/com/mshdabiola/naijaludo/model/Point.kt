package com.mshdabiola.naijaludo.model

data class Point(val x: Int, val y: Int) {
    operator fun plus(point: Point) = Point(x + point.x, y + point.y)
    operator fun minus(point: Point) = Point(x - point.x, y - point.y)
    operator fun times(point: Point) = Point(x * point.x, y * point.y)
    operator fun div(point: Point) = Point(x / point.x, y / point.y)

    companion object {
        val Zero = Point(0, 0)
    }
}
