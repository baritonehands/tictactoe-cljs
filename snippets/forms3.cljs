(defn hello [name]
  ; Equivalent to (def hello (fn [name] ...))
  (println (str "Hello, " name "!"))
  "last expression is returned")

(hello "Brian")
