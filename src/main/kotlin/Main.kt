import linkedlist.LinkedList
import linkedlist.Node

fun main(args: Array<String>) {

    "Creating and linking nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }

    "Push" example {
        val list = LinkedList<Int>()

        list.push(3)
        list.push(2)
        list.push(1)

        println(list)
    }
}