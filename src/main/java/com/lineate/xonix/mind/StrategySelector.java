package com.lineate.xonix.mind;

import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;
import com.lineate.xonix.mind.strategies.RandomStrategy;

public class StrategySelector {

    static RandomStrategy strategy = new RandomStrategy();

    public static Strategy select(GameStateView view, Move lastMove, Strategy lastStrategy) {
        return strategy;
    }
}
