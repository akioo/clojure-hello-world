(ns tutorial.Namespaces
  (:require [
             clojure.string :refer [capitalize upper-case]
             ]))

(defn -main
  []
  (println (upper-case "hello"))
  (println (capitalize "hello"))
  (println (capitalize "hello"))
  )

(-main)