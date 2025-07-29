package ll;

import java.util.Objects;

public class LinkedList {
    private LLNode head;

    public LLNode getHead() {
        return head;
    }

    public void setHead(LLNode head) {
        this.head = head;
    }

    public LinkedList insertToSortedList(int element)
    {
        //If list empty or element smaller than head, insert at top of list
        if(Objects.isNull(head) || element < head.getValue())
        {
            LLNode newHead = new LLNode();
            newHead.setValue(element);
            newHead.setNext(head);
            head = newHead;
            return this;
        }

        LLNode current = head;
        //Iterate through list to find correct location
        while (current.getNext() != null && current.getNext().getValue() < element)
            current = current.getNext();

        LLNode newNode = new LLNode();
        newNode.setValue(element);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return this;
    }
}
