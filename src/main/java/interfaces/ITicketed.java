package interfaces;

import core.Visitor;

public interface ITicketed {
    public double defaultPrice();
    public double priceFor(Visitor visitor);
}
