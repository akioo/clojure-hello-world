(ns tutorial.conditional)



(defn condif
  []
  (println "condif")
  (if (= 5 6) (println "igual") (println "not equals")))
(condif)

(defn condifdo
  []
  (println "condifdo")
  (if (= 5 5)
    (do
      (println "equals")
      (println "doing more things")
      )
    (do
      (println "notEquals")
      (println "more things")
      )
    )
  )
(condifdo)


(defn ifnested
  []
  (if ( and (= 5 5) (or (= 2 2) (not true)))
    (println "true")
    (println "false"))
  )
(ifnested)

(defn condCase
  []
  (def pet "cat2")
  (case pet
        "cat" (println "case")
        "dog" (println "case2")
    )
  )
(condCase)

(defn condcond
  [toTest]
  (cond
    (< toTest 2) (println "MENOR = 2")
    (> toTest 2) (println "Maior = 2")
    :else (println "NAO SEI")
    ))