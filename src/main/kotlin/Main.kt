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

    "fluent interface Push" example {
        val list = LinkedList<Int>()

        list.push(3).push(2).push(1)

        println(list)
    }

    "append" example {
        val list = LinkedList<Int>()

        list.append(1).append(2).append(3)

        println(list)
    }

    "Inserting at a particular index" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before inserting: $list")

        var middleNode = list.nodeAt(1)!!

        for (index in 1..3){
            middleNode = list.insert(-1 * index , middleNode)
        }
        print("After inserting : $list")
    }
}