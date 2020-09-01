fun main() {
    val authors = arrayOf("Dr. Suess", "Moses Samuel")
    printBookInfo("Green Eggs And Ham", *authors)
}

fun printBookInfo(title: String, vararg authors: String) {
    print("$title by")
    for (author in authors) {
        print(" $author")
    }
}





