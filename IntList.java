
/**
 * Recreating linked lists
 *
 * @Omar Elasfar
 * @Version1
 */
public class IntList
{
    // instance variables - replace the example below with your own
    int length;
    Node head;

    /**
     * Default constructor for objects of class IntList
     */
    public IntList()
    {
        // initialise instance variables
        this.head = null;
        this.length = 0;
    }

    /**
     * Constructor for objects of class IntList
     */
    public IntList(Node n, int l)
    {
        // initialise instance variables
        this.head = n;
        this.length = l;
    }

    public String toString()
    {
        return "" + this.head;
    } 
    
    public Node findNode(int index)
    {
        //temporary node
        Node n = this.head;
        
        //looping until we reach one less than the index given
        for (int i=1; i<index; i++)
        {
            //setting the returned node to the node in question's previous .next (ie the node at the index)
            n = n.next;
        }
        
        //returning found node
        return n;
    }
    
    public void printBackward()
    {
        System.out.print("(");
    
        if (head != null)
        {
            Node tail = head.next;
            Node.printBackward(tail);
            System.out.print(head);
        }

        System.out.println(")");
    }

    public void addFirst(int i)
    {
        //creating a new node and setting it as the head then placing the cargo in aswell as pointing it towards the head making it the first node in the List
        this.head = new Node(i,this.head);
                
        //concatenating the length as a node was added
        this.length++;
    }

    public void printList()
    {
        //having a temporary node made for the node in question. Node changes to the next node by setting it to node.next after every revoloution
        //of the followong for loop
        Node node = this.head;
        
        //to follow conventional code
        System.out.print("(");
        
        //if there is a next node, then the if then statement will go through the normal procedure found in the if part
        //but if there is only one node then the program will just output it by itself
        if (this.length != 0)
        {
            for (int i=1; i<=this.length; i++)
            {
                 //if there is a next node then the print format would print the node followed by a comma, if not it will print just the node
                if (node.next != null)
                {
                    System.out.print(node + ", ");
                }
                else
                {
                    System.out.print(node);
                }
                
                //setting node to the next node so that it can be print when the loop is brought back
                node = node.next;
            }
        }
        
        //to follow conventional code
        System.out.print(")\n");
    }

    public Node removeFirst()
    {
        // if the length of the list is 0, then it is impossible to remove the frist therefore we output an error
        if (this.length != 0)
        {
            // saving what is stored in the first position into a temporary node so that we can output it later on in the code
            Node removed = this.head;
            
            // setting the head of the list to the second position
            this.head = this.head.next;
            
            //decreasing the length by 1
            this.length--;
            
            //returning the cargo of the removed node that was stored before the removal of from the list
            return removed;
        }
        else 
        {
            // informing user that the list is empty
            System.out.println("Error: List is empty!");
            
            //returning a null to end the program.
            return null;
        }
    }

    public void set(int index, int c)
    {
        // to prevent the code from crashing, the program will output Error if the index given is larger than the length of the 
        if (this.length >= index)
        {
            //saving a the current head as a node to change it in the the for loop
            Node node = this.head;

            //the loop runs the exact number of times so that the node is set to the node of the index. (If index is 2, the program will run one time
            //so that when node is set to the next node (index 2) it stops)
            for (int i = 1; i<index; i++)
            {
                node = node.next;
            }

            //printing the cargo of the index
            node.cargo = c;
        }
        else
        {
            //returning error messaging explaining that the index given is greater than the number of ints in the list (the lengths)
            System.out.println("Error: index larger than length!");
        }
    }
    
    public void add(int index, int cargo)
    {
        //based on the length of the IntList, the method can achieve the same thing much faster. Each special case is it's own if/else  
        if (this.length > 1)
        {
            //setting a temporary node that holds the node in the IntList used to call the method @ one less than the index so since the method's purpose
            //is to add a Node at the exact index meaning we will need to set the .next of the previous node to the new node.
            Node temp = this.findNode(index-1);
            
            //setting the node before the one at the index to point at the new node then having the new node point at the previos Node at the index which would
            // then be the index+1 position and setting the node's cargo to the cargo recieved in the parametres of the method.
            temp.next = new Node(cargo, this.findNode(index));
            
            //concatenating the length as a node was added
            this.length++;
        }
        else if (index > this.length+1) // if the index and the last node in the List is two apart, then there will an extra space in the list added with
        //no node filling it in so to prevent that, the else if catches that by comparing the index and seeing if it is greater than the length+1
        {
            //outputting error message with brief explanation
            System.out.println("Error: there are nodes missing between the index and the final node in the the list");
        }
        else if (this.length == 1) // if length is one
        {
            if (index == this.length)  //if length is equal to the index meaning replacing the first node with a new node
            {
                //creating a new node and setting it as the head then placing the cargo in aswell as pointing it towards the head making it the first node in the List
                this.head = new Node(cargo,this.head);
                
                //concatenating the length as a node was added
                this.length++;
            }
            else if (index == this.length+1) //if index is 2 and length is 1 means adding a second node to a List with onnly one node
            {
                //setting the head's next to the node that was just made and setting the node's cargo to the cargo recieved in the parametres of the method.
                this.head.next = new Node(cargo);
                
                //concatenating the length as a node was added
                this.length++;
            }
        }
        else if (this.length == 0) //if the length of the node is 0
        {
            //setting the head of the list to the new node and setting the node's cargo to the cargo recieved in the parametres of the method.
            this.head = new Node(cargo);
            
            //concatenating the length as a node was added
            this.length++;
        }
    }
    
    public void addLast(int cargo)
    {
        if (this.length != 0)
        {
            // declaring a node that starts at the head and that can change
            Node inq = this.head;
            //declaring a new node that will store the new cargo and will everntually be pointed at by the last node in the list
            Node last = new Node(cargo);
            
            // loop that runs one less the number of times the length of the list is since by the second last int, the inq variable is equal to the last
            // int
            for (int i = 1; i<this.length; i++)
            {
                // setting node to the next node until we reach the end
                inq = inq.next;
            }
            
            //have the last node in the current list point to the new node
            inq.next = last;
        }
        else 
        {
            //if the list has no ints yet, we will set the first postion to the cargo since it would technically be the last too.
            this.head.cargo = cargo;
        }
        
        //incrementing the length
        //out side the if statement since no matter what the situation is, there will be an extra int added to the list
        this.length++;
    }
    
    public void reverse()
    {
        System.out.print("(");

        if (head != null)
        {
            Node tail = head.next;
            Node.printBackward(tail);
            System.out.print(", " + head);
        }

        System.out.println(")");
    }
    
    public void append(IntList a)
    {
        //step by step of how this the next line of code works
        //calling the findNode method to find the final node by using the object calling this method and sending the length of the IntList given (which
        //is the last node).
        //then setting that Node's .next to the head of the intList given which means the IntList given is now placed right after the last Node in the original
        //IntClass
        //this.findNode(this.length).next = a.head;
        
        
    }
    
    public boolean checkLength()
    {
        int counter = 0;
        Node check = this.head;
        
        for (int i = 1; i>1; i++)
        {
            if (check.next != null)
            {
                counter++;
            }
            else
            {
                break;
            }
        }
        
        if (this.length == counter)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
