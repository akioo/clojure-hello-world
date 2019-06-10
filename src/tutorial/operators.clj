(ns tutorial.operators
  (:gen-class))


(defn operators
  []
  (println (+ 1 2))
  (println (- 1 2))
  (println (* 2 12))
  (println (/ 12 2))
  (println "LIKE ++" (inc 2))
  (println "LIKE --" (dec 2))
  (println "MAX" (max 2 4 5 6 11))
  (println "MIN" (min 2 4 5 6 11))
  (println "%" (rem 5 3))

  )

(defn relational
  []
  (println (= 2 2))
  (println (not= 2 2)))


(defn logical
  []
  (println (and true true))
  (println (or true true))
  (println (not (= 1 1)))
  )

(defn bitwise
  []
  (println (bit-and 1 1 1))
  (println (bit-or 1 0 1))
  (println (bit-xor 0 0))
  (println (bit-and-not 1 0))
  (println (bit-not 100)))

(defn operatorPrecedence
  []
    (println (- (/ (+ 2 5)3)1)))

(operators)
(relational)
(logical)
(bitwise)
(operatorPrecedence)