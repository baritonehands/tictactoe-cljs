(ns user
  "This namespace is loaded automatically from the compiler REPL"
  (:require [shadow.cljs.devtools.api :as shadow]))

(defn cljs-repl
  "Connect to browser's CLJS REPL via Proto-REPL"
  []
  (shadow/nrepl-select :app))
