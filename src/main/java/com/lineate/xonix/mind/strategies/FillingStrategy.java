package com.lineate.xonix.mind.strategies;

import com.lineate.xonix.mind.Strategy;
import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

public class FillingStrategy implements Strategy {

    private int i = 0;
    private int j = 0;

    @Override
    public Move resolve(GameStateView view, Move lastMove) {

        Move result = Move.DOWN;

        if (i < j) {
            i++;
            return lastMove;
        }

        switch (lastMove) {
            case DOWN:
                result = Move.RIGHT;
            case RIGHT:
                result = Move.UP;
            case UP:
                result = Move.LEFT;
            case LEFT:
                result = Move.DOWN;
        }

        i = 0;
        j++;
        return result;
    }
}
