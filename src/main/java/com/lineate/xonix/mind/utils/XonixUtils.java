package com.lineate.xonix.mind.utils;

import com.lineate.xonix.mind.model.GameStateView;

public class XonixUtils {

    public static boolean isCorner(GameStateView view) {
        int rows = view.field.length;
        int cols = view.field[0].length;

        int myCol = view.head.getCol();
        int myRow = view.head.getRow();

        return myCol == cols || myRow == rows;
    }
}
