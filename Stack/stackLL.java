class Stack { //peek , //pop // push // isEmptty // Display().
    ListNode top;

    // Push()
    public void push (int data ){ 
        ListNode Node = new ListNode(data);
        Node.next = top;
        top = Node;
    }

    //Pop()
    public int pop () {

        if (top == null) {
            System.out.println("Stack is Empty");
            return 0;
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int peek () {
        if (top == null) {
            System.out.println("Stack is Emtpy");
            return 0;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top==null;
    }

    public void display(){
        ListNode current = top;
        while (current!=null) {
            System.out.print(current.data+ " ");
            current = current.next;

        }
        System.out.println();

    }
}


class ListNode {

    int data;
    ListNode next;

    ListNode (int data) {
        this.data=data;
        this.next = null;
    }
}

public class stackLL {
    public static void main(String[] args) {
        Stack stack  = new Stack();
        int [] arr = {1,4,6,11,14,12};

        for (int i : arr) {
            stack.push(i);
        }

        stack.display();

        stack.pop();
        stack.peek();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }




    }
}