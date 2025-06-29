package com.prep.DesignPatterns.Stratergy;

import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.FlayableBehaviour;
import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.NoFlyBehaviour;
import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.NormalFlyingBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.IQuackBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.NoQuackBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.NormalQuackBehaviour;

public class CityDuck extends Duck{
    public CityDuck() {
        super(new NoFlyBehaviour(), new NoQuackBehaviour());
    }

}
