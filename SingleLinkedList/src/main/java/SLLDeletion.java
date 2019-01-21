public class SLLDeletion {

    public static Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void traverseList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println("\n");
    }

    public static int deleteElementInSll(int pos){
        Node p=head, q=null;
        int k=1;

        if(pos == 1){
            head=head.next;
        }
        else {
            while (p!=null && k<pos){
                q=p;
                p=p.next;
                k++;
            }
            if(p==null){
                System.out.println("Postion is not valid");
                return 0;
            }else {
                q.next=p.next;
            }
        }
        return p.data;
    }

    public static void main(String[] args){
        SLLDeletion ll = new SLLDeletion();
        ll.head = new Node(12);
        Node n2 = new Node(34);
        Node n3 = new Node(45);
        Node n4 = new Node(55);
        ll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.print("Before Deletion: ");
        traverseList();

        int pos = 5;    //position where you want to delete in the list

        System.out.println("Deleted Ele: " + deleteElementInSll(pos));
        System.out.print("After Deletion: ");
        traverseList();
    }
}
