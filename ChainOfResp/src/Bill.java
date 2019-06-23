public class Bill extends BillHandler{

    private int size;

    public Bill(int size) {
        this.size = size;
    }

    @Override
    public void handle(int amount) {
        if (amount >= size)
        {
            System.out.println("Giving " + size +" X " + amount / size);
        }
        if (amount % size > 0)
        {
            if (next != null)
            {
                next.handle(amount % size);
            }
            else {
                System.out.println("This is how u remind me " + amount % size);
            }
        }
    }

}