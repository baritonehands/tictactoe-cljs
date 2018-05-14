(ns tictactoe.views
  (:require [tictactoe.state :refer [app-state]]
            [tictactoe.events :refer [position-clicked reset-board]]
            [tictactoe.board :as board]))

(defn player [p]
  (if (not= :empty p)
    [:span (.toUpperCase (name p))]))

(defn header
  []
  (let [board @app-state]
    [:div.banner
     [:h1 "Tic Tac Toe"]
     (if (board/winner board)
       [:h2 "Winner: " [player (board/winner board)]]
       [:p "Current player: " [player (:player board)]])]))

(defn board
  []
  (let [board @app-state]
    [:div.board
     [:table>tbody
      (for [y (range 0 3)]
        [:tr {:key y}
         (for [x (range 0 3)]
           [:td {:key x
                 :on-click #(position-clicked x y)}
            [player (board/at board x y)]])])]]))

(defn reset []
  [:div.reset
   [:button.btn {:on-click reset-board
                 :type "button"}
                "Reset"]])

(defn app []
  [:div
   [header]
   [board]
   [reset]])
