(ns scratch
  (:require [tictactoe.board :as board]
            [tictactoe.state :as state]))

(-> (board/create)
    (board/move 1 1)
    (board/move 0 0))

(deref state/app-state)
