class Deviation {
    fun calculateDeviation(points:Int): Int{
        var deviation = 0
        deviation = CUT_POINT_OFF_POINTS - points
        return deviation
    }
}