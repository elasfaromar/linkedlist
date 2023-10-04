
/**
 * Recreating nodes
 *
 * @Omar
 * @Version1
 */
public class Node
{
    // instance variables - replace the example below with your own
    int cargo;
    Node next;

    /**
     * Default Constructor for objects of class Node
     */
    public Node()
    {
        this.cargo = 0;
        this.next = null;
    }
    
    /**
     * Constructor for objects of class Node
     */
    public Node(int cargo, Node next)
    {
        this.cargo = cargo;
        this.next = next;
    }
    
    /**
     * Constructor for objects of class Node
     */
    public Node(int cargo)
    {
        this.cargo = cargo;
        this.next = null;
    }
    
    /**
     * Constructor for objects of class Node
     */
    public Node(Node c)
    {
        this.cargo = 0;
        this.next = c;
    }
    
    //function method
    public String toString()
    {
        return "" + this.cargo;
    }
    
    //function method 
    public void printList()
    {
        Node node = this;
        
        System.out.print("(");
        
        while (node != null)
        {
            if (node.next != null)
            {
                System.out.print(node + ", ");
            }
            else
            {
                System.out.print(node);
            }
            node = node.next;
        }
        
        System.out.println(")");
    }
    
    //function method
    public static void printBackward(Node list)
    {
        // if (list == null)
        // {
            // return;
        // }
        // printBackward(list.next);
        // System.out.println(list);
        
        if (list == null)
        {
            return;
        }
        
        Node head = list;
        Node tail = list.next;
        
        printBackward(tail);
        System.out.print(head);
    }
    
    public static void printBackwardsNicely(Node list)
    {
        // if (list == null)
        // {
            // return;
        // }
        // printBackward(list.next);
        // System.out.println(list);
        
        System.out.print("(");
        if (list == null)
        {
            Node head = list;
            Node tail = list.next;
        
            printBackward(tail);
            System.out.println(head);
        }
        System.out.print(")\n\n");
        
    }
    
    public static Node removeSecond(Node list)
    {
        Node first = list;
        Node second = list.next;
        
        //mkae the first node point to the third
        first.next = second.next;
        
        second.next = null;
        return second;
    }
}
