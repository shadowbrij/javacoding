package threading.adders;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private final LongAdder totolBytes =  new LongAdder();
    public int getTotolBytes() {
        return totolBytes.intValue();
    }
    public void incrementTotolBytes() {
        this.totolBytes.increment();
    }
}
