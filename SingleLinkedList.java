
public class SingleLinkedList {

    public int value;
    public SingleLinkedList next;

    public SingleLinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public SingleLinkedList(int value, SingleLinkedList next) {
        this.value = value;
        this.next = next;
    }

    public static void main(String[] args) {
        final SingleLinkedList list = new SingleLinkedList(1000);
        list.next = new SingleLinkedList(100);
        list.next.next = new SingleLinkedList(32);
        list.next.next.next = new SingleLinkedList(4);
        list.next.next.next.next = new SingleLinkedList(533);
        list.next.next.next.next.next = new SingleLinkedList(6);
        list.next.next.next.next.next.next = new SingleLinkedList(7);
        list.next.next.next.next.next.next.next = new SingleLinkedList(81);
        list.next.next.next.next.next.next.next.next = new SingleLinkedList(-9);
        list.next.next.next.next.next.next.next.next = new SingleLinkedList(-10);

        SingleLinkedList temp = list;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
