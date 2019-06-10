(ns tutorial.looooops)


(defn Loop
  []
  (println "\n loop")
  (loop [x 0]
        (when (< x 10)
          (println "acontecendo" x)
          (recur (inc x))
          ))
  )
(Loop)


(defn DoTimes
  []
  (println "\nDotimes")
  (dotimes [x 10]
    (println x)
    )
  )

(DoTimes)


(defn WhileDo
  [count]
  (println "\nWhile do")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)))
  )
(WhileDo 10)

(defn DoSeq
  [seq]
  (println "\nDoSec")
  (doseq [x seq]
    (do
      (println "oi")
      (println (inc x))
      )
    )
  )
(DoSeq [1212 121 321 2123 121 54 54 5])