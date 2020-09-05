fun main() {
    var button = Button()
    button.setMyListener(object: OnClickListener {
        override fun onClick() {
            println("This was clicked")
        }
    })
    button.click()
}

interface OnClickListener {
    fun onClick()
}

open abstract class View {
    lateinit var clickListener: OnClickListener

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener

    }

    fun click() {
        clickListener.onClick()
    }
}

class Button: View()
class Image: View()
class Map: View()

