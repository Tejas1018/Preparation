package com.prep.DesignPatterns.Stratergy;

import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.FlayableBehaviour;
import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.JetFlyBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.IQuackBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.SuperQuackBehaviour;

public class ForestDuck extends Duck{
    public ForestDuck() {
        super(new JetFlyBehaviour(), new SuperQuackBehaviour());
    }
}
