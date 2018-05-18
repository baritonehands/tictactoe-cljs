(def var-name "value");global  

(let [var-name 42 ;locals 
      other ["foo" "bar"]]
  ;vars accessible here
  )  
(fn [arg1 arg2 & more] 
  ;function body 
  )
#(some-fn %1 %2);short syntax
