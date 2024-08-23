package threading;

public class DownloadStatus {
    private int totolBytes = 1;
    public int getTotolBytes() {
        return totolBytes;
    }
    public void incrementTotolBytes() {
        this.totolBytes++;
    }
}
