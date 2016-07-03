class DoublyLinkedList<E>{
  static class Node<E>{
    public E data;
    public Node<E> next;
    public Node<E> previous;
    Node(E data){
        this.data = data;
    }
  }

}
