package Computer;

public class Monitor implements CompItem{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
