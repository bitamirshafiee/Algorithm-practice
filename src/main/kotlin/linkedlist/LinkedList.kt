package linkedlist

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private var size = 0

    fun isEmpty() = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }

    fun push(value : T){
        head = Node(value = value, next = head)
        if (tail == null){
            tail = head
        }
        size++
    }
}