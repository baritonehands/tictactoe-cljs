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
   [:section
    [:h2 "Literals"]
    [:pre#literals1]]
   [:section
    [:h2 "Literals Cont."]
    [:pre#literals2]]])

(def slide-6
  [:section
   [:section
    [:h2 "Forms"]
    [:pre#forms1 {:style "width: 50%; float:left;"}]
    [:pre#forms2 {:style "width: 50%; float:left;"}]]
   [:section
    [:h2 "Forms Cont."]
    [:klipse-snippet {:data-language "clojure"
                      :data-height   300
                      :data-src      "forms3"}]]])

(def slide-7
  [:section
   [:h2 "JavaScript Interop"]
   [:klipse-snippet {:data-language "clojure"
                     :data-height   500
                     :data-src      "interop"}]])

(def slide-8
  [:section
   [:h2 "And a whole lot more..."]
   [:ul
    [:li "Destructuring maps and vectors"]
    [:li "Protocols for OO style inheritance"]
    [:li "Multi-methods for multiple dispatch polymorphism"]]])

(def slide-9
  [:section
   [:h1 "DEMO"]])

(def slide-10
  [:section
   [:h2 "ClojureScript Resources"]
   [:ul {:style "font-size: 36px;"}
    [:li [:a {:href "https://github.com/baritonehands/tictactoe-cljs"} "https://github.com/baritonehands/tictactoe-cljs"]]
    [:li [:a {:href "https://clojurescript.org/"} "https://clojurescript.org/"]]
    [:li "Slack: #clojurescript on " [:a {:href "https://clojurians.slack.com"} "clojurians"]]]])

(defn baby-slide [& [title]]
  [:section
   (if title
     [:h2 title] "")
   [:img {:src "images/baby_cljs.png"
          :style "transform: scale(0.5); transform-origin: top;"}]])

(defn all []
  [slide-1
   slide-2
   slide-3
   slide-4
   (baby-slide)
   slide-5
   slide-6
   slide-7
   slide-8
   (baby-slide)
   slide-9
   slide-10
   (baby-slide "Thank You")])
