(ns tictactoe.events
  (:require [tictactoe.state :refer [app-state]]
            [tictactoe.board :as board]))

(defn position-clicked
  [x y]
  (swap! app-state board/move x y))

(defn reset-board []
  (reset! app-state (board/create)))
