fun main() {
    val p = Person("Moses", 22)
    val c = Chef("Bobj", 33, "Ribs")

    p.printMyFavoriteFood()

    c.setMyFavoriteFood("Celery")
    c.printMyFavoriteFood()
}
