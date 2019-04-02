package interfaces;

import core.Visitor;

public interface ISecurity {
    public boolean isAllowedTo(Visitor visitor);
}
