(ns tutorial.exception)


(defn ExHandling
  [x]
  (try
    (inc x)
    ;(catch ClassCastException e (println "Caught Exception " (.getMessage e)))
    (catch Exception e (println "Caught Exception " (.getMessage e)))
    (finally (println "JAJAJAJAJ"))
    )
  )

(ExHandling "a")