public class RefAndSize {
    private long off;
    private int size;

    public long getOff() {
        return off;
    }

    public void setOff(long off) {
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

    public RefAndSize(long off, int size) {
        this.off = off;
        this.size = size;
    }
}
