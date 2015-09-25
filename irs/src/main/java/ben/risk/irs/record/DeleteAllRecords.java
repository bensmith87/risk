package ben.risk.irs.record;

import java.io.Serializable;

/**
 * Delete All Records.
 */
public final class DeleteAllRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Class<?> type;

    public DeleteAllRecords(Class<?> type) {
        this.type = type;
    }

    public final Class<?> getType() {
        return type;
    }
}
