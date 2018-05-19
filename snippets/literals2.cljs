; Maps support any key type
{"stringKey" :keyword-value
 42 "meaning of life", ; Commas are optional whitespace
 [4 :foo] "yes vectors too"
 {:even-maps? true} "you bet"}

; Keywords are namespaced
{:my.namespace/name "Brian"
 :name "No collision here"}
