package models

data class Scholar (var name:String, var status:String){
    var pfNumber: String?  = null
    private val agpValues = HashMap<String, Int>()
    private lateinit var origin:String
    var primarySchool: String? = null
    var secondarySchool: String? = null
    var varsity: String? = null
    var currentSubjects = ArrayList<Subject>()
    var meanGrade: String? = null
    var meanScore: Int = 0
    var meanAGP: Int = 0

    fun getOrigin() = this.origin
    fun setOrigin(origin: String){
        this.origin = origin
    }

