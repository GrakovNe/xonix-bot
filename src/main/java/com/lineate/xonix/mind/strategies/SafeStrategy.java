package com.lineate.xonix.mind.strategies;

import com.lineate.xonix.mind.Strategy;
import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

import static com.lineate.xonix.mind.utils.XonixUtils.isCorner;

public class SafeStrategy implements Strategy {
    @Override
    public Move resolve(GameStateView view, Move lastMove) {

        if (!isCorner(view)) {
            return lastMove;
        }

        switch (lastMove) {
            case DOWN:
                return Move.LEFT;
            case LEFT:
                return Move.UP;
            case UP:
                return Move.RIGHT;
            case RIGHT:
                return Move.DOWN;
        }

        return Move.DOWN;
    }
}