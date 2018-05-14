(ns tictactoe.events
  (:require [tictactoe.state :refer [app-state]]
            [tictactoe.board :refer [move create]]))

(defn position-clicked
  [x y]
  (swap! app-state move x y))

(defn reset-board []
  (reset! app-state (create)))
