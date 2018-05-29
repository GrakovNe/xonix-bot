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

        if (view.head.getCol() == 0) {
            switch (lastMove) {
                case DOWN:
                    return Move.RIGHT;
                case RIGHT:
                    return Move.UP;
                case UP:
                    return Move.LEFT;
                case LEFT:
                    return Move.DOWN;
            }
        }



        return Move.DOWN;
    }
}
