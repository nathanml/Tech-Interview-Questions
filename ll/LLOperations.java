package ll;

import java.util.Objects;

public class LLOperations {

    /*
    * Assumes list is sorted
    * */
    public LinkedList insertToSortedList(LinkedList list, int element)
    {
        //If list empty or element smaller than head, insert at top of list
        if(Objects.isNull(list) || element < list.getHead().getValue())
        {
            LinkedList ret = new LinkedList();
            LLNode head = new LLNode();
            head.setValue(element);
            head.setNext(list.getHead());
            ret.setHead(head);
            return ret;
        }

        LLNode current = list.getHead();
        //Iterate through list to find correct location
        while (current.getNext() != null && current.getNext().getValue() < element)
            current = current.getNext();

        LLNode newNode = new LLNode();
        newNode.setValue(element);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return list;
    }

    public static void main(String[] args)
    {

    }
}
