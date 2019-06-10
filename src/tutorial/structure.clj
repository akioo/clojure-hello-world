(ns tutorial.structure)

(defn Pets
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "cat" "preta"))
  (println myPet)

  (def myOtherPet (struct-map pet :PetName "preta2" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myPet))
  (println (:PetName myOtherPet))

  (def myNewPet (assoc myPet :PetName "Max"))
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :PetAge 2))
  (println myNewOtherPet)
  )
(Pets)