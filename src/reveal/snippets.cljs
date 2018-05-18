(ns reveal.snippets
  (:require-macros [hiccups.core :as hiccups :refer [html]])
  (:require [ajax.core :refer [GET]]
            [clojure.string :as s]))

(defn fetch [name cb]
  (GET (str "/snippets/" name ".cljs")
       {:response-format :text
        :handler cb}))

(defn render
  ([id] (render id id))
  ([name id]
   (fetch
     name
     (fn [resp]
       (let [elem (.getElementById js/document id)
             lines (for [code (s/split resp #"\n")]
                     [:code.hljs.clojure code "\n"])]
         (set! (.-innerHTML elem) (html lines)))))))
