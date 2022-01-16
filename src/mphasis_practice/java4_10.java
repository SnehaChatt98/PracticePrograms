package mphasis_practice;

class java4_10
{ 
    Node head; 

    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
 
    void deleteNode(int key) 
    { 
    
        Node temp = head, prev = null; 
  
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; 
            return; 
        } 
  

        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     

        if (temp == null) return; 
  
        prev.next = temp.next; 
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 

    public static void main(String[] args) 
    { 
    	java4_10 list = new java4_10(); 
  
        list.push(7); 
        list.push(1);
        list.push(3);
        list.push(3); 
        list.push(2); 
        System.out.println("Linked List elements"); 
        list.printList();
        int key = 3;
        System.out.println("\n"+"Element to be deleted: "+key); 
        
        list.deleteNode(key);
        
        System.out.println("Linked List after deletion"); 
        list.printList(); 
    } 
} 

