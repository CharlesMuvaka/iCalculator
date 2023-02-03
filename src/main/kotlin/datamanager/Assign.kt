package datamanager

import Deviation
import models.Scholar

class Assign {
    val scholar = ScholarDataManager().scholars[0]
    val subjects = Subjects().allSubjects

}

fun main() {
    val scholar = Assign().scholar
    val subject = Assign().subjects[0]
    val subject1 = Assign().subjects[1]
    subject.score = 55
    subject1.score = 50
    scholar.addSubject(subject)
    scholar.addSubject(subject1)

    val dev = Deviation()
    val scholarDev = dev.calculateDeviation(scholar.meanAGP)
    println(scholarDev)
    println(scholar.currentSubjects[1].agp)
//    for (subject in scholar.currentGrades){
//        println(subject)
//    }
//    println(scholar)
}