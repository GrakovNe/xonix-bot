package com.lineate.xonix.mind.strategies;

import com.lineate.xonix.mind.Strategy;
import com.lineate.xonix.mind.model.Cell;
import com.lineate.xonix.mind.model.CellType;
import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

public class AttackStrategy implements Strategy {
    @Override
    public Move resolve(GameStateView view, Move lastMove) {
        return getEnemyTail(view, lastMove);
    }

    private Move getEnemyTail(GameStateView view, Move lastMove) {
        int myColumn = view.head.getCol();
        int myRow = view.head.getRow();

        for (int i = 0; i < view.field[0].length; i++) {
            for (int j = 0; j < view.field.length; j++) {
                Cell cell = view.field[i][j];

                if (cell.getCellType().equals(CellType.TAIL)) {
                    if (cell.getBotId() == view.botId) {
                        return lastMove; //todo: add corner check
                    }

                    if (myColumn < i) {
                       return Move.LEFT;
                    }

                    if (myRow < j) {
                        return Move.UP;
                    }

                    if (myRow > j) {
                        return Move.DOWN;
                    }

                    if (myColumn > i) {
                        return Move.RIGHT;
                    }
                }


            }
        }


        return Move.DOWN;
    }
}
