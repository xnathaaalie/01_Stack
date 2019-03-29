package A01_Stack;


public class Stack<T>
{
	 private Node<T> first;
    /**
     *
     * Angabe: Implementieren Sie einen generischen Stack auf Basis von verketteten Listen. Eine Basisstruktur
     * finden Sie im Projekt.
     *
     *
     * Oberstes Element entfernen und zurückliefern.
     * Existiert kein Element, wird eine Exception ausgelöst.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {
        if(first == null)
            throw new StackEmptyException();

        T value = first.getData();
        first = first.getNext();
        return value;

    }
    
    /**
     * Übergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
        Node<T> node = new Node(i);
        node.setNext(first);
        first = node;
    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
        Node<T> node = first;
        int count = 0;

        while(node != null)
        {
            count++;
            node = node.getNext();
        }

        return count;
    }
}
