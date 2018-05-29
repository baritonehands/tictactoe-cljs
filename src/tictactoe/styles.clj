(ns tictactoe.styles
  (:require [clojure.java.io :as io]
            [garden.core :refer [css]]
            [garden.units :as u]
            [garden.color :as color]))

(defn build []
  (io/make-parents "public/css/style.css")
  (css
    {:output-to "public/css/style.css"
     :pretty-print? false}
    [:body {:font-family "-apple-system, BlinkMacSystemFont, \"Segoe UI\", \"Roboto\", \"Oxygen\", \"Ubuntu\", \"Cantarell\", \"Fira Sans\", \"Droid Sans\", \"Helvetica Neue\", sans-serif"
            :color "#666"
            :font-size (u/px 18)
            :line-height (u/px 28)}]

    [:div
     [:.banner {:text-align :center}]]

    [:.banner
     [:h1 {:font-size (u/px 34)
           :-webkit-font-smoothing :antialiased
           :margin 0
           :line-height (u/px 48)
           :font-weight :bold}]
     [:p {:margin "10px 0 5px"}]]

    [:.board
     [:table {:border-collapse :collapse
              :width (u/px 300)
              :height (u/px 300)
              :margin "0 auto"}]

     [:td {:border {:width (u/px 1)
                    :style :solid
                    :color "#666"}
           :color "#666"
           :cursor :pointer
           :width (u/percent 33.33)
           :height (u/percent 33.33)
           :text-align :center
           :font-size (u/px 48)
           :padding 0}
      [:&:hover {:background-color "#CCC"}]]]

    [:.reset {:text-align :center
              :padding (u/px 20)}]

    [:.btn {:border {:width (u/px 1)
                     :style :solid
                     :color "#666"
                     :radius (u/px 10)}
            :color "#666"
            :font-size (u/px 24)}]))
