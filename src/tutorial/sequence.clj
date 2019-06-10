(ns tutorial.sequence
  :require [tutorial.structure :as structure2])


(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)
  (println (cons "yellow" colors))
  (println (cons colors "pink"))


  (println (conj colors "yellow"))
  (println (conj ["red", "green", "blue"] "yellow"))
  (println (conj {:red "red", :blue "blue"} {:green, "green"}))
  (println (concat colors (seq ["black", "white"])))
  (println (distinct (seq ["black" "black", "white"])))
  (println (reverse (seq ["black" "black", "white"])))
  (println (first (seq ["black" "black", "white"])))
  (println (rest (seq ["black" "black", "white"])))
  (println (last (seq ["black" "black", "white"])))
  (println (sort (seq ["black" "z" "black", "white"])))
  (println (
             reverse (
                       sort (
                              seq [1 4 42 9 1 23 54 5 39 3 1 2332 ]))))
  )

(Seq)