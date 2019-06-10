(ns tutorial.challenge2)


(defn challenge2
  [coupon budget]
  (def cars {:bmw 60000, :ferrari 100000, :fiat 20000})
  (def priceDiscount (fn [price] (if (isValidCode coupon ) (* price (:Discount validCoupon) budget))))

  ;(println ((map #(priceDiscount (second %)) cars)))

  (println (filter #(<= %2 netBudget) (map (fn [[key value]] {key (priceDiscount value)} ) cars)))
  )


(defn isValidCode
  [coupon]
  (defstruct coupons :Name :Discount)
  (def validCoupon (struct coupons "20Percent" 0.8))
  (= coupon (:Name validCoupon))
  )

(defn challenge
  [coupon budget]
  (if (isValidCode coupon)
    (println "Valid coupon" (:Discount validCoupon))
    (println "NOT VALID"))
  )