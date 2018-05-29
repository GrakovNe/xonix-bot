package com.lineate.xonix.mind;

import com.lineate.xonix.mind.model.Bot;
import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;
import com.lineate.xonix.mind.strategies.RandomStrategy;

/**
 * Hello world!
 */
public class RandomBot implements Bot {


    private Move lastMove = Move.DOWN;
    private Strategy lastStrategy = new RandomStrategy();

    public RandomBot() {
    }

    @Override
    public String getName() {
        return "GrakovNe";
    }

    @Override
    public Move move(GameStateView view) {

        Strategy strategy = StrategySelector.select(view, lastMove, lastStrategy);
        Move result = strategy.resolve(view, lastMove);

        lastMove = result;
        lastStrategy = strategy;

        return result;
    }
}