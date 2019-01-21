public class SLLInsertion {
    public static Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
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

    public static void insertElementInSll(int pos, int ele){
        Node p=head, q=null, nn;
        nn= new Node(ele);

        int k=1;
        if(pos==1){
            nn.next=head;
            head=nn;
        }
        else {
            while(p!=null && k<pos){
                q=p;
                k++;
                p=p.next;
            }
            q.next=nn;
            nn.next=p;
        }
    }

    public static void main(String[] args){
        SLLInsertion ll = new SLLInsertion();
        ll.head = new Node(12);
        Node n2 = new Node(34);
        Node n3 = new Node(45);

        ll.head.next=n2;
        n2.next=n3;

        System.out.print("Before Insertion: ");
        traverseList();

        int pos = 5;    //position where you want to insert in the list
        int ele = 23;   //element which you want to insert in the list

        insertElementInSll(pos,ele);

        System.out.print("After Insertion: ");
        traverseList();
    }
}
