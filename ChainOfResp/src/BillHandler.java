public abstract class BillHandler {

    protected BillHandler next;

    public BillHandler setNext(BillHandler next)
    {
        this.next = next;
        return next;
    }

    public abstract void handle(int amount);

}