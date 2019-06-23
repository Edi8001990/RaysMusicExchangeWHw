package Shopping;

import Instruments.Instrument;

public interface ISell {
    void addToStock(Instrument instrument);
    void removeFromStock(Instrument instrument);
}
