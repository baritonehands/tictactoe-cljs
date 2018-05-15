(ns reveal.slides
  (:require [clojure.string :as s]))

(def slide-1
  [:section
   [:h1 "ClojureScript + React"]
   [:p "Brian Gregg"]
   [:a {:href "https://baritonehands.github.io/tictactoe-cljs"} "baritonehands.github.io/tictactoe-cljs"]])

(def slide-2
  [:section
   [:h2 "What is Clojure?"]
   [:ul
    [:li "A dynamically typed functional language that targets the JVM"]
    [:li "A dialect of LISP"]
    [:li "Homoiconic (code is data)"]]])

; (def slide-3
;   [:section
;    [:h2 "Live Code Editing"]
;    [:p "You can define snippets for live editing"]
;    [:klipse-snippet {:data-language "clojure"
;                      :data-height   300}
;     (s/join "\n"
;       ["(defn sum [xs]"
;        "   (reduce + xs))"
;        ""
;        "(sum (range 0 100))"])]])

(def slide-3
  [:section
   [:h2 "What is ClojureScript?"]
   [:ul
    [:li
     [:span "A dynamically typed functional language that targets "]
     [:s "the JVM"]
     [:span " JavaScript"]]
    [:li "A dialect of LISP"]
    [:li "Homoiconic (code is data)"]]])

(def slide-4
  [:section
   [:h2 "Why ClojureScript?"]
   [:ul {:style "font-size: 36px"}
    [:li "None of the JavaScript warts"]
    [:li "Immutable, persistent data structures at the core"]
    [:li "Well designed state management primitives"]
    [:li "(R)ead (E)val (P)rint (L)oop for a tight feedback loop"]
    [:li "Powerful features: macros, custom literals, destructuring, OO + more polymorphism constructs"]]])

(def slide-5
  [:section
   [:h2 "ClojureScript Literals"]
   [:pre
    (for [code ["3 ;number"
                " \\c \\h \\a \\r"
                "\"a string\""
                " #\"regex literal\""
                "  '(\"A\" \"list\")"
                " [\"A\" \"vector\"]"
                " :a-keyword"
                " {:key \"map\" :key2 \"value\"}"
                " #{:a \"mixed\" :set}"]]
      [:code.hljs.clojure code])]])

(defn highlight [& args]
  [:pre {:style "width: 50%; float:left;"}
   (for [code args]
     [:code.hljs.clojure code "\n"])])

(def slide-6
  [:section
   [:h2 "ClojureScript Forms"]
   (highlight "(def var-name \"value\");global"
              (s/join "\n"
                ["(let [var-name 42 ;locals "
                 "      other [\"foo\" \"bar\"]]"
                 "  ;vars accessible here"
                 ") "])
              (s/join "\n"
                ["(fn [arg1 arg2 & more] "
                 "  ;function body)"
                 "#(some-fn %1 %2) ;short syntax"]))
   (highlight "(my-fn arg1 arg2) ;call my-fn "
              (s/join "\n"
                ["(if (test?) "
                 "  ;then"
                 "  ;else"
                 ") "])
              (s/join "\n"
                ["(loop [var-name []]"
                 "  (recur"
                 "    (my-fn var-name 42)))"]))])

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   slide-2
   slide-3
   slide-4
   slide-5
   slide-6])
