package com.lineate.xonix.mind;

import com.lineate.xonix.mind.model.GameStateView;
import com.lineate.xonix.mind.model.Move;

public interface Strategy {
    Move resolve(GameStateView view, Move lastMove);
}
