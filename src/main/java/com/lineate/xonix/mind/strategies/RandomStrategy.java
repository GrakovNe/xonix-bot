package com.lineate.xonix.mind.strategies;

import com.lineate.xonix.mind.Strategy;
import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.min;

public class RandomStrategy implements Strategy {


    int i = 0;

    private final List<Move> whenVertical = Arrays.asList(Move.LEFT, Move.RIGHT);
    private final List<Move> whenHorizontal = Arrays.asList(Move.UP, Move.DOWN);

    @Override
    public Move resolve(GameStateView view, Move lastMove) {

        Random random = new Random();

        int x = view.field.length;
        int y = view.field[0].length;

        i++;
        if (i % min(x, y) == 0) {
            return lastMove;
        }

        switch (lastMove) {
            case UP:
            case DOWN:
                return whenVertical.get(random.nextInt(whenVertical.size()));
            case LEFT:
            case RIGHT:
                return whenHorizontal.get(random.nextInt(whenHorizontal.size()));
        }

        return Move.DOWN;
    }
}
