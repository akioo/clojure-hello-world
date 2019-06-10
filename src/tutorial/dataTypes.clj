(ns tutorial.dataTypes
  (:gen-class))

;some data types
(defn data_types
  []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "STRING")
  (def h 'thanks)

  (def A 2)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  (println A)

  )

(defn moreDataTypes
  "all imutables"
  []
  (println "set" #{1 2 3 4 "pet" 'cat 55})
  (println "map" {:key "value" 1 2 "key" "value" 'xpto (defn a [] 1)})
  (println "vector" [1 2 3 1 1 1 1 1 "poet" 'pen])
  (println "list" '(1 2 3 4 5 6 1 1 1 "aaaaa" (1 2 34 ) (defn foo [] 1))))
(data_types)
(moreDataTypes)