(ns tictactoe.board)

(defn create []
  {:player :x
   :grid (mapv #(vec (repeat 3 :empty)) (range 0 3))})

(defn at [board x y]
  (get-in board [:grid y x]))

(defn empty? [board x y]
  (= :empty (at board x y)))

(defn next-player [player]
  (if (= :x player) :y :x))

(defn row [board n]
  (get-in board [:grid n]))

(defn col [board n]
  (mapv #(get % n) (:grid board)))

(defn combos [board]
  (concat (map #(row board %) (range 0 3))
          (map #(col board %) (range 0 3))
          [(mapv #(apply at board %) [[0 0] [1 1] [2 2]])]
          [(mapv #(apply at board %) [[2 0] [1 1] [0 2]])]))                             

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
  (if (and (empty? board x y)
           (not (winner board)))
    (-> (update board :player next-player)
        (assoc-in [:grid y x] (:player board)))
    board))
