package pl.strefakursow.decorator;

import pl.strefakursow.strategy.Employee;

public class SpecialBonus extends Bonus {
    public SpecialBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return 1000;
    }
}
