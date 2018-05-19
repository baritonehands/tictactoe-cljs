(def foo #js {:key "value"
              "stringKey" 1234})

(def obj #js {:myFn identity
              :items #js [1 2 3 4]})

(println foo)
(println (js->clj foo)) ; Data conversion
(println (str "Value for key is \"" (.-key foo) "\"")) ; Property access
(println (.myFn obj (range 0 5))) ; Function property access
(.getElementById js/document "foo") ; Global js variable
