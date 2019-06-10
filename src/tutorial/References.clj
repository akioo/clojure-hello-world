(ns tutorial.References)

(defn reference
  []
  (def amount (ref 100))
  (println @amount)

  (dosync
    (ref-set amount 1000)
    )
  (println @amount)

  (dosync
    (alter amount inc)
    (alter amount (fn [x] (* x 2)))
    (alter amount #(* %1 100))
    )

  (println @amount)
  )

(reference)