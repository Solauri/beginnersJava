package beginnersJavaChapter6;

/*

    Isaac J. Mejia
    7/23/21

 */

class Queue {
    private int queue[];
    private int putloc, getloc;

    // constructors
    Queue(int size) {
        queue = new int[size];
        putloc = getloc = 0;
    }

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        queue = new int[ob.queue.length];

        // copy elements
        for (int i = getloc; i < putloc; i++)
            queue[i] = ob.queue[i];
    }

    Queue(int a[]) {
        putloc = 0;
        getloc = 0;
        queue = new int[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    void put(int n) {
        if (putloc == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putloc++] = n;
    }

    int get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return 0;
        }

        return queue[getloc++];
    }

}

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        // construct a 10-element empty queue
        Queue q1 =  new Queue(10);
        int i;

        int code[] = {1, 3, 3, 7};
        // construct a queue from arrow
        Queue q2 = new Queue(code);

        // put some numbers in q1
        for(i = 0; i < 10; i++)
            q1.put(i * i);

        // construct a queue from another queue
        Queue q3 = new Queue(q1);

        // show the queues
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++)
            System.out.print(q1.get() + " ");

        System.out.print("\n\nContents of q2: ");
        for (i  = 0; i < 3; i++)
            System.out.print(q2.get() + " ");

        System.out.print("\n\nContents of q3: ");
        for (i = 0; i < 10; i++)
            System.out.print(q3.get() + " ");

        return;
    }
}
