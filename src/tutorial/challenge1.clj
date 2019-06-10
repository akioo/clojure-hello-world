(ns tutorial.challenge1
  (:gen-class))

(defn petAge
  [x]
  {'dog (* 7 x) 'cat (* 5 x) 'fish (* 10 x)}
  )


(defn petTypeRatio
  [type]
  (def petRatio {'dog 7, 'cat 5,'fish 10})
  (get petRatio type))

(defn humanAge
  [petName petType petAge]
  (def ratio (petTypeRatio petType))
  (print "Pet name: " petName " Human age: " (* ratio petAge) ) )
