package Computer;

public class Keyboard implements CompItem{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
