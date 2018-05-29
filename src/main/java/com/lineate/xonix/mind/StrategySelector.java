package com.lineate.xonix.mind;

import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

public class StrategySelector {

    public static Strategy select(GameStateView view, Move lastMove, Strategy lastStrategy) {
        return new RandomStrategy();
    }
}
