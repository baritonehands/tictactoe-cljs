(ns tictactoe.state
  (:require [reagent.core :refer [atom]]
            [tictactoe.board :as board]))

(defonce app-state (atom (board/create)))
