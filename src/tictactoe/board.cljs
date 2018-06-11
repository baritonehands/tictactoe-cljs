(ns tictactoe.board)

(defn create []
  {:player :x
   :grid (vec (repeat 3 (vec (repeat 3 :empty))))})

(defn at [board x y]
  (get-in board [:grid y x]))

(defn empty-at? [board x y]
  (= :empty (at board x y)))

(defn next-player [player]
  (if (= :x player) :o :x))

(defn combos [board]
  (let [[[a b c] [d e f] [g h i]] (:grid board)]
    [[a b c] [d e f] [g h i] ; Rows
     [a d g] [b e h] [c f i] ; Cols
     [a e i] [c e g]])) ; Diags

(defn combo-winner [[x y z]]
  (if (= x y z)
    x
    :empty))

(defn winner [board]
  (->> (combos board)
       (map combo-winner)
       (filter #(not= :empty %))
       (first)))

(defn move [board x y]
  (if (and (empty-at? board x y)
           (not (winner board)))
    (-> (update board :player next-player)
        (assoc-in [:grid y x] (:player board)))
    board))
