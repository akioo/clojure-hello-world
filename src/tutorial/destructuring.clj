(ns tutorial.destructuring)

(defn Destruct
  []
  (def myVect [1 2 3 4 5])
  (let [[a b c] myVect] (println a b c))
  (let [[a b & rest] myVect] (println a b rest))

  (def myMap {'name "Akio", 'lastname "Oshiro"})
  (let [{a 'name b 'lastname} myMap] (println a b))
  (let [{a 'name b 'lastname c 'teste} myMap] (println a b c)))


(Destruct)