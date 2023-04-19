import java.time.Instant;
import java.util.Date;

public class ClassDate {

    public Date getData() {
        return Date.from(Instant.now());
    }

}
