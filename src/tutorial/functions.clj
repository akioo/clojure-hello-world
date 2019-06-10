(ns tutorial.functions
  (:gen-class))

(defn -main
  "Posso colocar coisas aqui para descrever funções"
  []
  (println "My name is Akio")
  (println "Clojure is weird")
  (+ 2 5))

;ANOTHER DEF TO FUNCTION
(def increment (fn [x] (+ 1 x)))

;CLOSURE
(defn increment_set
  [x]
  (map increment x))
;ANOTHER DEF
#(println "shorhand function with default " %)


