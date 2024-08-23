package threading.confinement;

public class DownloadStatus {
    private int totolBytes;
    public int getTotolBytes() {
        return totolBytes;
    }
    public void incrementTotolBytes() {
        this.totolBytes++;
    }
}
