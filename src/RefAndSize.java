public class RefAndSize {
    private int off;
    private int size;

    public int getOff() {
        return off;
    }

    public void setOff(int off) {
        this.off = off;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public RefAndSize() {
    }

    public RefAndSize(int off, int size) {
        this.off = off;
        this.size = size;
    }
}
