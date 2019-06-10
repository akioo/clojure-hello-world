(ns tutorial.Watcher)

(defn Watch
  []
  (def x (atom 5))
  (add-watch x :xWatch (fn [key atom old-state new-state]
                         (println key)
                         (println atom)
                         (println old-state)
                         (println new-state)
                         (reset! x 10)
                         ))
  (swap! x (fn [x] (* x 10)))
  (remove-watch x :xWatch)
  (reset! x 10)
  )
(Watch)